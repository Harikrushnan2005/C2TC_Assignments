package com.tnsif.assingmenttwo;

//MainClass.java
/**
* The MainClass demonstrates the usage of Student and Commission classes.
*/
public class MainClass {
public static void main(String[] args) {
   // Demonstrate default constructor
   Student s = new Student();

   // Create Commission object and test methods
   Commission c = new Commission();
   c.acceptDetails();
   c.calculateCommission();
}
}