package com.tgt.igniteplus;

import java.util.Scanner;

public class perfsquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int flag=0;
        System.out.println("Enter a number");
        int n=in.nextInt();
        for(int i=1; i*i<=n;i++)
        {
            if((n%i==0) && (n/i==i))
               flag=1;
        }
        if(flag==1)
            System.out.println(n + " is a perfect square");
        else
            System.out.println(n + " is not a perfect square");
    }
}
