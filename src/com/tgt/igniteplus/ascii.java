package com.tgt.igniteplus;

import java.util.Scanner;

public class ascii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character");
        ch=in.next().charAt(0);
        int ascii=(int)ch;
        System.out.println("The ASCII value of " + ch + " is " + ascii);


    }
}
