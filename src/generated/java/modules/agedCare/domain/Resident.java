package modules.agedCare.domain;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.domain.types.DateOnly;
import org.skyve.domain.types.Enumeration;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.impl.domain.ChangeTrackingArrayList;
import org.skyve.impl.domain.types.jaxb.DateOnlyMapper;
import org.skyve.metadata.model.document.Bizlet.DomainValue;

/**
 * Resident
 * <br/>
 * Details of the resident admitted to the facility.
 * 
 * @depend - - - ResidentStatus
 * @navcomposed 1 assessments 0..n Assessment
 * @navhas n facilityName 0..1 Facility
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Resident extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "agedCare";
	/** @hidden */
	public static final String DOCUMENT_NAME = "Resident";

	/** @hidden */
	public static final String residentIDPropertyName = "residentID";
	/** @hidden */
	public static final String residentNamePropertyName = "residentName";
	/** @hidden */
	public static final String photoPropertyName = "photo";
	/** @hidden */
	public static final String DOBPropertyName = "DOB";
	/** @hidden */
	public static final String roomNoPropertyName = "roomNo";
	/** @hidden */
	public static final String BIOPropertyName = "BIO";
	/** @hidden */
	public static final String admissionDatePropertyName = "admissionDate";
	/** @hidden */
	public static final String facilityNamePropertyName = "facilityName";
	/** @hidden */
	public static final String assessmentsPropertyName = "assessments";
	/** @hidden */
	public static final String residentStatusPropertyName = "residentStatus";

	/**
	 * Resident Status
	 **/
	@XmlEnum
	public static enum ResidentStatus implements Enumeration {
		current("Current", "Current"),
		discharged("Discharged", "Discharged"),
		deceased("Deceased", "Deceased");

		private String code;
		private String description;

		/** @hidden */
		private DomainValue domainValue;

		/** @hidden */
		private static List<DomainValue> domainValues;

		private ResidentStatus(String code, String description) {
			this.code = code;
			this.description = description;
			this.domainValue = new DomainValue(code, description);
		}

		@Override
		public String toCode() {
			return code;
		}

		@Override
		public String toDescription() {
			return description;
		}

		@Override
		public DomainValue toDomainValue() {
			return domainValue;
		}

		public static ResidentStatus fromCode(String code) {
			ResidentStatus result = null;

			for (ResidentStatus value : values()) {
				if (value.code.equals(code)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static ResidentStatus fromDescription(String description) {
			ResidentStatus result = null;

			for (ResidentStatus value : values()) {
				if (value.description.equals(description)) {
					result = value;
					break;
				}
			}

			return result;
		}

		public static List<DomainValue> toDomainValues() {
			if (domainValues == null) {
				ResidentStatus[] values = values();
				domainValues = new ArrayList<>(values.length);
				for (ResidentStatus value : values) {
					domainValues.add(value.domainValue);
				}
			}

			return domainValues;
		}
	}

	/**
	 * Resident ID
	 **/
	private String residentID;
	/**
	 * Resident Name
	 **/
	private String residentName;
	/**
	 * Photo
	 **/
	private String photo;
	/**
	 * DOB
	 **/
	private DateOnly DOB;
	/**
	 * Room No.
	 **/
	private Integer roomNo;
	/**
	 * BIO
	 **/
	private String BIO;
	/**
	 * Admission Date
	 **/
	private DateOnly admissionDate;
	/**
	 * Facility Name
	 **/
	private Facility facilityName = null;
	/**
	 * Assessments
	 **/
	private List<Assessment> assessments = new ChangeTrackingArrayList<>("assessments", this);
	/**
	 * Resident Status
	 **/
	private ResidentStatus residentStatus = ResidentStatus.current;

	@Override
	@XmlTransient
	public String getBizModule() {
		return Resident.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Resident.DOCUMENT_NAME;
	}

	public static Resident newInstance() {
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
			return org.skyve.util.Binder.formatMessage("Resident - {residentID}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Resident) && 
					this.getBizId().equals(((Resident) o).getBizId()));
	}

	/**
	 * {@link #residentID} accessor.
	 * @return	The value.
	 **/
	public String getResidentID() {
		return residentID;
	}

	/**
	 * {@link #residentID} mutator.
	 * @param residentID	The new value.
	 **/
	@XmlElement
	public void setResidentID(String residentID) {
		preset(residentIDPropertyName, residentID);
		this.residentID = residentID;
	}

	/**
	 * {@link #residentName} accessor.
	 * @return	The value.
	 **/
	public String getResidentName() {
		return residentName;
	}

	/**
	 * {@link #residentName} mutator.
	 * @param residentName	The new value.
	 **/
	@XmlElement
	public void setResidentName(String residentName) {
		preset(residentNamePropertyName, residentName);
		this.residentName = residentName;
	}

	/**
	 * {@link #photo} accessor.
	 * @return	The value.
	 **/
	public String getPhoto() {
		return photo;
	}

	/**
	 * {@link #photo} mutator.
	 * @param photo	The new value.
	 **/
	@XmlElement
	public void setPhoto(String photo) {
		preset(photoPropertyName, photo);
		this.photo = photo;
	}

	/**
	 * {@link #DOB} accessor.
	 * @return	The value.
	 **/
	public DateOnly getDOB() {
		return DOB;
	}

	/**
	 * {@link #DOB} mutator.
	 * @param DOB	The new value.
	 **/
	@XmlSchemaType(name = "date")
	@XmlJavaTypeAdapter(DateOnlyMapper.class)
	@XmlElement
	public void setDOB(DateOnly DOB) {
		preset(DOBPropertyName, DOB);
		this.DOB = DOB;
	}

	/**
	 * {@link #roomNo} accessor.
	 * @return	The value.
	 **/
	public Integer getRoomNo() {
		return roomNo;
	}

	/**
	 * {@link #roomNo} mutator.
	 * @param roomNo	The new value.
	 **/
	@XmlElement
	public void setRoomNo(Integer roomNo) {
		preset(roomNoPropertyName, roomNo);
		this.roomNo = roomNo;
	}

	/**
	 * {@link #BIO} accessor.
	 * @return	The value.
	 **/
	public String getBIO() {
		return BIO;
	}

	/**
	 * {@link #BIO} mutator.
	 * @param BIO	The new value.
	 **/
	@XmlElement
	public void setBIO(String BIO) {
		preset(BIOPropertyName, BIO);
		this.BIO = BIO;
	}

	/**
	 * {@link #admissionDate} accessor.
	 * @return	The value.
	 **/
	public DateOnly getAdmissionDate() {
		return admissionDate;
	}

	/**
	 * {@link #admissionDate} mutator.
	 * @param admissionDate	The new value.
	 **/
	@XmlSchemaType(name = "date")
	@XmlJavaTypeAdapter(DateOnlyMapper.class)
	@XmlElement
	public void setAdmissionDate(DateOnly admissionDate) {
		preset(admissionDatePropertyName, admissionDate);
		this.admissionDate = admissionDate;
	}

	/**
	 * {@link #facilityName} accessor.
	 * @return	The value.
	 **/
	public Facility getFacilityName() {
		return facilityName;
	}

	/**
	 * {@link #facilityName} mutator.
	 * @param facilityName	The new value.
	 **/
	@XmlElement
	public void setFacilityName(Facility facilityName) {
		if (this.facilityName != facilityName) {
			preset(facilityNamePropertyName, facilityName);
			this.facilityName = facilityName;
		}
	}

	/**
	 * {@link #assessments} accessor.
	 * @return	The value.
	 **/
	@XmlElement
	public List<Assessment> getAssessments() {
		return assessments;
	}

	/**
	 * {@link #assessments} accessor.
	 * @param bizId	The bizId of the element in the list.
	 * @return	The value of the element in the list.
	 **/
	public Assessment getAssessmentsElementById(String bizId) {
		return getElementById(assessments, bizId);
	}

	/**
	 * {@link #assessments} mutator.
	 * @param bizId	The bizId of the element in the list.
	 * @param element	The new value of the element in the list.
	 **/
	public void setAssessmentsElementById(String bizId, Assessment element) {
		setElementById(assessments, element);
	}

	/**
	 * {@link #assessments} add.
	 * @param element	The element to add.
	 **/
	public boolean addAssessmentsElement(Assessment element) {
		boolean result = assessments.add(element);
		element.setParent(this);
		return result;
	}

	/**
	 * {@link #assessments} add.
	 * @param index	The index in the list to add the element to.
	 * @param element	The element to add.
	 **/
	public void addAssessmentsElement(int index, Assessment element) {
		assessments.add(index, element);
		element.setParent(this);
	}

	/**
	 * {@link #assessments} remove.
	 * @param element	The element to remove.
	 **/
	public boolean removeAssessmentsElement(Assessment element) {
		boolean result = assessments.remove(element);
		element.setParent(null);
		return result;
	}

	/**
	 * {@link #assessments} remove.
	 * @param index	The index in the list to remove the element from.
	 **/
	public Assessment removeAssessmentsElement(int index) {
		Assessment result = assessments.remove(index);
		result.setParent(null);
		return result;
	}

	/**
	 * {@link #residentStatus} accessor.
	 * @return	The value.
	 **/
	public ResidentStatus getResidentStatus() {
		return residentStatus;
	}

	/**
	 * {@link #residentStatus} mutator.
	 * @param residentStatus	The new value.
	 **/
	@XmlElement
	public void setResidentStatus(ResidentStatus residentStatus) {
		preset(residentStatusPropertyName, residentStatus);
		this.residentStatus = residentStatus;
	}

	/**
	 * hasID
	 *
	 * @return The condition
	 */
	@XmlTransient
	public boolean isHasID() {
		return (getResidentID()!=null);
	}

	/**
	 * {@link #isHasID} negation.
	 *
	 * @return The negated condition
	 */
	public boolean isNotHasID() {
		return (! isHasID());
	}
}
