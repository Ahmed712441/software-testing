package com.company;
import java.util.Scanner;
public class Main {
    public static boolean can_be_divided(int num) {
        return num%2==0 && num != 2;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();
        System.out.print( can_be_divided(weight)? "YES" : "NO" );

    }
}
