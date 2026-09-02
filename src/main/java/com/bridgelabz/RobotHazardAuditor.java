package com.bridgelabz;

/*
RobotHazardAuditor class handling the Business Logic
 */

// UC8: Fully Modular & OOPS-Compliant Hazard Analyzer
public class RobotHazardAuditor {

    // UC5: Refactor Validation into a Separate Method
    // Method can throw exceptions
    public static double calculateHazardRisk(double armPrecision, int workerDensity, String machineryState) throws RobotSafetyException {
        double hazardRiskScore = -1;

        // UC4: Introduce Validation Using Conditional Logic
        // Updated the validation to use exception handling
        if (armPrecision < 0 || armPrecision > 1) {
            throw new RobotSafetyException("Invalid Arm Precision Value");
        }
        else if (workerDensity < 0 ||workerDensity > 20) {
            throw new RobotSafetyException("Invalid Worker Density Value");
        }
        else if (!(machineryState.equals("Worn") ||
                machineryState.equals("Faulty") ||
                machineryState.equals("Critical"))) {
            throw new RobotSafetyException("Invalid Machinery State");
        }
        else {

            // UC3: Calculate Hazard Risk Score (No Validation)
            // Updated (UC7) to use enumeration for machinery state risk mapping
            MachineryState state = MachineryState.valueOf(machineryState);
            double machineRiskFactor = state.getMachineRiskFactor();

            // hazardRiskScore formula
            hazardRiskScore = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);
        }

        return hazardRiskScore;
    }
}
