package Conditionals;

import java.util.Scanner;

public class divby5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int n = sc.nextInt();
        if(n%5==0 && n%3==0){
            System.out.println("the no u enter is div by both 5 and 3");
        }
        else {
            System.out.println("not div. by 5 and 3");
        }
    }
}
