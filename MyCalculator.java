package com.java;
  
import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        
    	Scanner in = new Scanner(System.in);

        System.out.println("Enter the marks of five subjects::\n");

        // values of five subjects
        float sub_1 = in.nextFloat();
        float sub_2 = in.nextFloat();
        float sub_3 = in.nextFloat();
        float sub_4 = in.nextFloat();
        float sub_5 = in.nextFloat();

        float totalmarks;
        float averagepercentage;
        char grade;

        // Calculate totalmarks and  averagepercentage
        
        totalmarks = sub_1 + sub_2 + sub_3 + sub_4 + sub_5;
        
       averagepercentage = (float)((totalmarks / 500.0) * 100);
        
       //  calculate the Grade
        if ( averagepercentage >= 90)
            grade = 'A';
        else if (averagepercentage >= 80 && averagepercentage  < 90)
            grade = 'B';
        else if (averagepercentage  >= 70 && averagepercentage  < 80)
            grade = 'C';
        else if (averagepercentage  >= 60 && averagepercentage  < 70)
            grade = 'D';
        else
            grade = 'E';

        // final output of student grade calculator
        
        System.out.println("\nThe Total marks   = " + totalmarks + "/500.0");
        System.out.println("The Average Percentage    = " + averagepercentage + "%");
        System.out.println("The Grade         = '" + grade + "'");
       
      
    }
}
