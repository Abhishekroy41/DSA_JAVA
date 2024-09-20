package Conditionals;

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks");
        int m = sc.nextInt();
        if (m > 90) {
            System.out.println("excellent");
        } else if (m > 80) {
            System.out.println("Very good");
        } else if (m > 70) {
            System.out.println("Good");
        } else if (m>60){
            System.out.println("u can do better");
        } else if (m>50) {
            System.out.println("Average");
        } else if (m>40) {
            System.out.println("below average");
        }
        else{
            System.out.println("fail");
    }
    }
}
