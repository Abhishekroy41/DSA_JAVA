import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0){
            num=num*(-1);
        }
        System.out.println(num);
        }
    }

