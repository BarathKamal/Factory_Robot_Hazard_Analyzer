package com.bridgelabz;

/*
RobotSafetyException class for Exception-based control flow
 */

// UC8: Fully Modular & OOPS-Compliant Hazard Analyzer

// UC6: Introduce custom exception - RobotSafetyException
class RobotSafetyException extends Exception {
    public RobotSafetyException(String message) {
        super(message);
        System.out.println("Exception: " + message);
    }
}
