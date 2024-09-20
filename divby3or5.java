package Conditionals;

import java.util.Scanner;

public class divby3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();
        if(n%5==0 || n%3==0){
            System.out.println("The no is div by 5 or 3");
        }
        else {
            System.out.println("not div by 5 or 3");
        }
    }
}
