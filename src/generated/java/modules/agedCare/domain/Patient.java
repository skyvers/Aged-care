package modules.agedCare.domain;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.skyve.CORE;
import org.skyve.domain.messages.DomainException;
import org.skyve.domain.types.DateOnly;
import org.skyve.impl.domain.AbstractPersistentBean;
import org.skyve.impl.domain.ChangeTrackingArrayList;
import org.skyve.impl.domain.types.jaxb.DateOnlyMapper;

/**
 * Patient
 * <br/>
 * Details of the patient admitted to the facility.
 * 
 * @navcomposed 1 assessments 0..n Assessment
 * @navhas n facilityName 0..1 Facility
 * @stereotype "persistent"
 */
@XmlType
@XmlRootElement
public class Patient extends AbstractPersistentBean {
	/**
	 * For Serialization
	 * @hidden
	 */
	private static final long serialVersionUID = 1L;

	/** @hidden */
	public static final String MODULE_NAME = "agedCare";
	/** @hidden */
	public static final String DOCUMENT_NAME = "Patient";

	/** @hidden */
	public static final String patientIDPropertyName = "patientID";
	/** @hidden */
	public static final String patientNamePropertyName = "patientName";
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

	/**
	 * Patient ID
	 **/
	private String patientID;
	/**
	 * Patient Name
	 **/
	private String patientName;
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

	@Override
	@XmlTransient
	public String getBizModule() {
		return Patient.MODULE_NAME;
	}

	@Override
	@XmlTransient
	public String getBizDocument() {
		return Patient.DOCUMENT_NAME;
	}

	public static Patient newInstance() {
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
			return org.skyve.util.Binder.formatMessage("Patient - {patientID}", this);
		}
		catch (@SuppressWarnings("unused") Exception e) {
			return "Unknown";
		}
	}

	@Override
	public boolean equals(Object o) {
		return ((o instanceof Patient) && 
					this.getBizId().equals(((Patient) o).getBizId()));
	}

	/**
	 * {@link #patientID} accessor.
	 * @return	The value.
	 **/
	public String getPatientID() {
		return patientID;
	}

	/**
	 * {@link #patientID} mutator.
	 * @param patientID	The new value.
	 **/
	@XmlElement
	public void setPatientID(String patientID) {
		preset(patientIDPropertyName, patientID);
		this.patientID = patientID;
	}

	/**
	 * {@link #patientName} accessor.
	 * @return	The value.
	 **/
	public String getPatientName() {
		return patientName;
	}

	/**
	 * {@link #patientName} mutator.
	 * @param patientName	The new value.
	 **/
	@XmlElement
	public void setPatientName(String patientName) {
		preset(patientNamePropertyName, patientName);
		this.patientName = patientName;
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
}
