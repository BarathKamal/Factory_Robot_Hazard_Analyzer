package com.bridgelabz;

import java.util.Scanner;

// UC1: Display Static Hazard Message
public class FactoryRobotHazardAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factory Robot Hazard Analyzer");

        // UC2: Accept Robot Hazard Inputs
        System.out.println("Enter arm precision (0.0 - 1.0): ");
        double armPrecision = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter Worker Density (1 - 20): ");
        int workerDensity = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Machinery State (Worn/Faulty/Critical): ");
        String machineryState = scanner.nextLine();

        scanner.close();
    }
}
