alliancetechrest-java
=====================

Alliance Tech's REST API Java Wrapper

Example:

  	try
		{
			AllianceTechRestClient laClient = new AllianceTechRestClient("username",
					"password", "http://domain.com");
			RegistrantList laRegList = laClient.getRegistrantList(10, null);
			System.out
					.println(laRegList != null && laRegList.getRegistrantList() != null ? laRegList
							.getRegistrantList().size() : 0);
		}
		catch (Exception aeEx)
		{
			aeEx.printStackTrace();
		}

Include JAR's (Not concerned with versions):
commons-codec-1.4.jar
commons-logging-1.1.1.jar
gson-1.7.1.jar
httpclient-4.1.1.jar
httpclient-cache-4.1.1.jar
httpcore-4.1.jar
httpmime-4.1.1.jar
