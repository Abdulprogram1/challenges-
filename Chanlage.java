package com.mycompany.chanlage;


import java.util.Scanner;

public class Chanlage {

    public static void main(String[] args) {
        System.out.println("Primetr of a rectanguler");
        Scanner sc = new Scanner(System.in);
         double a = sc.nextDouble();
          System.out.println(" First side = "+a + " cm");
        double b = sc.nextDouble();
        System.out.println("Second side = "+b + " cm");
         double c = sc.nextDouble();
          System.out.println("Third side = "+c + " cm");
        double d = sc.nextDouble();
        System.out.println("Fourth side = "+d + " cm");
        double pmeter = a + b + c + d;
        System.out.println("Parameter = "+pmeter+ "cm");
    }
}
