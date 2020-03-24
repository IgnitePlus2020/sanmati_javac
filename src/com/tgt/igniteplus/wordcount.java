package src.com.tgt.igniteplus;

import java.util.Scanner;

public class wordcount {
    public static void main(String[] args) {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = in.nextLine();
        char ch[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                count++;
        }
        System.out.println("The number of words in the string are " + count);
    }
}
