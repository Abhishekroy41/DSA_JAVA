public class sumofinteger {
    public static void main (String []args){
        System.out.println("Sum of integera given");
        int i =123;
        int a= 0;
        int sum = 0;
        while(i>0){
            a= i%10;
            sum = sum+a;
            i = i/10;
        }
        System.out.println(sum);
    }
}
