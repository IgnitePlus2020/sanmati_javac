package src.com.tgt.igniteplus;

import java.util.Scanner;

public class uppercase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any string");
        String str= in.nextLine();
        String stru=str.toUpperCase();
        System.out.println("The string in uppercase is  " + stru);
    }
}
