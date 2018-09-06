/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw_7.pkg1;

/**
 *
 * @author Benjamin Combs 2018
 */
public class CW_71 {
    
    /**
     * findAverage method is used to calculate the average integers in a 2 Dimensional Array
     * @param array 2 Dimensional array
     */
    
    public static void findAverage(int[][] array)
    {
        int total = 0;
        int amount = 0;
        double avg;
        
        //for loop to iterate through rows
        for (int row = 0; row < array.length; row++)
        {
            //for loop to iterate through columns
            for (int col = 0; col < array[row].length; col++)
            {
                total += array[row][col];
                amount++;
            }
        }
        avg = (double)total/amount;

        System.out.println("Average: " + avg);
    }

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        int[][] scores = {{78,98,22,67,99},{100,69,87,70,56},{77,85,79,97,101}};
        
        findAverage(scores);
    }
    
}
