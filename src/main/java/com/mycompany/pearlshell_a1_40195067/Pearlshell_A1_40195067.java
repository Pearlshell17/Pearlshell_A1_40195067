/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pearlshell_a1_40195067;

/**
 *
 * @author 40195067
 */

public class Pearlshell_A1_40195067 {

    static String[] months = {
        "Jan", "Feb", "Mar", "Apr", "May", "Jun",
        "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static void main(String[] args) {

        int[] temp23 = {8, 9, 12, 16, 18, 22, 24, 22, 20, 16, 12, 9};
        int[] temp24 = {8, 8, 12, 17, 19, 20, 23, 22, 19, 16, 10, 8};

        // this will print the months header
        System.out.print("Month | ");
            for (int i = 0; i < months.length; i++) {
            System.out.printf("%4s", months[i]);
        }
        System.out.println();

        // seperator line that make the code into a table. the for loop ensure that the line is long enought to cover the 12 months
        System.out.print("------+");
            for (int i = 0; i < months.length; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Print 2023 temperatures
        System.out.print("2023  | ");
            for (int i = 0; i < temp23.length; i++) {
            System.out.printf("%4d", temp23[i]);
        }
        System.out.println();

        // Print 2024 temperatures
        System.out.print("2024  | ");
            for (int i = 0; i < temp24.length; i++) {
            System.out.printf("%4d", temp24[i]);
        }
        System.out.println();
        
        //table ends here
 
        //bubble sort in ascending order
        System.out.println();
        System.out.println("Bubble sort in ascending order");
        
        // this will create a copy so that the origianl table stays the same.
        String[] MonthsSorted = months.clone();
        int[] temp23Sorted =temp23.clone();
        int[] temp24Sorted =temp24.clone();
        
        
        // to call the bubble sort.java
        BubbleSort.sortAscending(temp23Sorted, temp24Sorted, MonthsSorted);
        
        //print the sorted table
        // this will print the months header
        System.out.print("Month | ");
            for (int i = 0; i < MonthsSorted.length; i++) {
            System.out.printf("%4s", MonthsSorted[i]);
        }
       
        System.out.println("");
        System.out.print("------+");
            for (int i = 0; i < MonthsSorted.length; i++) {
            System.out.print("----");
        }
        System.out.println();

        // Print 2023 temperatures
        System.out.print("2023  | ");
            for (int i = 0; i < temp23Sorted.length; i++) {
            System.out.printf("%4d", temp23Sorted[i]);
        }
        System.out.println();

        // Print 2024 temperatures
        System.out.print("2024  | ");
            for (int i = 0; i < temp24Sorted.length; i++) {
            System.out.printf("%4d", temp24Sorted[i]);
        }
        System.out.println();
        
        
        
        // AVERAGE 2023 and 2024
        
        int avg2023 = 0;
        int avg2024 = 0;
        
        //calculating the total
        for (int i=0; i<temp23Sorted.length; i++){
        avg2023 += temp23Sorted[i];
        avg2024 += temp24Sorted[i];
    }
        
        
        //calculate the averrage
        avg2023 = avg2023 / temp23Sorted.length;
        avg2024 = avg2024 / temp24Sorted.length;
        
        
        System.out.println("Average temperature for 2023: "+ avg2023);
        System.out.println("Average temperature for 2024: "+ avg2024);
    }
    
    
}


    

    



