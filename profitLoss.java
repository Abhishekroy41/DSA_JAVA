import java.util.Scanner;
class profitLoss{
    public static void main(String[] args) {
        System.out.println("Profit/Loss table");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price:");
        int cp = sc.nextInt();
        System.out.println("enter the Selling price:");
        int sp = sc.nextInt();
        if (sp > cp){
            System.out.print("Your Profit is : ");
        int profit = sp - cp;
        System.out.println(profit);
    }
        else{
            System.out.print("Your loss is :");
            int loss= cp - sp;
            System.out.println(loss);
        }
    }
}
