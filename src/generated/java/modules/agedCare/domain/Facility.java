package modules.agedCare.domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import modules.admin.domain.Contact;
import org.locationtech.jts.geom.Geometry;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.impl.domain.types.jaxb.GeometryMapper;

/**
 * Facility
 * <br/>
 * Detail of different Facilities
 * 
 * @navhas n facilityManager 0..1 Contact
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Facility extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "agedCare";
	/** @hidden */
	public static final String DOCUMENT_NAME = "Facility";

	/** @hidden */
	public static final String facilityNamePropertyName = "facilityName";
	/** @hidden */
	public static final String buildingNumberPropertyName = "buildingNumber";
	/** @hidden */
	public static final String streetNamePropertyName = "streetName";
	/** @hidden */
	public static final String suburbPropertyName = "suburb";
	/** @hidden */
	public static final String statePropertyName = "state";
	/** @hidden */
	public static final String facilityManagerPropertyName = "facilityManager";
	/** @hidden */
	public static final String locationPropertyName = "location";

	/**
	 * Facility Name
	 **/
	private String facilityName;
	/**
	 * Building Number
	 **/
	private Integer buildingNumber;
	/**
	 * Street Name
	 **/
	private String streetName;
	/**
	 * Suburb
	 **/
	private String suburb;
	/**
	 * State
	 **/
	private String state;
	/**
	 * Facility Manager
	 **/
	private Contact facilityManager = null;
	/**
	 * Location
	 **/
	private Geometry location;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Facility.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Facility.DOCUMENT_NAME;
	}

	public static Facility newInstance() {
		try {
			return CORE.getUser().getCustomer().getModule(MODULE_NAME).getDocument(CORE.getUser().getCustomer(), DOCUMENT_NAME).newInstance(CORE.getUser());
		}
		catch (RuntimeException e) {
			throw e;
		}
		catch (Exception e) {
			throw new DomainException(e);
		}
	}

	@Override
	@XmlTransient
	public String getBizKey() {
		try {
			return org.skyve.util.Binder.formatMessage("Facility - {facilityName}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Facility) && 
					this.getBizId().equals(((Facility) o).getBizId()));
	}

	/**
	 * {@link #facilityName} accessor.
	 * @return	The value.
	 **/
	public String getFacilityName() {
		return facilityName;
	}

	/**
	 * {@link #facilityName} mutator.
	 * @param facilityName	The new value.
	 **/
	@XmlElement
	public void setFacilityName(String facilityName) {
		preset(facilityNamePropertyName, facilityName);
		this.facilityName = facilityName;
	}

	/**
	 * {@link #buildingNumber} accessor.
	 * @return	The value.
	 **/
	public Integer getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * {@link #buildingNumber} mutator.
	 * @param buildingNumber	The new value.
	 **/
	@XmlElement
	public void setBuildingNumber(Integer buildingNumber) {
		preset(buildingNumberPropertyName, buildingNumber);
		this.buildingNumber = buildingNumber;
	}

	/**
	 * {@link #streetName} accessor.
	 * @return	The value.
	 **/
	public String getStreetName() {
		return streetName;
	}

	/**
	 * {@link #streetName} mutator.
	 * @param streetName	The new value.
	 **/
	@XmlElement
	public void setStreetName(String streetName) {
		preset(streetNamePropertyName, streetName);
		this.streetName = streetName;
	}

	/**
	 * {@link #suburb} accessor.
	 * @return	The value.
	 **/
	public String getSuburb() {
		return suburb;
	}

	/**
	 * {@link #suburb} mutator.
	 * @param suburb	The new value.
	 **/
	@XmlElement
	public void setSuburb(String suburb) {
		preset(suburbPropertyName, suburb);
		this.suburb = suburb;
	}

	/**
	 * {@link #state} accessor.
	 * @return	The value.
	 **/
	public String getState() {
		return state;
	}

	/**
	 * {@link #state} mutator.
	 * @param state	The new value.
	 **/
	@XmlElement
	public void setState(String state) {
		preset(statePropertyName, state);
		this.state = state;
	}

	/**
	 * {@link #facilityManager} accessor.
	 * @return	The value.
	 **/
	public Contact getFacilityManager() {
		return facilityManager;
	}

	/**
	 * {@link #facilityManager} mutator.
	 * @param facilityManager	The new value.
	 **/
	@XmlElement
	public void setFacilityManager(Contact facilityManager) {
		if (this.facilityManager != facilityManager) {
			preset(facilityManagerPropertyName, facilityManager);
			this.facilityManager = facilityManager;
		}
	}

	/**
	 * {@link #location} accessor.
	 * @return	The value.
	 **/
	public Geometry getLocation() {
		return location;
	}

	/**
	 * {@link #location} mutator.
	 * @param location	The new value.
	 **/
	@XmlJavaTypeAdapter(GeometryMapper.class)
	@XmlElement
	public void setLocation(Geometry location) {
		preset(locationPropertyName, location);
		this.location = location;
	}
}
