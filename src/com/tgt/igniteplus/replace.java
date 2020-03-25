package src.com.tgt.igniteplus;

import java.util.Scanner;

public class replace {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        String str= "I am always ready to learn although I do not always like being taught";
        System.out.println(str);
        char s[]= str.toCharArray();
        for(int i=0;i<str.length();i++)
            if(s[i]=='a' || s[i]=='A')
                s[i]='$';

        System.out.println("The string after replacing all a's with $'s is ");
        for(int i=0;i<str.length();i++)
            System.out.print(s[i]);
    }
}
