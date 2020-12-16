package modules.agedCare.Assessment.actions;

import org.skyve.domain.types.DateTime;
import org.skyve.metadata.controller.ServerSideAction;
import org.skyve.metadata.controller.ServerSideActionResult;
import org.skyve.web.WebContext;

import modules.admin.ModulesUtil;
import modules.agedCare.domain.Assessment;

public class Reviewed implements ServerSideAction<Assessment> {

	@Override
	public ServerSideActionResult<Assessment> execute(Assessment bean, WebContext webContext) throws Exception {
		bean.setAssessmentReview(new DateTime());
		bean.setCreatedBy(ModulesUtil.currentAdminUser());
		return new ServerSideActionResult<>(bean);
	}

}
