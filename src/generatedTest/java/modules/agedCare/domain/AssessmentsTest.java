package modules.agedCare.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class AssessmentsTest extends AbstractDomainTest<Assessments> {

	@Override
	protected Assessments getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Assessments.MODULE_NAME, Assessments.DOCUMENT_NAME);
	}
}