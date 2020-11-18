package modules.agedCare.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class FacilityTest extends AbstractDomainTest<Facility> {

	@Override
	protected Facility getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Facility.MODULE_NAME, Facility.DOCUMENT_NAME);
	}
}