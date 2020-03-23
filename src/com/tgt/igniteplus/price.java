package com.tgt.igniteplus;

public class price {
    public static void main(String[] args) {
        int mrp=50;
        int disper=12;
        System.out.println("The MRP of the pen is " + mrp + " dollars");
        System.out.println("The discount on the mrp is  " + disper + "%");
        double dis=(12*50)/100;
        System.out.println("The discount in dollars is " + dis + " dollars");
        double sp= mrp-dis;
        System.out.println("The selling price of the pen after discount is " + sp +" dollars");
    }
}
