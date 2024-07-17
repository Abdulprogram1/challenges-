/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sumavrageofarray;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SumAvrageofArray {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
      
        
        System.out.print(" Please enter element of array size : ");
        int size = sc.nextInt();
        int array[] = new int[size];
        long sum = 0;
        int i =0;
        while(i<size){
            System.out.print("please enter eliment of Array " + (i+1) + ": ");
            array[i] = sc.nextInt();
            sum += array[i];
            i++;
        
        }
         System.out.println("Element of array sum = " + sum );
        float avrage = sum/size;
        System.out.println("eliment of aarry avrage ="+  avrage);
    }
}
