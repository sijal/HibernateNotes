package com.tpch.entities;

import lombok.Data;

@Data
public class AccidentalInsurancePlan extends InsurancePlan {
	protected boolean internationalCoverage;
	protected float disabilityCoveragePercentage;
}
