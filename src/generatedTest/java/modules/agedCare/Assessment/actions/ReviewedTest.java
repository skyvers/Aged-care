package modules.agedCare.Assessment.actions;

import modules.agedCare.domain.Assessment;
import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractActionTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractActionTest} to create your own tests for this action.
 */
public class ReviewedTest extends AbstractActionTest<Assessment, Reviewed> {

	@Override
	protected Reviewed getAction() {
		return new Reviewed();
	}

	@Override
	protected Assessment getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Assessment.MODULE_NAME, Assessment.DOCUMENT_NAME);
	}
}