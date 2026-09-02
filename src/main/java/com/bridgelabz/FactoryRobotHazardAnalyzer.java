package com.bridgelabz;

import java.util.Scanner;

/*
Program that implements UC7 by mapping machineryState with respective machineRiskFactor using enumertion
 */

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

// UC6: Introduce custom exception - RobotSafetyException
class RobotSafetyException extends Exception {
    public RobotSafetyException(String message) {
        super(message);
        System.out.println("Exception: " + message);
    }
}

public class FactoryRobotHazardAnalyzer {

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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // UC1: Display Static Hazard Message
        System.out.println("Factory Robot Hazard Analyzer");

        // UC2: Accept Robot Hazard Inputs
        // armPrecision input
        System.out.println("Enter arm precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();
        scanner.nextLine();

        // workerDensity input
        System.out.println("Enter Worker Density (1 - 20): ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        // machineryState input
        System.out.println("Enter Machinery State (Worn/Faulty/Critical): ");
        String machineryState = scanner.nextLine();

        // try-catch block handling the custom exceptions
        try {
            double hazardRiskScore = calculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println("Hazard Risk Score: " + hazardRiskScore);
        } catch (RobotSafetyException e) {}

        scanner.close();
    }
}


