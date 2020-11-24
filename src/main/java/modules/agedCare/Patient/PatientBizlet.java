package modules.agedCare.Patient;

import org.skyve.metadata.model.document.Bizlet;

import modules.admin.ModulesUtil;
import modules.agedCare.domain.Patient;

public class PatientBizlet extends Bizlet<Patient> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1455780144763235289L;

	
	public Patient newInstance(Patient bean) throws Exception {
		// TODO Auto-generated method stub
		
		
		 return super.newInstance(bean) ;

		
	}

	@Override
	public void preSave(Patient bean) throws Exception {
		
		if(bean.getPatientID()==null)
		{ 
			String patientId=ModulesUtil.getNextDocumentNumber("P", Patient.MODULE_NAME, Patient.DOCUMENT_NAME, Patient.patientIDPropertyName, 4);
			bean.setPatientID(patientId);
			return;
			
		}
		return;
	}

	
}
