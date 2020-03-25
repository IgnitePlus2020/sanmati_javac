package src.com.tgt.igniteplus;

import java.util.Scanner;

public class uglynum {
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any number");
        int n=in.nextInt();
        if(uglyNum(n))
            System.out.println(n +" is an ugly number");
        else
            System.out.println(n + " is not an ugly number");
    }
    public static Boolean uglyNum(int num){
        while(num%2==0)
            num/=2;
        while(num%3==0)
            num/=3;
        while(num%5==0)
            num/=5;
        if (num==1)
            return true;
        else
            return false;
    }
}

