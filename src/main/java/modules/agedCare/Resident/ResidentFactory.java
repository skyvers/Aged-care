package modules.agedCare.Resident;

import org.skyve.util.DataBuilder;
import org.skyve.util.test.SkyveFixture;
import org.skyve.util.test.SkyveFixture.FixtureType;

import modules.agedCare.domain.Resident;

public class ResidentFactory {

	private static final String TEST_PHOTO_CONTENT_ID = "test-resident-photo";

	@SkyveFixture(types = FixtureType.crud)
	public static Resident crudInstance() throws Exception {
		Resident resident = new DataBuilder().factoryBuild(Resident.MODULE_NAME, Resident.DOCUMENT_NAME);
		resident.setPhoto(TEST_PHOTO_CONTENT_ID);
		return resident;
	}
}
