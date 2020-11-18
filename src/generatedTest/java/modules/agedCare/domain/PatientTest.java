package modules.agedCare.domain;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture.FixtureType;
import util.AbstractDomainTest;

/**
 * Generated - local changes will be overwritten.
 * Extend {@link AbstractDomainTest} to create your own tests for this document.
 */
public class PatientTest extends AbstractDomainTest<Patient> {

	@Override
	protected Patient getBean() throws Exception {
		return new DataBuilder()
			.fixture(FixtureType.crud)
			.build(Patient.MODULE_NAME, Patient.DOCUMENT_NAME);
	}
}