package src.com.tgt.igniteplus;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("The largest number among the three numbers is");
        int result = (c>((a>b)?a:b)) ? c : ((a>b)?a:b);
        System.out.print(result);
    }
}
