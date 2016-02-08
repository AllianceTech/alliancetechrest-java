package com.alliancetech.rest;

import java.util.HashMap;
import java.util.Map;

import com.alliancetech.rest.data.Association;
import com.alliancetech.rest.data.AssociationList;
import com.alliancetech.rest.data.AssociationResponseList;
import com.alliancetech.rest.data.DefaultResponse;
import com.alliancetech.rest.data.ImageList;
import com.alliancetech.rest.data.MaterialsRedemptionList;
import com.alliancetech.rest.data.MaterialsRedemptionResponseList;
import com.alliancetech.rest.data.PersonalEventList;
import com.alliancetech.rest.data.PersonalEventResponseList;
import com.alliancetech.rest.data.Profile;
import com.alliancetech.rest.data.Registrant;
import com.alliancetech.rest.data.RegistrantList;
import com.alliancetech.rest.data.RegistrantResponseList;
import com.alliancetech.rest.data.RoomList;
import com.alliancetech.rest.data.SessionList;
import com.alliancetech.rest.data.SessionResponseList;

/**
 * Alliance Tech REST API client
 * 
 * @version Ver 1.0.1 12/21/2012
 * @author Jeff Seifert <br>
 * Creation Date: 08/01/2007 15:50:00
 */
public class AllianceTechRestClient extends RestUtility
{
	/**
	 * Id types used by association API.
	 */
	public static final String ID_TYPE_EPC = "epc";
	public static final String ID_TYPE_ID = "id";
	public static final String ID_TYPE_NUM = "num";

	// Supported image types
	public static final String IMAGE_TYPE_EXHIBITOR_LOGO = "Exhibitor Logo";
	public static final String IMAGE_TYPE_PARTITICPANT_PHOTO = "Participant Photo";
	public static final String IMAGE_TYPE_REGISTRANT = "Registrant Photo";
	private static final String PARAM_ENCODED_DATA = "encoded_data";
	private static final String PARAM_ID_TYPE = "id_type";
	private static final String PARAM_LAST_MODIFIED = "last_modified";
	private static final String PARAM_MAX_SIZE = "max_size";
	public static final String RESPONSE_STATUS_ERROR = "ERROR";
	public static final String RESPONSE_STATUS_SUCCESS = "SUCCESS";
	private static final String REST_URL_ASSOCIATION_BULK_DELETE = "/restapi/association/bulkdelete";
	private static final String REST_URL_ASSOCIATIONS = "/restapi/associations";
	private static final String REST_URL_IMAGES = "/restapi/images";
	private static final String REST_URL_MATERIALS = "/restapi/materials";
	private static final String REST_URL_PERSONAL_EVENTS = "/restapi/personalevents/";
	private static final String REST_URL_PROFILE = "/restapi/profile/";
	private static final String REST_URL_REGISTRATION = "/restapi/registration";
	private static final String REST_URL_REGISTRATION_BULK_DELETE = "/restapi/registration/bulkdelete";
	private static final String REST_URL_REGISTRATION_CHECKED_IN_LIST = "/restapi/registration/checked-in-list/";
	private static final String REST_URL_REGISTRATION_VIEW_BY = "/restapi/registration/viewby";
	private static final String REST_URL_ROOMS = "/restapi/rooms";
	private static final String REST_URL_SESSIONS = "/restapi/sessions";
	private static final String REST_URL_SESSIONS_VIEW_BY = "/restapi/sessions/viewby";

	/**
	 * Constructor.
	 * 
	 * @param asUsername String
	 * @param asPassword String
	 * @param asEventTag String
	 * @param asDomain String
	 */
	public AllianceTechRestClient(String asUsername, String asPassword, String asHostname)
	{
		super(asUsername, asPassword, asHostname);
	}

	/**
	 * Used to delete and individual Association records.
	 * 
	 * @param asId String (id, epc, or regnum)
	 * @param asIdType String (null - defaults to EPC, epc, id, or
	 * regnum)
	 * @return DefaultResponse
	 */
	public DefaultResponse deleteAssociation(String asId, String asIdType)
	{
		if (!UtilityMethods.isValidString(asId))
		{
			throw new IllegalArgumentException("Id parameter is null");
		}

		Map<String, String> lhtParameters = new HashMap<String, String>();
		if (UtilityMethods.isValidString(asIdType))
		{
			lhtParameters.put(PARAM_ID_TYPE, encode(asIdType));
		}

		return delete(REST_URL_ASSOCIATIONS + "/" + encode(asId), DefaultResponse.class,
				lhtParameters);
	}

	/**
	 * Handles deleting a personal event.
	 * 
	 * @param asUserId String
	 * @param asPersonalEventId String
	 * @param abDeleteAll boolean
	 * @return DefaultResponse
	 */
	public DefaultResponse deletePersonalEvent(String asUserId, String asPersonalEventId,
			boolean abDeleteAll)
	{
		String lsParam = "";
		if (UtilityMethods.isValidString(asUserId))
		{
			if (UtilityMethods.isValidString(asPersonalEventId))
			{
				lsParam = "?id=" + asPersonalEventId;
			}
			else
			{
				lsParam = "?delete_all=" + new Boolean(abDeleteAll).toString();
			}
		}
		else
		{
			throw new IllegalArgumentException("userId is null");
		}

		return delete(REST_URL_PERSONAL_EVENTS + encode(asUserId) + lsParam,
				DefaultResponse.class);
	}

	/**
	 * Used to delete and individual Registrant. The ID can be
	 * registrant num, registrant id, or customer registrant id.
	 * 
	 * @param asAttendeeNumber String
	 * @return Profile
	 */
	public DefaultResponse deleteRegistrant(String asId)
	{
		if (!UtilityMethods.isValidString(asId))
		{
			throw new IllegalArgumentException("Id parameter is null");
		}

		return delete(REST_URL_REGISTRATION + "/" + encode(asId), DefaultResponse.class);
	}

	/**
	 * Get detail of an Association. We are returning a list because by
	 * epc or num could return multiple records.
	 * 
	 * @param asId String (id, epc, or num)
	 * @param asIdType String (null - defaults to EPC, epc, id, or num)
	 * @return AssociationList
	 */
	public AssociationList getAssociation(String asId, String asIdType)
	{
		if (!UtilityMethods.isValidString(asId))
		{
			throw new IllegalArgumentException("Id parameter is null");
		}

		Map<String, String> lhtParameters = new HashMap<String, String>();
		if (UtilityMethods.isValidString(asIdType))
		{
			lhtParameters.put(PARAM_ID_TYPE, encode(asIdType));
		}

		AssociationList laRegList = get(AssociationList.class, REST_URL_ASSOCIATIONS
				+ "/" + encode(asId), lhtParameters);

		return laRegList;
	}

	/**
	 * Gets List of Association.
	 * 
	 * @param aiMaxSize int
	 * @param asLastModified String
	 * @param asDeactivated String
	 * @return AssociationList
	 */
	public AssociationList getAssociationList(int aiMaxSize, String asLastModified,
			String asDeactivated)
	{
		String lsParam = "";
		if (aiMaxSize > 0)
		{
			lsParam += "&max_size=" + Integer.toString(aiMaxSize);
		}
		if (UtilityMethods.isValidString(asLastModified))
		{
			lsParam += "&last_modified=" + asLastModified;
		}
		if (UtilityMethods.isValidString(asDeactivated))
		{
			lsParam += "&deactivated=" + asDeactivated;
		}

		if (UtilityMethods.isValidString(lsParam))
		{
			lsParam = lsParam.replaceFirst("&", "?");
		}

		return get(AssociationList.class, REST_URL_ASSOCIATIONS + lsParam);
	}

	/**
	 * Gets List of Images.
	 * 
	 * @param asImageType String
	 * @param abEncodedData boolean
	 * @param aiMaxSize int
	 * @param asLastModified String
	 * @return ImageList
	 */
	public ImageList getImages(String asImageType, boolean abEncodedData, int aiMaxSize,
			String asLastModified)
	{
		Map<String, String> lhtParameters = new HashMap<String, String>();
		if (UtilityMethods.isValidString(asLastModified))
		{
			lhtParameters.put(PARAM_LAST_MODIFIED, encode(asLastModified));
		}
		// I like to only include it if it is > 0
		if (aiMaxSize > 0)
		{
			lhtParameters.put(PARAM_MAX_SIZE, String.valueOf(aiMaxSize));
		}
		// I like to only include it if it needs to be true
		if (abEncodedData)
		{
			lhtParameters.put(PARAM_ENCODED_DATA, String.valueOf(abEncodedData));
		}
		return get(ImageList.class,
				REST_URL_IMAGES
						+ (UtilityMethods.isValidString(asImageType) ? "/"
								+ encode(asImageType) : ""), lhtParameters);
	}

	/**
	 * Get detail of MaterialsRedemption.
	 * 
	 * @param asRegistrantId String
	 * @param asParam String (last_modified, max_size)
	 * @return RegistrantList
	 */
	public MaterialsRedemptionList getMaterialRedemptionList(String asRegistrantId,
			String asParam)
	{
		return get(
				MaterialsRedemptionList.class,
				REST_URL_MATERIALS
						+ (UtilityMethods.isValidString(asRegistrantId) ? "/"
								+ asRegistrantId : "")
						+ (UtilityMethods.isValidString(asParam) ? "/" + asParam : ""));
	}

	/**
	 * Gets List of PersonalEvent.
	 * 
	 * @param asUserId String
	 * @return RegistrantList
	 */
	public PersonalEventList getPersonalEvents(String asUserId, String asLastModified)
	{
		if (asUserId == null || asUserId.trim().length() == 0)
		{
			throw new IllegalArgumentException("userId is null");
		}

		String lsParams = encode(asUserId);

		if (asLastModified != null && asLastModified.trim().length() > 0)
		{
			lsParams += "?last_modified=" + asLastModified;
		}
		return get(PersonalEventList.class, REST_URL_PERSONAL_EVENTS + lsParams);
	}

	/**
	 * Gets the user profile for the passed attendee number.
	 * 
	 * @param asAttendeeNumber String
	 * @return Profile
	 */
	public Profile getProfile(String asAttendeeNumber)
	{
		if (asAttendeeNumber == null || asAttendeeNumber.trim().length() == 0)
		{
			throw new IllegalArgumentException("attendee num parameter is null");
		}

		return get(Profile.class, REST_URL_PROFILE + encode(asAttendeeNumber));
	}

	/**
	 * Get detail of Registrant.
	 * 
	 * @param asParam String (num, customerId, email)
	 * @return RegistrantList
	 */
	public Registrant getRegistrant(String asParam)
	{
		RegistrantList laRegList = get(RegistrantList.class, REST_URL_REGISTRATION + "/"
				+ asParam);
		Registrant laReg = null;
		if (laRegList != null && laRegList.getRegistrantList() != null)
		{
			laReg = laRegList.getRegistrantList().get(0);
		}
		return laReg;
	}

	/**
	 * Gets List of Registrant by counter.
	 * 
	 * @param asCounter String
	 * @return RegistrantList
	 */
	public RegistrantList getRegistrantCheckedInList(String asCounter)
	{
		return get(RegistrantList.class, REST_URL_REGISTRATION_CHECKED_IN_LIST
				+ encode(asCounter));
	}

	/**
	 * Gets List of Registrant.
	 * 
	 * @param asParam String
	 * @return RegistrantList
	 */
	public RegistrantList getRegistrantList(int aiMaxSize, String asLastModified)
	{
		String lsParam = "";
		if (aiMaxSize > 0)
		{
			lsParam += "&max_size=" + Integer.toString(aiMaxSize);
		}
		if (UtilityMethods.isValidString(asLastModified))
		{
			lsParam += "&last_modified=" + asLastModified;
		}

		if (UtilityMethods.isValidString(lsParam))
		{
			lsParam = lsParam.replaceFirst("&", "?");
		}

		return get(RegistrantList.class, REST_URL_REGISTRATION + lsParam);
	}

	/**
	 * Get detail of Registrant.
	 * 
	 * @param asParam String (num, customerId, email)
	 * @return RegistrantList
	 */
	public RegistrantList getRegistrantViewBy(String asViewById, String asLastModified,
			int aiMaxSize)
	{
		String lsParam = "";
		if (aiMaxSize > 0)
		{
			lsParam += "&max_size=" + Integer.toString(aiMaxSize);
		}
		if (UtilityMethods.isValidString(asLastModified))
		{
			lsParam += "&last_modified=" + asLastModified;
		}

		if (UtilityMethods.isValidString(lsParam))
		{
			lsParam = lsParam.replaceFirst("&", "?");
		}
		return get(RegistrantList.class, REST_URL_REGISTRATION_VIEW_BY + "/" + asViewById
				+ lsParam);
	}

	/**
	 * Gets List of Rooms.
	 * 
	 * @param asParam String
	 * @return RegistrantList
	 */
	public RoomList getRoomList(String asLastModified)
	{
		String lsParam = "";
		if (UtilityMethods.isValidString(asLastModified))
		{
			lsParam += "?last_modified=" + asLastModified;
		}

		return get(RoomList.class, REST_URL_ROOMS + lsParam);
	}

	/**
	 * Gets List of Sessions. Format of last modified is:
	 * 2011-01-25-15.36.43.023001
	 * 
	 * @param asParam String
	 * @return SessionList
	 */
	public SessionList getSessions(String asLastModified, int aiMaxSize)
	{
		String lsParam = "";
		if (aiMaxSize > 0)
		{
			lsParam += "&max_size=" + Integer.toString(aiMaxSize);
		}
		if (UtilityMethods.isValidString(asLastModified))
		{
			lsParam += "&last_modified=" + asLastModified;
		}

		if (UtilityMethods.isValidString(lsParam))
		{
			lsParam = lsParam.replaceFirst("&", "?");
		}

		return get(SessionList.class, REST_URL_SESSIONS + lsParam);
	}

	/**
	 * Gets List of Sessions. Format of last modified is:
	 * 2011-01-25-15.36.43.023001
	 * 
	 * @param asParam String
	 * @return SessionList
	 */
	public SessionList getSessionsViewBy(String asViewById, String asLastModified,
			int aiMaxSize)
	{
		String lsParam = "";
		if (aiMaxSize > 0)
		{
			lsParam += "&max_size=" + Integer.toString(aiMaxSize);
		}
		if (UtilityMethods.isValidString(asLastModified))
		{
			lsParam += "&last_modified=" + asLastModified;
		}

		if (UtilityMethods.isValidString(lsParam))
		{
			lsParam = lsParam.replaceFirst("&", "?");
		}

		return get(SessionList.class, REST_URL_SESSIONS_VIEW_BY + "/" + asViewById
				+ lsParam);
	}

	/**
	 * Post Associations
	 * 
	 * @param associationList AssociationList
	 * @return AssociationResponseList
	 */
	public AssociationResponseList postAssociations(AssociationList associationList)
	{
		if (associationList == null)
		{
			throw new IllegalArgumentException("associationList is null");
		}

		return post(REST_URL_ASSOCIATIONS, associationList, AssociationResponseList.class);
	}

	/**
	 * Post Bulk Delete for a List of Associations.
	 * 
	 * @param aaList RegistrantList
	 * @return DefaultResponse
	 */
	public DefaultResponse postBulkDeleteAssociationList(AssociationList aaList)
	{
		return post(REST_URL_ASSOCIATION_BULK_DELETE, aaList, DefaultResponse.class);
	}

	/**
	 * Post Bulk Delete for a List of Registrant.
	 * 
	 * @param aaList RegistrantList
	 * @return DefaultResponse
	 */
	public DefaultResponse postBulkDeleteRegistrantList(RegistrantList aaList)
	{
		return post(REST_URL_REGISTRATION_BULK_DELETE, aaList, DefaultResponse.class);
	}

	/**
	 * Post List of MaterialRedemption.
	 * 
	 * @param aaList MaterialRedemptionList
	 * @return PostResponse
	 */
	public MaterialsRedemptionResponseList postMaterialRedemptionList(
			MaterialsRedemptionList aaList)
	{
		return post(REST_URL_MATERIALS, aaList, MaterialsRedemptionResponseList.class);
	}

	/**
	 * Post List of Registrant.
	 * 
	 * @param aaList PersonalEventList
	 * @return RegistrantResponseList
	 */
	public PersonalEventResponseList postPersonalEvents(String asUserId,
			PersonalEventList aaList)
	{
		if (asUserId == null || asUserId.trim().length() == 0)
		{
			throw new IllegalArgumentException("userId is null");
		}

		return post(REST_URL_PERSONAL_EVENTS + asUserId, aaList,
				PersonalEventResponseList.class);
	}

	/**
	 * Post List of Registrant.
	 * 
	 * @param aaUserProfile UserProfile
	 * @return RegistrantResponseList
	 */
	public DefaultResponse postProfile(String asUserId, Profile aaUserProfile)
	{
		if (asUserId == null || asUserId.trim().length() == 0)
		{
			throw new IllegalArgumentException("userId is null");
		}

		return post(REST_URL_PROFILE + asUserId, aaUserProfile, DefaultResponse.class);
	}

	/**
	 * Post List of Registrant.
	 * 
	 * @param aaList RegistrantList
	 * @return RegistrantResponseList
	 */
	public RegistrantResponseList postRegistrantList(RegistrantList aaList)
	{
		return post(REST_URL_REGISTRATION, aaList, RegistrantResponseList.class);
	}

	/**
	 * Post List of Session.
	 * 
	 * @param aaList SessionList
	 * @return SessionResponseList
	 */
	public SessionResponseList postSessions(SessionList aaList)
	{
		return post(REST_URL_SESSIONS, aaList, SessionResponseList.class);
	}
}
