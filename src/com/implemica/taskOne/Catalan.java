package com.implemica.taskOne;

import java.util.Scanner;

/**
 * Created by 1 on 09.06.2016.
 */
public class Catalan {

    Scanner sc = new Scanner(System.in);

    int catalanNumb(int n){
        System.out.println("Enter the number ");
        n = sc.nextInt();
        return ((factorial(2*n))/((factorial(n+1)*factorial(n))));
    }

   int factorial(int n){
       int f =1;
       for (int i = 1; i <= n; i++) {
           f *= i;
       }
       return f;
    }
}
