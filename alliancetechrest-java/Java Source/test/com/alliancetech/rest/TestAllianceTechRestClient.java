package test.com.alliancetech.rest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.alliancetech.rest.AllianceTechRestClient;
import com.alliancetech.rest.data.Association;
import com.alliancetech.rest.data.AssociationList;
import com.alliancetech.rest.data.AssociationResponse;
import com.alliancetech.rest.data.AssociationResponseList;
import com.alliancetech.rest.data.Attribute;
import com.alliancetech.rest.data.DefaultResponse;
import com.alliancetech.rest.data.Image;
import com.alliancetech.rest.data.ImageList;
import com.alliancetech.rest.data.PersonalEvent;
import com.alliancetech.rest.data.PersonalEventList;
import com.alliancetech.rest.data.PersonalEventResponse;
import com.alliancetech.rest.data.PersonalEventResponseList;
import com.alliancetech.rest.data.Profile;
import com.alliancetech.rest.data.Registrant;
import com.alliancetech.rest.data.RegistrantList;
import com.alliancetech.rest.data.RegistrantResponse;
import com.alliancetech.rest.data.RegistrantResponseList;
import com.alliancetech.rest.data.Room;
import com.alliancetech.rest.data.RoomList;
import com.alliancetech.rest.data.Session;
import com.alliancetech.rest.data.SessionList;
import com.alliancetech.rest.data.SessionResponse;
import com.alliancetech.rest.data.SessionResponseList;

/*
 * AlliancetechTechRestClientTest.java
 * 
 * (c) Alliance Tech 2012.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	--------------------------------------------
 * GSong		Jan 18, 2012		Created Class.
 * ---------------------------------------------------------------------
 */

/**
 * Test Class for REST Client.
 * 
 * @version Ver # Jan 18, 2012
 * @author Jeff Seifert <br>
 * Creation Date: Jan 18, 2012 12:03:10 PM
 */
@RunWith(JUnit4.class)
public class TestAllianceTechRestClient extends TestCase
{
	private AllianceTechRestClient laClient;

	/**
	 * Tests the association post API.
	 * 
	 * @param aiNumOfRecs int
	 * @return AssociationList
	 */
	private AssociationList associationListPost(int aiNumOfRecs)
	{
		AssociationList laAssocList = genAssocData(aiNumOfRecs);

		// Call the API to post the Association
		AssociationResponseList laAssocResponseList = laClient
				.postAssociations(laAssocList);
		Assert.assertNotNull(laAssocResponseList);
		System.out.println(laAssocResponseList.toString());
		Assert.assertEquals(laAssocResponseList.getStatus(), "SUCCESS");
		// Loop through the responses
		for (AssociationResponse laAssocResponse : laAssocResponseList.getResponseList())
		{
			Assert.assertEquals(laAssocResponse.getStatus(), "SUCCESS");
		}

		return laAssocList;
	}

	/**
	 * Generates an association list with X number of associations.
	 * 
	 * @param aiNumOfRecs int
	 * @return AssociationList
	 */
	private AssociationList genAssocData(int aiNumOfRecs)
	{
		AssociationList laAssocList = new AssociationList();

		for (int i = 0; i < aiNumOfRecs; i++)
		{
			// Build the Association
			Association laAssoc = new Association();
			laAssoc.setRegistrantNum("tst_" + i);
			laAssoc.setEpc("epc_" + i);
			laAssoc.setKill(false);
			laAssoc.setStationName("StationName_" + i);

			laAssocList.getAssociationList().add(laAssoc);
		}

		return laAssocList;
	}

	/**
	 * Genrates a registration list with X number of registrants.
	 * 
	 * @param aiNumOfRecs int
	 * @return RegistrantList
	 */
	private RegistrantList genRegData(int aiNumOfRecs)
	{
		RegistrantList laRegList = new RegistrantList();
		// Only send this if you want to print the badge
		// laRegList.setRfidPrinter("TestPrinter");
		// Put all the attribute that you want control over. This is so
		// we can handle removal of attributes when a registrant is
		// updated and no longer has that attribute.
		laRegList.getAttrName().add("Attendee Status");
		laRegList.getAttrName().add("Attendee Type");
		laRegList.getAttrName().add("Demographic 1");
		laRegList.getAttrName().add("Demographic 2");
		for (int i = 0; i < aiNumOfRecs; i++)
		{
			// Build the registrant
			Registrant laReg = new Registrant();
			laReg.setRegistrantNumber("tst_" + i);
			laReg.setCustomerRegistrantId("tst_" + i);
			laReg.setAdditionalInfo1("AdditionalInfo1_" + i);
			laReg.setAdditionalInfo2("AdditionalInfo2_" + i);
			laReg.setAdditionalInfo3("AdditionalInfo3_" + i);
			laReg.setAdditionalInfo4("AdditionalInfo4_" + i);
			laReg.setAdditionalInfo5("AdditionalInfo5_" + i);
			laReg.setAddress1("Address1_" + i);
			laReg.setAddress2("Address2_" + i);
			laReg.setAltPhone("AltPhone_" + i);
			laReg.setBlogUrl("http://BlogUrl_" + i + ".com");
			laReg.setCity("City_" + i);
			laReg.setCountry("Country_" + i);
			laReg.setCounty("County_" + i);
			laReg.setDepartment("Department_" + i);
			laReg.setDescr("Descr_" + i);
			laReg.setEmail("email_" + i + "@email.com");
			// Not on post
			// laReg.setEventMailName("EventMailName_" + i);
			laReg.setFacebookUrl("http://FacebookUrl_" + i + ".com");
			laReg.setFax("Fax_" + i);
			laReg.setFirst("First_" + i);
			laReg.setiMAccount("IMAccount_" + i);
			laReg.setLast("Last_" + i);
			laReg.setLinkedinUrl("http://LinkedinUrl_" + i + ".com");
			// Don't send login id and password unless you really need
			// it. In the case that it is needed login id must be unique
			// and an email address.
			// laReg.setLoginId("email_" + i + "@email.com");
			laReg.setMobile("Mobile_" + i);
			laReg.setNickName("NickName_" + i);
			laReg.setOptInAttendeeSearch(true);
			laReg.setOptInMsgTickler(true);
			laReg.setOptInRFID(true);
			laReg.setOptInTwitterEnrollment(true);
			laReg.setOptInTwitterSessionAttendance(true);
			laReg.setOrganization("Organization_" + i);
			// Don't send login id and password unless you really need
			// it. In the case that it is needed login id must be unique
			// and an email address.
			// laReg.setPassword("password");
			laReg.setPersonalEmail("PersonalEmail_" + 1 + "@email.com");
			laReg.setPhone("Phone_" + i);
			laReg.setPostalCode("PostalCode_" + i);
			laReg.setPreFix("PreFix_" + i);
			laReg.setRegion("Region_" + i);
			laReg.setTitle("Title_" + i);
			laReg.setTwitterAccount("TwitterAccount_" + i);
			laReg.setUrl("http://Url_" + i + ".com");
			// Add the attributes
			laReg.getAttrList().add(new Attribute("Attendee Status", "Approved"));
			laReg.getAttrList().add(new Attribute("Attendee Type", "Press"));
			laReg.getAttrList().add(new Attribute("Demographic 1", "CFO"));
			laReg.getAttrList().add(new Attribute("Demographic 2", "Delete Me!"));
			// Add the registrant to the list
			laRegList.getRegistrantList().add(laReg);
		}

		return laRegList;
	}

	/**
	 * Used to get the images from the REST API.
	 * 
	 * @param asImageType String
	 * @param asLastMod String
	 * @param aiMaxSize int
	 * @param abIncludeEncodedData boolean
	 */
	private void getImageTest(String asImageType, String asLastMod, int aiMaxSize,
			boolean abIncludeEncodedData)
	{
		ArrayList<Image> laImages = null;
		System.out.println("Running for  LastMod: " + asLastMod + " and MaxSize: "
				+ aiMaxSize);
		ImageList laImageList = laClient.getImages("Registrant Photo",
				abIncludeEncodedData, aiMaxSize, asLastMod);
		Assert.assertNotNull(laImageList);
		Assert.assertNotNull(laImageList.getImageList());
		System.out.println(laImageList.getImageList().size() + " Image(s) returned.");
		asLastMod = laImageList.getLastModified();
		laImages = laImageList.getImageList();
		int liRun = 1;
		while (laImages != null && laImages.size() > 0)
		{
			System.out.println("Run " + (liRun++) + ":");
			for (Image laImage : laImages)
			{
				System.out.println(laImage.toString());
			}

			// If we get back less than the max size then we are done.
			if (laImageList.getImageList().size() < aiMaxSize)
			{
				laImages = null;
			}
			// We still have work to do.
			else
			{
				System.out.println("Running for  LastMod: " + asLastMod
						+ " and MaxSize: " + aiMaxSize);
				laImageList = laClient.getImages(asImageType, abIncludeEncodedData,
						aiMaxSize, asLastMod);
				Assert.assertNotNull(laImageList);
				Assert.assertNotNull(laImageList.getImageList());
				System.out.println(laImageList.getImageList().size()
						+ " Image(s) returned.");
				asLastMod = laImageList.getLastModified();
				laImages = laImageList.getImageList();
			}
		}
	}

	/**
	 * Tests the registration post API.
	 * 
	 * @param aaRegList RegistrantList
	 */
	private RegistrantList registrantListPost(RegistrantList aaRegList)
	{
		// Call the API to post the registant
		RegistrantResponseList laRegResponseList = laClient.postRegistrantList(aaRegList);
		System.out.println(laRegResponseList.toString());
		// Loop through the responses
		for (RegistrantResponse laRegResponse : laRegResponseList.getResponseList())
		{
			System.out.println(laRegResponse.toString());
			Assert.assertEquals(laRegResponse.getStatus(), "SUCCESS");
		}

		return aaRegList;
	}

	@Before
	public void setUp() throws Exception
	{
		InputStream laFileServer = TestAllianceTechRestClient.class.getClassLoader()
				.getResourceAsStream("creds.properties");
		Properties laServerPrp = new Properties();
		laServerPrp.load(laFileServer);

		laClient = new AllianceTechRestClient(laServerPrp.getProperty("username"),
				laServerPrp.getProperty("password"), laServerPrp.getProperty("api"));
	}

	@After
	public void tearDown() throws Exception
	{
		laClient.shutdown();
	}

	/**
	 * Tests the association BULK delete API.
	 */
	@Test
	@Ignore
	public void test_AssociationListBulkDelete()
	{
		int liNumOfRecs = 3;
		// Setup
		AssociationList laAssocListData = associationListPost(liNumOfRecs);
		// End Setup

		// Bulk Delete
		DefaultResponse laResponse = laClient
				.postBulkDeleteAssociationList(laAssocListData);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");

		// Verify
		for (Association laAssoc : laAssocListData.getAssociationList())
		{
			AssociationList laAssocList = laClient.getAssociation(laAssoc.getEpc(),
					AllianceTechRestClient.ID_TYPE_EPC);
			Assert.assertNotNull(laAssocList);
			Assert.assertNotNull(laAssocList.getAssociationList());
			Assert.assertTrue(laAssocList.getAssociationList().size() == 0);
		}
		// Nothing to clean up
	}

	/**
	 * Tests the association delete API by registrant num.
	 */
	@Test
	@Ignore
	public void test_AssociationListDeleteByRegNum()
	{
		int liNumOfRecs = 1;
		// Setup
		AssociationList laAssocListData = associationListPost(liNumOfRecs);
		// End Setup

		// Delete by Reg Num
		Association laSingleDel = laAssocListData.getAssociationList().remove(0);
		Assert.assertNotNull(laSingleDel);
		DefaultResponse laResponse = laClient.deleteAssociation(
				laSingleDel.getRegistrantNum(), AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");

		// Verify
		AssociationList laAssocList = laClient.getAssociation(
				laSingleDel.getRegistrantNum(), AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 0);

		// Nothing to clean up
	}

	/**
	 * Tests the association delete API by EPC.
	 */
	@Test
	@Ignore
	public void test_AssociationListDeleteByEPC()
	{
		int liNumOfRecs = 1;
		// Setup
		AssociationList laAssocListData = associationListPost(liNumOfRecs);
		// End Setup

		// Delete by EPC
		Association laSingleDel = laAssocListData.getAssociationList().remove(0);
		Assert.assertNotNull(laSingleDel);
		DefaultResponse laResponse = laClient.deleteAssociation(laSingleDel.getEpc(),
				AllianceTechRestClient.ID_TYPE_EPC);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");

		// Verify
		AssociationList laAssocList = laClient.getAssociation(laSingleDel.getEpc(),
				AllianceTechRestClient.ID_TYPE_EPC);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 0);

		// Nothing to clean up
	}

	/**
	 * Tests the association delete API by EPC but without the id_type..
	 */
	@Test
	@Ignore
	public void test_AssociationListDeleteByEPCNoIdType()
	{
		int liNumOfRecs = 1;
		// Setup
		AssociationList laAssocListData = associationListPost(liNumOfRecs);
		// End Setup

		// Delete by EPC
		Association laSingleDel = laAssocListData.getAssociationList().remove(0);
		Assert.assertNotNull(laSingleDel);
		DefaultResponse laResponse = laClient.deleteAssociation(laSingleDel.getEpc(),
				null);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");

		// Verify
		AssociationList laAssocList = laClient.getAssociation(laSingleDel.getEpc(), null);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 0);

		// Nothing to clean up
	}

	/**
	 * Tests the association delete API by ID.
	 */
	@Test
	@Ignore
	public void test_AssociationListDeleteByID()
	{
		int liNumOfRecs = 1;
		// Setup
		AssociationList laAssocListData = associationListPost(liNumOfRecs);
		// End Setup

		Association laSingleDel = laAssocListData.getAssociationList().remove(0);
		AssociationList laAssocList = laClient.getAssociation(
				laSingleDel.getRegistrantNum(), AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 1);

		// Delete by EPC
		laSingleDel = laAssocList.getAssociationList().remove(0);
		Assert.assertNotNull(laSingleDel);
		DefaultResponse laResponse = laClient.deleteAssociation(laSingleDel.getId(),
				AllianceTechRestClient.ID_TYPE_ID);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");

		// Verify
		laAssocList = laClient.getAssociation(laSingleDel.getId(),
				AllianceTechRestClient.ID_TYPE_ID);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 0);

		// Nothing to clean up
	}

	/**
	 * Tests the Association GET API.
	 */
	@Test
	@Ignore
	public void test_AssociationListGet()
	{
		AssociationList laAssocList = laClient.getAssociationList(5,
				"2012-01-25-12.36.43.023001", null);
		System.out.println(laAssocList.getAssociationList().size());
		if (laAssocList.getAssociationList().size() > 0)
		{
			for (Association laAssoc : laAssocList.getAssociationList())
			{
				System.out.println(laAssoc.toString());
			}
		}
	}

	/**
	 * Tests the Association post API.
	 */
	@Test
	@Ignore
	public void test_AssociationListPost()
	{
		int liNumOfRecs = 1;
		associationListPost(liNumOfRecs);
	}

	/**
	 * Tests the Association GET API (Single Fetch) passing an id_type
	 * of epc. This is a good test of both the GET and the DELETE by
	 * epc.
	 */
	@Test
	@Ignore
	public void test_AssociationSingleFetchByEPC()
	{
		AssociationList laAssocListData = genAssocData(1);
		// Cleanup
		DefaultResponse laResponse = laClient
				.deleteAssociation(laAssocListData.getAssociationList().get(0).getEpc(),
						AllianceTechRestClient.ID_TYPE_EPC);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
		// End Cleanup

		// Setup
		AssociationResponseList laPostResponse = laClient
				.postAssociations(laAssocListData);
		Assert.assertEquals(laPostResponse.getStatus(), "SUCCESS");
		// End Setup

		// GET by EPC
		AssociationList laAssocList = laClient
				.getAssociation(laAssocListData.getAssociationList().get(0).getEpc(),
						AllianceTechRestClient.ID_TYPE_EPC);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 1);
		Assert.assertEquals(laAssocList.getAssociationList().get(0).getEpc(),
				laAssocListData.getAssociationList().get(0).getEpc());

		// Cleanup
		laResponse = laClient.deleteAssociation(
				laAssocListData.getAssociationList().get(0).getEpc(),
				AllianceTechRestClient.ID_TYPE_EPC);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
	}

	/**
	 * Tests the Association GET API (Single Fetch) without passing an
	 * id_type. Both the delete and the single fetch default to EPC as
	 * the ID typed if you don't pass one.
	 */
	@Test
	@Ignore
	public void test_AssociationSingleFetchByEPCNoIdType()
	{
		AssociationList laAssocListData = genAssocData(1);
		// Cleanup
		DefaultResponse laResponse = laClient.deleteAssociation(laAssocListData
				.getAssociationList().get(0).getEpc(), null);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
		// End Cleanup

		// Setup
		AssociationResponseList laPostResponse = laClient
				.postAssociations(laAssocListData);
		Assert.assertEquals(laPostResponse.getStatus(), "SUCCESS");
		// End Setup

		// GET by EPC
		AssociationList laAssocList = laClient.getAssociation(laAssocListData
				.getAssociationList().get(0).getEpc(), null);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 1);
		Assert.assertEquals(laAssocList.getAssociationList().get(0).getEpc(),
				laAssocListData.getAssociationList().get(0).getEpc());

		// Cleanup
		laResponse = laClient.deleteAssociation(
				laAssocListData.getAssociationList().get(0).getEpc(), null);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
	}

	/**
	 * Tests the Association GET API (Single Fetch) passing an id_type
	 * of id. This is a good test of both the GET and the DELETE by id.
	 */
	@Test
	@Ignore
	public void test_AssociationSingleFetchByID()
	{
		AssociationList laAssocListData = genAssocData(1);
		// Cleanup
		DefaultResponse laResponse = laClient.deleteAssociation(laAssocListData
				.getAssociationList().get(0).getRegistrantNum(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
		// End Cleanup

		// Setup
		AssociationResponseList laPostResponse = laClient
				.postAssociations(laAssocListData);
		Assert.assertEquals(laPostResponse.getStatus(), "SUCCESS");
		// End Setup

		// Get the record by reg num so that we can get the id
		AssociationList laAssocList = laClient.getAssociation(laAssocListData
				.getAssociationList().get(0).getRegistrantNum(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 1);
		String lsId = laAssocList.getAssociationList().get(0).getId();

		// Now the real test can we get the same record by id.
		laAssocList = laClient.getAssociation(lsId, AllianceTechRestClient.ID_TYPE_ID);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 1);
		Assert.assertEquals(lsId, laAssocList.getAssociationList().get(0).getId());

		// Cleanup
		laResponse = laClient.deleteAssociation(lsId, AllianceTechRestClient.ID_TYPE_ID);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
	}

	/**
	 * Tests the Association GET API.
	 */
	@Test
	@Ignore
	public void test_AssociationSingleFetchByRegNum()
	{
		AssociationList laAssocListData = genAssocData(1);
		// Cleanup
		DefaultResponse laResponse = laClient.deleteAssociation(laAssocListData
				.getAssociationList().get(0).getRegistrantNum(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
		// End Cleanup

		// Setup
		AssociationResponseList laPostResponse = laClient
				.postAssociations(laAssocListData);
		Assert.assertEquals(laPostResponse.getStatus(), "SUCCESS");
		// End Setup

		// GET by EPC
		AssociationList laAssocList = laClient.getAssociation(laAssocListData
				.getAssociationList().get(0).getRegistrantNum(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 1);
		Assert.assertEquals(laAssocList.getAssociationList().get(0).getRegistrantNum(),
				laAssocListData.getAssociationList().get(0).getRegistrantNum());

		// Cleanup
		laResponse = laClient.deleteAssociation(
				laAssocListData.getAssociationList().get(0).getRegistrantNum(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
	}

	@Test
	@Ignore
	public void test_ImagesGetAllImages()
	{
		getImageTest(null, "1970-01-01-00.00.00.00000", 25, false);
	}

	@Test
	@Ignore
	public void test_ImagesGetExhibitorImages()
	{
		getImageTest(AllianceTechRestClient.IMAGE_TYPE_EXHIBITOR_LOGO,
				"1970-01-01-00.00.00.00000", 25, false);
	}

	@Test
	@Ignore
	public void test_ImagesGetParticipantImages()
	{
		getImageTest(AllianceTechRestClient.IMAGE_TYPE_PARTITICPANT_PHOTO,
				"1970-01-01-00.00.00.00000", 25, false);
	}

	@Test
	@Ignore
	public void test_ImagesGetRegistrantImages()
	{
		getImageTest(AllianceTechRestClient.IMAGE_TYPE_REGISTRANT,
				"1970-01-01-00.00.00.00000", 25, true);
	}

	@Test
	@Ignore
	public void test_PersonalEventDelete()
	{
		DefaultResponse laResponse = laClient.deletePersonalEvent(
				"20100729225131564332000000", "20120122185840014954000000", false);
		System.out.println(laResponse.getStatus());
	}

	@Test
	@Ignore
	public void test_PersonalEventsGet()
	{
		PersonalEventList laPEList = laClient.getPersonalEvents(
				"20100729225131564332000000", "2012-01-25-12.36.43.023001");
		if (laPEList.getPersonalEventList().size() > 0)
		{
			System.out.println(((PersonalEvent) laPEList.getPersonalEventList().get(0))
					.getTitle());
		}
	}

	@Test
	@Ignore
	public void test_PersonalEventsPost()
	{
		PersonalEventList laPEList = new PersonalEventList();
		PersonalEvent laPE = new PersonalEvent();
		laPE.setId("");// pd_id:
		// 20120122185840014954000000
		laPE.setDate("2010-10-22");
		// laPE.setDate("2011.10.05");
		laPE.setStartTime("3:00 PM");
		// laPE.setStartTime("10:00");
		laPE.setEndTime("5:00 PM");
		laPE.setLocation("Lobby");
		laPE.setTitle("PE test");
		laPE.setDescription("link to yahoo <a href=\"http://www.google.com\" target=\"_blank\"><b>link</b></a>");
		laPEList.getPersonalEventList().add(laPE);
		PersonalEventResponseList laPEResponseList = laClient.postPersonalEvents(
				"20100729225131564332000000", laPEList);
		for (int i = 0; i < laPEResponseList.getPersonalEventResponseList().size(); i++)
		{
			PersonalEventResponse laPEResponse = (PersonalEventResponse) laPEResponseList
					.getPersonalEventResponseList().get(i);

			System.out.println("Response: " + laPEResponse.getStatus());
		}
	}

	@Test
	@Ignore
	public void test_ProfileGet()
	{
		Profile laProfile = laClient.getProfile("AG5JP4A");
		System.out.println(laProfile.getUserId());
		System.out.println(laProfile.getFirstName());
		System.out.println(laProfile.getLastName());
	}

	@Test
	@Ignore
	public void test_ProfilePost()
	{
		Profile laProfile = new Profile();
		laProfile.setUserId("20110721210456167848000000");
		laProfile.setAttendeeNum("AG5JP4A");
		laProfile.setFirstName("Jeff");
		laProfile.setLastName("zOverton");
		laProfile.setTitle("Project Manager");
		laProfile.setCompany("Alliance Tech");
		laProfile.setAddress1("8900 Shoal Creek Blvd");
		laProfile.setAddress2("");
		laProfile.setCity("Austin");
		laProfile.setState("Texas");
		laProfile.setZipCode("78757");
		laProfile.setEmail("joverton@alliancetech.com");
		laProfile.setPhone("512 450 5308");
		laProfile.setLoginId("____");
		laProfile.setPassword("____");
		laProfile.setPersonalEmail("");
		laProfile.setWebsite("");
		laProfile.setLinkedIn("");
		laProfile.setFacebook("");
		laProfile.setTwitterUrl("");
		laProfile.setBlog("");
		laProfile.setInstantMessage("");
		laProfile.setAboutMe("");
		laProfile.setProfileSearchable(false);
		laProfile.setEmailNotify(false);
		laProfile.setTwitterDirectMsg(false);
		laProfile.setTwitterSessionAttendance(false);
		laProfile.setTwitterSessionSelection(false);
		DefaultResponse laRegResponse = laClient.postProfile(
				"20110721210456167848000000", laProfile);
		System.out.println("Response: " + laRegResponse.getStatus());
	}

	/**
	 * Tests the Registrant Ignore AutoGen EPC Mode off. We should post
	 * a registrant with the ignore off and confirm that a new EPC is
	 * generated.<br>
	 * You should have Auto Generate EPC Mode? turned on in the EMT for
	 * this test.
	 */
	@Test
	@Ignore
	public void test_RegistrantIgnoreAutoGenEPCModeOff()
	{
		// Gen 1 record
		RegistrantList laRegList = genRegData(1);
		laRegList.getRegistrantList().get(0).setIgnoreAutoGenEPCMode(false);

		// Cleanup
		// Delete the reg record to make sure we don't already have one.
		DefaultResponse laDelResponse = laClient.deleteRegistrant(laRegList
				.getRegistrantList().get(0).getCustomerRegistrantId());
		Assert.assertEquals(laDelResponse.getStatus(), "SUCCESS");
		// Delete the association
		laDelResponse = laClient.deleteAssociation(laRegList.getRegistrantList().get(0)
				.getRegistrantNumber(), AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertEquals(laDelResponse.getStatus(), "SUCCESS");
		// End Cleanup

		registrantListPost(laRegList);
		Registrant laReg = laClient.getRegistrant(laRegList.getRegistrantList().get(0)
				.getCustomerRegistrantId());
		Assert.assertNotNull(laReg);
		Assert.assertEquals(laRegList.getRegistrantList().get(0)
				.getCustomerRegistrantId(), laReg.getCustomerRegistrantId());
		Assert.assertEquals(laRegList.getRegistrantList().get(0).getRegistrantNumber(),
				laReg.getRegistrantNumber());
		AssociationList laAssocList = laClient.getAssociation(laRegList
				.getRegistrantList().get(0).getRegistrantNumber(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() > 0);
	}

	/**
	 * Tests the Registrant Ignore AutoGen EPC Mode on. We should post a
	 * registrant with the ignore on and confirm that a new EPC is not
	 * generated.<br>
	 * You should have Auto Generate EPC Mode? turned on in the EMT for
	 * this test.
	 */
	@Test
	@Ignore
	public void test_RegistrantIgnoreAutoGenEPCModeOn()
	{
		// Gen 1 record
		RegistrantList laRegList = genRegData(1);
		laRegList.getRegistrantList().get(0).setIgnoreAutoGenEPCMode(true);

		// Cleanup
		// Delete the reg record to make sure we don't already have one.
		DefaultResponse laDelResponse = laClient.deleteRegistrant(laRegList
				.getRegistrantList().get(0).getCustomerRegistrantId());
		Assert.assertEquals(laDelResponse.getStatus(), "SUCCESS");
		// Delete the association
		laDelResponse = laClient.deleteAssociation(laRegList.getRegistrantList().get(0)
				.getRegistrantNumber(), AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertEquals(laDelResponse.getStatus(), "SUCCESS");
		// End Cleanup

		registrantListPost(laRegList);
		Registrant laReg = laClient.getRegistrant(laRegList.getRegistrantList().get(0)
				.getCustomerRegistrantId());
		Assert.assertNotNull(laReg);
		Assert.assertEquals(laRegList.getRegistrantList().get(0)
				.getCustomerRegistrantId(), laReg.getCustomerRegistrantId());
		Assert.assertEquals(laRegList.getRegistrantList().get(0).getRegistrantNumber(),
				laReg.getRegistrantNumber());
		AssociationList laAssocList = laClient.getAssociation(laRegList
				.getRegistrantList().get(0).getRegistrantNumber(),
				AllianceTechRestClient.ID_TYPE_NUM);
		Assert.assertNotNull(laAssocList);
		Assert.assertNotNull(laAssocList.getAssociationList());
		Assert.assertTrue(laAssocList.getAssociationList().size() == 0);
	}

	/**
	 * Tests the registration delete API. This will test the BULK and
	 * the single record delete.
	 */
	@Test
	@Ignore
	public void test_RegistrantListDelete()
	{
		int liNumOfRecs = 3;
		RegistrantList laRegList = registrantListPost(genRegData(liNumOfRecs));
		// Single Delete
		Registrant laSingleDel = laRegList.getRegistrantList().remove(0);
		Assert.assertNotNull(laSingleDel);
		DefaultResponse laResponse = laClient.deleteRegistrant(laSingleDel
				.getCustomerRegistrantId());
		System.out.println(laResponse.toString());
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
		// Multi-Delete
		laResponse = laClient.postBulkDeleteRegistrantList(laRegList);
		System.out.println(laResponse.toString());
		Assert.assertEquals(laResponse.getStatus(), "SUCCESS");
	}

	/**
	 * Tests the registration GET API.
	 */
	@Test
	@Ignore
	public void test_RegistrantListGet()
	{
		RegistrantList laRegList = laClient.getRegistrantList(5,
				"2012-01-25-12.36.43.023001");
		System.out.println(laRegList.getRegistrantList().size());
		if (laRegList.getRegistrantList().size() > 0)
		{
			for (Registrant laReg : laRegList.getRegistrantList())
			{
				System.out.println(laReg.toString());
			}
		}
	}

	/**
	 * Tests the registration post API.
	 */
	@Test
	@Ignore
	public void test_RegistrantListPost()
	{
		int liNumOfRecs = 1;
		registrantListPost(genRegData(liNumOfRecs));
	}

	/**
	 * Tests the room GET API.
	 */
	@Test
	@Ignore
	public void test_RoomListGet()
 {
		RoomList laRoomList = laClient
				.getRoomList("2012-01-01-08.00.00.000000");
		System.out.println(laRoomList.getRoomList().size());
		if (laRoomList.getRoomList().size() > 0) {
			for (Room laRoom : laRoomList.getRoomList()) {
				System.out.println(laRoom.toString());
			}
		}
	}

	/**
	 * Tests the GET Session API.
	 */
	@Test
	@Ignore
	public void test_SessionListGet()
	{
		SessionList laSessionList = laClient.getSessions("2012-01-25-12.36.43.023001", 1);
		System.out.println(laSessionList.getSessionList().size());
		if (laSessionList.getSessionList().size() > 0)
		{
			for (Session laSession : laSessionList.getSessionList())
			{
				System.out.println(laSession.toString());
			}
		}
	}

	/**
	 * Tests the POST session API.
	 */
	@Test
	@Ignore
	public void test_SessionsPost()
	{
		SessionList laSessionList = new SessionList();
		// Put all the attribute that you want control over. This is so
		// we can handle removal of attributes when a registrant is
		// updated and no longer has that attribute.
		laSessionList.getAttrName().add("Session Type");
		laSessionList.getAttrName().add("SIM Status");
		// Build the session to post
		Session laSession = new Session();

		laSession.setCustomerSessionId("tst_");
		laSession.setSessionNumber("tst_");
		laSession.setTitle("Title_");
		laSession.setShortTitle("ShortTitle_");
		laSession.setDescription("Description_");
		laSession.setActive(true);
		laSession.setDate("2010-10-25");
		laSession.setStartTime("10:00 AM");
		laSession.setEndTime("11:00 AM");
		laSession.setScanStartTime("9:45 AM");
		laSession.setScanEndTime("11:00 AM");
		laSession.setRoom("Lagoon K");
		laSession.setCapacity("10");
		laSession.setLocation("THEhotel");
		laSession.setSimStatus("Accepted");
		laSession.setSurvey("Session Survey");
		// Add the attributes
		laSession.getAttrList().add(new Attribute("Session Type", "Content Analytics"));
		laSession.getAttrList().add(new Attribute("SIM Status", "Accepted"));
		// Add the session to the list to post
		laSessionList.getSessionList().add(laSession);
		// Call the post API
		SessionResponseList laSessionResponseList = laClient.postSessions(laSessionList);
		// Loop through the responses
		for (int i = 0; i < laSessionResponseList.getResponseList().size(); i++)
		{
			SessionResponse laSessionResponse = (SessionResponse) laSessionResponseList
					.getResponseList().get(i);
			System.out.println("Response: " + laSessionResponse.getStatus());
		}
	}
}
