import java.util.Scanner;
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of experience: ");
        int years = sc.nextInt();
        double bonus;
        if (years > 5) bonus = salary * 0.15;
        else if (years >= 3) bonus = salary * 0.10;
        else bonus = salary * 0.05;
        System.out.println("Bonus: ₹" + bonus);
    }
}