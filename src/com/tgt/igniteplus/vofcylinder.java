package com.tgt.igniteplus;

import java.util.Scanner;
import java.lang.*;

public class vofcylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of cylinder");
        double r=in.nextInt();
        System.out.println("Enter the height of cylinder");
        double h = in.nextInt();
        double volume= Math.PI*r*r*h;
        System.out.println("The volume of cylinder is " + volume);
    }
}
