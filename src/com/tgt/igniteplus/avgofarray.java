package com.tgt.igniteplus;

import java.util.Scanner;

public class avgofarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n= in.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        double average=0;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=a[i];
        average=sum/n;
        System.out.println("The average of the elements in the array is " + average);

    }
}
