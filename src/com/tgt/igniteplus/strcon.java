package src.com.tgt.igniteplus;

import java.util.Scanner;

public class strcon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter one string");
        String str1= in.nextLine();
        System.out.println("Enter another string");
        String str2= in.nextLine();
        String str3= str1.concat(str2);
        System.out.println("The concantenated string is " + str3);
    }
}
