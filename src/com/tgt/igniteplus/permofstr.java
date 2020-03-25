package src.com.tgt.igniteplus;

import java.util.Scanner;

public class permofstr {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String str = "GOD";
        permut(str, "");
    }
    static void permut(String str, String ans)
    {
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String rest = str.substring(0, i) + str.substring(i + 1);
            permut(rest, ans + ch);
        }
    }

}
