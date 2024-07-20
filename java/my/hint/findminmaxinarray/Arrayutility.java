/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.hint.findminmaxinarray;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Arrayutility {
     public static int[] arrInput(){
       System.err.print("Please enter the eliment size: ");
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int arr[] =new int[size];
       for(int i =0; i < size; i++){
        System.out.print("Please enter the eliment "+ (i+1) + ": ");
        arr[i] = sc.nextInt();   
       }
       return arr;
    }
}
