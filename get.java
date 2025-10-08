import java.util.Scanner;

public class get{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        long number=sc.nextLong();
        String email=sc.next();
        sc.nextLine();
        String password=sc.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Number: "+number);
        System.out.println("Email:"+email);
        System.out.println("Password:"+password);
    }
    
}
