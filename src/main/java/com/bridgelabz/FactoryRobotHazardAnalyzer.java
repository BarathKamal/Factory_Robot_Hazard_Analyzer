package com.bridgelabz;

import java.util.Scanner;

/*
Program that implements UC3 by calculating the Hazard Risk Factor without validation
 */

public class FactoryRobotHazardAnalyzer {

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

        // UC3: Calculate Hazard Risk Score (No Validation)
        double machineRiskFactor = 0.0;

        // Assigning machineryRiskFactor to respective machineryState
        if (machineryState.equals("Worn")) {
            machineRiskFactor = 1.3;
        } else if (machineryState.equals("Faulty")) {
            machineRiskFactor = 2.0;
        } else if (machineryState.equals("Critical")) {
            machineRiskFactor = 3.0;
        }

        // hazardRiskScore formula
        double hazardRiskScore = ((1.0 - armPrecision) * 15.0) + (workerDensity * machineRiskFactor);

        scanner.close();
    }
}
