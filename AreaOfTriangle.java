/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.areaoftriangle;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class AreaOfTriangle {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
    System.out.println("Triangle Area Calculater");
    System.out.print("Please enter Tringle Hight lenth in cm : ");
    float hightLenghth = sc.nextFloat();
    System.out.println("tringle hight = " + hightLenghth + "cm");
    System.out.print("Please enter Base of triangle in cm: ");
    float baseLenghth = sc.nextFloat();
    System.out.println("Triangle base lanth = " + baseLenghth + "cm");
    double area = 0.5 *hightLenghth * baseLenghth;
    System.out.println("Area = " +area + "cm");
    }
}
