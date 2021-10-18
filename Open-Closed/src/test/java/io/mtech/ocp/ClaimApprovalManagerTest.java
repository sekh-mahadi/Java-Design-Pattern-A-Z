package io.mtech.ocp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.mtech.ocp.model.ClaimApprovalManager;
import io.mtech.ocp.model.HealthInsuranceSurveyor;
import io.mtech.ocp.model.VehicleInsuranceSurveyor;

class ClaimApprovalManagerTest {

	@Test
	void testProcessClaim() throws Exception {
		HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
		ClaimApprovalManager claim1 = new ClaimApprovalManager();
		claim1.processClaim(healthInsuranceSurveyor);

		VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
		ClaimApprovalManager claim2 = new ClaimApprovalManager();
		claim2.processClaim(vehicleInsuranceSurveyor);
	}

}
