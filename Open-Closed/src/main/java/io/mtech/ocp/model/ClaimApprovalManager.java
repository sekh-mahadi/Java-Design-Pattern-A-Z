package io.mtech.ocp.model;

public class ClaimApprovalManager {
	
public void processClaim(InsuranceSurveyor surveyor) {
	if (surveyor.isValidClaim()) {
		System.out.println("ClaimApprovalManager: Valid claim.Currently processing claim for approval....");
	}
}
}
