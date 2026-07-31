/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog6112icetask1;

/**
 *
 * @author Student
 */
public class Prog6112IceTask1 {

    public static void main(String[] args) {
        
        //1D array for the laboratory names
        String []labNames = {"PROGRAMMING", "NETWORKING", "MULTIMEDIA"};
        
        //This is the 2D array that will store the weekly booking figures
        int [][]bookings = {
            //This is the first weeks bookings
            {32, 18, 24},
            
            //This is the second weeks bookings
            {28, 25, 19},
            
            //This is the third weeks bookings
            {35, 20, 27},
            
            //This is the fourth weeks bookings
            {30, 22, 21}
        };
        
        //Prints report header
        System.out.println("========================================================");
    //Display the table heading
    System.out.println("COMPUTER BOOKING LAB REPORT");
    System.out.println("================================================================");
    
    //Display the column headings
    System.out.printf("%-10s", "WEEK");
    for (int i = 0; i < labNames.length; i++){
        System.out.printf("%-18s", labNames[i]);
    }
    
    //Displaying a line underneath the columns
    System.out.println("--------------------------------");
        
    //the outer loop that will go through each row
    for (int row = 0; row < bookings.length; row++){
    
    //Displaying the weeklyBookings
    System.out.printf("Week%-5d",(row+1));
    
    
    //Inner loop that goes thrrough each lab bookings(columns)
    for (int col = 0; col < bookings[row].length; col++ ){
    
    //Display the columns
    System.out.printf("%-18d",bookings[row][col]);
}//Close the inner loop
    System.out.println();
}
//Close the outer loop
System.out.println("------------------------------------------------------------------");

//Calculate and print results
int[] total = new int[labNames.length];
double[]average = new double[labNames.length];
int[] min = new int[labNames.length];
int[] max = new int[labNames.length];
for (int col = 0; col < labNames.length;col++){
    min[col] = bookings[0][col];
    max[col] = bookings[0][col];
    
    for(int row = 0; row < bookings.length; row++){
    total[col] += bookings[row][col];
    if(bookings[row][col] < min[col])min[col]= bookings[row][col];
    if(bookings[row][col] > max[col]) max[col] = bookings[row][col];
}
    average[col] = (double)total[col] / bookings.length;
    }
    //Output summary
    System.out.printf("%-10s", "TOTAL");
    for(int val : total)System.out.printf("%-18d", val);
    System.out.println();
    System.out.printf("%-10s", "AVERAGE");
    for(double val : average) 
        System.out.printf("%-18.2f",val);
    System.out.println();
    System.out.printf("%-10s", "MINIMUM");
    for(double val : min) 
        System.out.printf("%-10s", val);
    System.out.println();
    System.out.printf("%-10s", "MAXIMUM");
    for(int val : max)
        System.out.printf("%-18d", val);
    
    System.out.println("\n===============================================================================");
}
}

