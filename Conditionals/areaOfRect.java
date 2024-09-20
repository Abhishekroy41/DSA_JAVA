package Conditionals;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class areaOfRect {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of a rectangle");
        int breadth = sc.nextInt();
        int area = length*breadth;
        int perimeter = 2 *(length+breadth);
        if(area>perimeter){
            System.out.println("area is greater");
        }
        if(perimeter>area){
            System.out.println("perimeter is greater then area");
        }
        if(area==perimeter){
            System.out.println("area and perimeter are equal");
        }
    }
}
