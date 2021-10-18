package io.mtech.ocp.model;

public class HealthInsuranceSurveyor extends InsuranceSurveyor{

	@Override
	public boolean isValidClaim() {
	       System.out.println("VehicleInsuranceSurveyor: Validating vehicle insurance claim...");
		return true;
	}

}
