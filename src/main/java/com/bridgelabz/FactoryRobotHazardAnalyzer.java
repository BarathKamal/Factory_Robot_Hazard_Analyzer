package com.bridgelabz;

import java.util.Scanner;

/*
FactoryRobotHazardAnalyzer class handling the input and output of the system
 */

// UC8: Fully Modular & OOPS-Compliant Hazard Analyzer
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

        // try-catch block handling the custom exceptions
        try {
            double hazardRiskScore = RobotHazardAuditor.calculateHazardRisk(armPrecision, workerDensity, machineryState);
            System.out.println("Hazard Risk Score: " + hazardRiskScore);
        } catch (RobotSafetyException e) {}

        scanner.close();
    }
}


