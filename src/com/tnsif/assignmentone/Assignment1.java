package com.tnsif.assignmentone;
import com.tnsif.assignmentone.employees.Manager;
import com.tnsif.assignmentone.employees.Developer;
import com.tnsif.assignmentone.utilities.EmployeeUtilities;

public class Assignment1 {
    public static void main(String[] args) {
        Manager mgr = new Manager("Alice", 101, 90000, "IT");
        Developer dev = new Developer("Bob", 102, 70000, "Java");

        System.out.println("=== Manager Details ===");
        EmployeeUtilities.printEmployeeDetails(mgr);
        System.out.println("Department: " + mgr.getDepartment());

        System.out.println("\n=== Developer Details ===");
        EmployeeUtilities.printEmployeeDetails(dev);
        System.out.println("Programming Language: " + dev.getProgrammingLanguage());
    }
}
		