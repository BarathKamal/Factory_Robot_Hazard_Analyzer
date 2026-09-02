package com.bridgelabz;
/*
Enumeration MachineryState mapping machineryState with the machineRiskFactor
 */

// UC8: Fully Modular & OOPS-Compliant Hazard Analyzer

// UC7: Machinery state risk mapping
// Using Enumeration
enum MachineryState {
    Worn(1.3),
    Faulty(2.0),
    Critical(3.0);

    private final double machineRiskFactor;

    MachineryState(double machineRiskFactor) {
        this.machineRiskFactor = machineRiskFactor;
    }

    public double getMachineRiskFactor() {
        return machineRiskFactor;
    }
}
