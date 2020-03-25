package src.com.tgt.igniteplus;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1= in.nextLine();
        System.out.println("Enter another string");
        String str2= in.nextLine();
        int j=0;
        for (int i = 0; i < str2.length() && j < str1.length(); i++)
            if (str1.charAt(j) == str2.charAt(i))
                j++;
            if(j==str1.length())
                System.out.println("Substring");
    }
}
