import java.util.Scanner;

public class Trafficlight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String light = sc.nextLine();
        switch (light) {
            case "red":
            System.out.println("Stop the vehicle");break;
            case "yellow":
            System.out.println("Ready");break;
            case "green":
            System.out.println("Start the vehicle");break;
            default:
                break;
        }

    }
}
