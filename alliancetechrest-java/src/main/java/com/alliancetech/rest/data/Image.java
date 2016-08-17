package com.alliancetech.rest.data;

import com.google.gson.annotations.SerializedName;

/*
 * Image.java
 * 
 * (c) Alliance Tech 2011.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * Jeff S.		Oct 31, 2013		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * The RESTAPI image data object.
 *
 * @author Jeff Seifert<br>
 *         Creation Date: Oct 31, 2013 9:20:00 AM
 * @version Ver 1.0 Jul 12, 2011
 */
public class Image {
    @SerializedName("encodeddata")
    private String encodedData;
    @SerializedName("fileName")
    private String fileName;
    @SerializedName("height")
    private int height;
    @SerializedName("id")
    private String imageId;
    @SerializedName("lastModified")
    private String lastModified;
    @SerializedName("parentId")
    private String parentId;
    @SerializedName("url")
    private String url;
    @SerializedName("usage")
    private String usage;
    @SerializedName("width")
    private int width;

    /**
     * Gets the Image Encoded Data.
     *
     * @return String
     */
    public String getEncodedData() {
        return encodedData;
    }

    /**
     * Set the Image Encoded Data.
     *
     * @param encodeddata String
     */
    public void setEncodedData(String encodeddata) {
        this.encodedData = encodeddata;
    }

    /**
     * Get the File Name.
     *
     * @return String
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * Sets the File Name.
     *
     * @param filename String
     */
    public void setFileName(String filename) {
        this.fileName = filename;
    }

    /**
     * Gets the Height.
     *
     * @return int
     */
    public int getHeight() {
        return height;
    }

    /**
     * Sets the Height.
     *
     * @param height int
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * Gets the Image Id.
     *
     * @return String
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * Sets the Image Id.
     *
     * @param imageId String
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * Gets the LastModified.
     *
     * @return String
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * Sets the LastModified.
     *
     * @param lastModified String
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * Gets the Parent Id.
     *
     * @return String
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * Sets the Parent Id.
     *
     * @param parentId String
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * Get the Url.
     *
     * @return String
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the Url.
     *
     * @param url String
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get the Usage.
     *
     * @return String
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the Usage.
     *
     * @param usage String
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }

    /**
     * Gets the Width.
     *
     * @return int
     */
    public int getWidth() {
        return width;
    }

    /**
     * Sets the Width.
     *
     * @param width int
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Image [encodedData=");
        builder.append(encodedData);
        builder.append(", fileName=");
        builder.append(fileName);
        builder.append(", height=");
        builder.append(height);
        builder.append(", imageId=");
        builder.append(imageId);
        builder.append(", lastModified=");
        builder.append(lastModified);
        builder.append(", parentId=");
        builder.append(parentId);
        builder.append(", url=");
        builder.append(url);
        builder.append(", usage=");
        builder.append(usage);
        builder.append(", width=");
        builder.append(width);
        builder.append("]");
        return builder.toString();
    }
}
