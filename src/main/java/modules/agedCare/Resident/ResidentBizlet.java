package modules.agedCare.Resident;

import org.skyve.CORE;
import org.skyve.metadata.model.document.Bizlet;

import modules.agedCare.domain.Resident;

public class ResidentBizlet extends Bizlet<Resident> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1455780144763235289L;

	public Resident newInstance(Resident bean) throws Exception {
		// TODO Auto-generated method stub

		return super.newInstance(bean);

	}

	@Override
	public void preSave(Resident bean) throws Exception {

		if (bean.getResidentID() == null) {
			String residentId = CORE.getNumberGenerator().next("P", Resident.MODULE_NAME, Resident.DOCUMENT_NAME,
					Resident.residentIDPropertyName, 4);
			bean.setResidentID(residentId);
			return;

		}
		return;
	}

}
