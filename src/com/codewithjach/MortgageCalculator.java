package com.codewithjach;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        final byte monthinyaer=12;
        final byte percent = 100;

        Scanner input = new Scanner(System.in);

        System.out.println("principal");
        long principal = input.nextLong();

        System.out.println("annual interest rate");
        double anualInterestRate = input.nextDouble();

        System.out.println("period(in years)");
        byte periodInYears = input.nextByte();

        //solving, using the formula mortgage=p*(1+r)^n/(1+r)^n-1

        //where r=monthly interest rate
        double r =anualInterestRate/monthinyaer/percent;
        //where n=(numbers of years)
        int n = periodInYears*monthinyaer;
        //where p=principal
        long p = principal;

        //substituting values in the formula
        double mortgage =   p*r*Math.pow(1+r,n)/Math.pow(1+r,n)-1;
        String mortgage2 = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("mortgage: "+ mortgage2);
    }
}


