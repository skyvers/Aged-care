package modules.agedCare.Assessment;

import org.skyve.domain.types.DateTime;
import org.skyve.metadata.model.document.Bizlet;

import modules.admin.ModulesUtil;
import modules.agedCare.domain.Assessment;

public class AssessmentBizlet extends Bizlet<Assessment> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2286961040250324230L;

	@Override
	public Assessment newInstance(Assessment bean) throws Exception {
		// TODO Auto-generated method stub
		bean.setAssessmentCreatedTime(new DateTime());
		bean.setCreatedBy(ModulesUtil.currentAdminUser());
		return super.newInstance(bean);
	}

}
