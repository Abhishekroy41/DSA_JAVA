package Conditionals;
import java.util.Scanner;
public class greatestno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no's: ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println(a + "is greatest");
        } else if (b>a && b>c) {
            System.out.println(b +"is greatest");
        } else if (c>a && c>b) {
            System.out.println(c +"is greatest");
        }
    }
}
