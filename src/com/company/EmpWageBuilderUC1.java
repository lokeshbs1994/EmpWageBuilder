package com.company;

public class EmpWageBuilderUC1 {
    public static void main(String[] args){
        // Constructs
        int IS_FULL_TIME = 1;
                // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == IS_FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
