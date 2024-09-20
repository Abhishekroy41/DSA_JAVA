package Conditionals;

import java.util.Scanner;

public class Threedigit_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the three digit no");
        int n = sc.nextInt();
        if(n>99 && n<1000){
            System.out.println("this is a 3 digit no");
        }
        else {
            System.out.println("not a 3 digit no");
        }
    }
}
