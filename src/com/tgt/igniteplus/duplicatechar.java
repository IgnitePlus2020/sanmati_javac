package src.com.tgt.igniteplus;

import java.util.Scanner;

public class duplicatechar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str= in.nextLine();
        char s[]= str.toCharArray();
        System.out.println("The duplicate character(s) in the string " + str + " are ");
        for(int i=0;i<str.length();i++)
            for(int j=i+1;j<str.length();j++)
                if(s[i]==s[j])
                    System.out.println(s[i]);
    }
}
