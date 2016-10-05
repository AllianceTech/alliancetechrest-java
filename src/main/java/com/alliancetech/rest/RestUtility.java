package com.alliancetech.rest;

import com.google.gson.Gson;
import org.apache.http.*;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.client.params.AllClientPNames;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.util.EntityUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/**
 * Alliance Tech REST API client
 */
public class RestUtility {
    private static final String CHARSET = "UTF-8";
    private static final int DEFAULT_CONNECTION_TIMEOUT = (10 * 1000); // milliseconds
    private static final int DEFAULT_SOCKET_TIMEOUT = (30 * 1000); // milliseconds
    private HttpClient caHTTPClient;
    private String csHostname;
    private String csPassword;
    private String csUsername;

    public RestUtility(String asHostname) {
        initialize(null, null, asHostname);
    }

    public RestUtility(String asUsername, String asPassword, String asHostname) {
        initialize(asUsername, asPassword, asHostname);
    }

    /**
     * Constructor.
     *
     * @param asUsername   String
     * @param asPassword   String
     * @param asHostname   String
     * @param aaHTTPClient HttpClient
     */
    public RestUtility(String asUsername, String asPassword, String asHostname,
                       HttpClient aaHTTPClient) {
        initialize(asUsername, asPassword, asHostname);
        initializeHttpClient(aaHTTPClient);
    }

    /**
     *
     * @param asUsername
     * @param asPassword
     * @param asHostname
     */
    protected void initialize(String asUsername, String asPassword, String asHostname) {
        this.csUsername = asUsername;
        this.csPassword = asPassword;
        this.csHostname = asHostname;
    }

    /**
     * Initializes the HttpClient. If aaHTTPClient is null, this method creates one.
     * @param aaHTTPClient An HTTPClient to use, or null if we should create one.
     */
    protected void initializeHttpClient(HttpClient aaHTTPClient) {
        if (aaHTTPClient == null) {
            this.caHTTPClient = createHttpClient();
            setSocketTimeout(DEFAULT_SOCKET_TIMEOUT);
            setConnectionTimeout(DEFAULT_CONNECTION_TIMEOUT);
        } else {
            this.caHTTPClient = aaHTTPClient;
        }
    }

    protected String addParameters(String path, Map<String, String> parameters) {
        if (path == null) {
            path = "";
        }
        StringBuffer sb = new StringBuffer(path);
        if (parameters != null && parameters.size() > 0) {
            try {
                boolean hasParameters = path.indexOf("?") >= 0;
                if (!hasParameters) {
                    sb.append('?');
                }
                for (String key : parameters.keySet()) {
                    String value = parameters.get(key);
                    sb.append(URLEncoder.encode(key, "UTF-8"));
                    sb.append('=');
                    sb.append(URLEncoder.encode(value, "UTF-8"));
                    sb.append('&');
                }
                sb.deleteCharAt(sb.length() - 1);// remove last '&'
            } catch (UnsupportedEncodingException aeEx) {
                throw new RuntimeException("Unsupported encoding", aeEx);
            }
        }
        return sb.toString();
    }

    protected void checkResponse(HttpRequest request, HttpResponse response) {
        boolean hasError = false;

        try {
            StatusLine status = response.getStatusLine();
            int statusCode = status.getStatusCode();

            if (statusCode == 404) {
                hasError = true;
                throw new NotFoundException(status.getReasonPhrase());
            } else if ((statusCode < 200) || (statusCode > 299)) {
                hasError = true;
                StringBuilder msg = new StringBuilder();
                msg.append("statusCode=" + statusCode);
                msg.append("\n");
                msg.append("method=" + request.getRequestLine().getMethod());
                msg.append("\n");
                msg.append(request.getRequestLine().getUri());
                HttpEntity responseEntity = response.getEntity();

                try {
                    String responseBody = EntityUtils.toString(responseEntity);
                    msg.append("\n");
                    msg.append("responseBody=" + responseBody);
                } catch (Exception ignored) {
                    // ignored
                }

                throw new RuntimeException("unexpected response\n" + msg);
            }
        } finally {
            if (hasError) {
                close(response);
            }
        }
    }

    private void close(final HttpEntity responseEntity) {
        if (responseEntity != null) {
            try {
                responseEntity.consumeContent();
            } catch (Exception ignored) {
                // ignored
            }
        }
    }

    private void close(final HttpResponse resp) {
        if (resp != null) {
            try {
                close(resp.getEntity());
            } catch (Exception ignored) {
                // ignored
            }
        }
    }

    protected HttpClient createHttpClient() {
        DefaultHttpClient client = new DefaultHttpClient();
        client.getParams().setParameter(AllClientPNames.USER_AGENT,
                "alliancetechrest-java library");
        if (UtilityMethods.isValidString(getUsername())
                && UtilityMethods.isValidString(getPassword())) {
            CredentialsProvider credProvider = new BasicCredentialsProvider();
            credProvider.setCredentials(new AuthScope(getHost(getHostname()),
                    AuthScope.ANY_PORT), new UsernamePasswordCredentials(getUsername(),
                    getPassword()));
            client.setCredentialsProvider(credProvider);
        }
        return client;
    }

    private HttpDelete createHttpDelete(final String path) {
        HttpDelete delete = new HttpDelete(getUrlForPath(path));
        return delete;
    }

    protected HttpGet createHttpGet(String path) {
        HttpGet get = new HttpGet(this.getUrlForPath(path));
        return get;
    }

    private HttpPost createHttpPost(final String path) {
        String url = getUrlForPath(path);

        HttpPost post = new HttpPost(url);

        return post;
    }

    protected HttpPut createHttpPut(String path) {
        HttpPut put = new HttpPut(getUrlForPath(path));
        return put;
    }

    protected void delete(final String path) {
        HttpDelete delete = createHttpDelete(path);
        execute(delete);
    }

    protected <T> T delete(final String path, final Class<T> responseType) {
        HttpDelete delete = createHttpDelete(path);
        HttpResponse response = execute(delete);

        if (responseType == null) {
            return null;
        } else {
            return fromJson(response, responseType);
        }
    }

    protected <T> T delete(final String path, final Class<T> responseType,
                           final Map<String, String> parameters) {
        HttpDelete delete = createHttpDelete(addParameters(path, parameters));
        HttpResponse response = execute(delete);

        if (responseType == null) {
            return null;
        } else {
            return fromJson(response, responseType);
        }
    }

    protected String encode(String s) {
        try {
            return URLEncoder.encode(s, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    protected HttpResponse execute(HttpRequestBase method) {
        try {
            method.setHeader(new BasicHeader("Accept", "application/json"));
            method.setHeader("Content-Type", "application/json; charset=UTF-8");

            HttpResponse rsp = getHttpClient().execute(method);
            checkResponse(method, rsp);
            return rsp;
        } catch (RuntimeException rtex) {
            throw rtex;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    protected <T> T fromJson(HttpResponse rsp, Class<T> clazz) {
        if (clazz == null) {
            return null;
        }

        if (rsp.getEntity() == null) {
            return null;
        }

        try {
            String responseBody = EntityUtils.toString(rsp.getEntity());
            return fromJson(responseBody, clazz);
        } catch (RuntimeException rtex) {
            throw rtex;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            close(rsp);
        }
    }

    protected <T> T fromJson(final String json, final Class<T> clazz) {
        Gson gson = GsonFactory.create();
        return gson.fromJson(json, clazz);
    }

    protected <T> T get(final Class<T> clazz, final String path,
                        final Map<String, String> parameters) {
        HttpGet get = createHttpGet(addParameters(path, parameters));
        HttpResponse rsp = this.execute(get);

        return fromJson(rsp, clazz);
    }

    protected <T> T get(final Class<T> clazz, final String path,
                        final String... parameters) {
        HttpGet get = createHttpGet(path);

        HttpResponse rsp = this.execute(get);

        return fromJson(rsp, clazz);
    }

    /**
     * Will take a url such as http://www.stackoverflow.com and return
     * www.stackoverflow.com
     *
     * @param url URL
     * @return String
     */
    protected String getHost(String url) {
        if (url == null || url.length() == 0)
            return "";

        int doubleslash = url.indexOf("//");
        if (doubleslash == -1)
            doubleslash = 0;
        else
            doubleslash += 2;

        int end = url.indexOf('/', doubleslash);
        end = end >= 0 ? end : url.length();

        return url.substring(doubleslash, end);
    }

    protected String getHostname() {
        return csHostname;
    }

    protected HttpClient getHttpClient() {
        if (this.caHTTPClient == null) {
            this.caHTTPClient = createHttpClient();
        }
        return this.caHTTPClient;
    }

    public String getMessageBody(String messageBodyUrl) {
        return getString(messageBodyUrl);
    }

    protected String getPassword() {
        return this.csPassword;
    }

    protected String getString(final String path, final String... parameters) {
        HttpGet get = createHttpGet(path);

        HttpResponse rsp = this.execute(get);

        return toString(rsp);
    }

    protected String getUrlForPath(final String path) {
        if (path.startsWith("http://") || (path.startsWith("https://"))) {
            return path;
        } else if (getHostname().startsWith("http://")
                || (getHostname().startsWith("https://"))) {
            return getHostname() + path;
        } else {
            return "http://" + getHostname() + path;
        }
    }

    protected String getUsername() {
        return this.csUsername;
    }

    protected void post(String path, Object requestBodyObject) {
        post(path, requestBodyObject, null);
    }

    protected <T> T post(final String path, final Object obj, final Class<T> responseType) {
        HttpPost post = createHttpPost(path);

        if (obj != null) {
            post.setEntity(toJsonEntity(obj));
        }

        HttpResponse response = execute(post);

        if (responseType == null) {
            return null;
        } else {
            return fromJson(response, responseType);
        }
    }

    protected void put(String path) {
        put(path, null);
    }

    protected void put(String path, Object requestBodyObject) {
        HttpPut put = createHttpPut(path);

        if (requestBodyObject != null) {
            put.setEntity(toJsonEntity(requestBodyObject));
        }

        execute(put);
    }

    public void setConnectionTimeout(int milliseconds) {
        getHttpClient().getParams().setIntParameter(AllClientPNames.CONNECTION_TIMEOUT,
                milliseconds);
    }

    public void setSocketTimeout(int milliseconds) {
        getHttpClient().getParams().setIntParameter(AllClientPNames.SO_TIMEOUT,
                milliseconds);
    }

    public void setUserAgent(String agentString) {
        if (agentString == null) {
            this.getHttpClient().getParams().removeParameter(AllClientPNames.USER_AGENT);
        } else {
            this.getHttpClient().getParams()
                    .setParameter(AllClientPNames.USER_AGENT, agentString);
        }
    }

    public void shutdown() {
        if (this.getHttpClient() != null) {
            try {
                this.getHttpClient().getConnectionManager().shutdown();
            } catch (Exception ignored) {
                // ignored
            }
        }
    }

    protected <T> String toJson(final T object) {
        if (object == null) {
            throw new IllegalArgumentException("object parameter is null");
        }

        Gson gson = GsonFactory.create();
        return gson.toJson(object);
    }

    protected HttpEntity toJsonEntity(final Object obj) {

        String json = toJson(obj);

        try {
            return new JsonEntity(json);
        } catch (Exception ex) {
            Class clazz = null;
            if (obj != null) {
                clazz = obj.getClass();
            }
            throw new RuntimeException("failure, obj class=" + clazz, ex);
        }

    }

    protected String toString(HttpResponse rsp) {
        try {
            return EntityUtils.toString(rsp.getEntity());
        } catch (java.io.IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            close(rsp);
        }
    }

    static private class JsonEntity extends StringEntity {
        public JsonEntity(String jsonString) throws UnsupportedEncodingException {
            super(jsonString, CHARSET);
        }

        @Override
        public Header getContentType() {
            return new BasicHeader("Content-Type", "application/json");
        }

    }
}
