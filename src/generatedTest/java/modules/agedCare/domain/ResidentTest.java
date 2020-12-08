package modules.agedCare.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class ResidentTest extends AbstractDomainTest<Resident> {

	@Override
	protected Resident getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Resident.MODULE_NAME, Resident.DOCUMENT_NAME);
	}
}