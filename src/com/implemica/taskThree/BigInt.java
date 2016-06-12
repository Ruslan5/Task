package com.implemica.taskThree;

import java.math.BigInteger;

/**
 * Created by 1 on 08.06.2016.
 */
public class BigInt {
    public static void main(String[] args) {
        BigInteger f = BigInteger.valueOf(1);

        //find the factorial of number 100
        for (long i = 1; i <= 100; i++) {
            f = f.multiply(BigInteger.valueOf(i));
            System.out.println(i + "! = " + f);
        }
        //the sum of the digits
        String x = f.toString();
        int data [] = new int[x.length()];
        int sum = 0;
        for (int j = 0; j < x.length(); j++) {
            data[j] = (int)x.charAt(j)^48;
            sum += data[j];
        }

        System.out.println(sum);



    }
}
