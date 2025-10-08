import java.util.Scanner;
public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();
        double discount = 0;
        if (amount > 5000) discount = amount * 0.20;
        else if (amount > 2000) discount = amount * 0.10;
        double finalAmount = amount - discount;
        System.out.println("Discount: ₹" + discount);
        System.out.println("Amount to pay: ₹" + finalAmount);
    }
}