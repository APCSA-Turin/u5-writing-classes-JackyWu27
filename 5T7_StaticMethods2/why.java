import java.util.Scanner;

public class why {
    public why () {}
    public void activate () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance traveled:");
        double distance = scanner.nextDouble();
        System.out.print("Enter speed of travel:");
        double speed = scanner.nextDouble();
        System.out.print("Enter \"miles\" or \"km\":"); 
        scanner.nextLine();
        String scale = scanner.nextLine();
        second s = new second(distance, scale);
        s.pointTopoint(speed, scale);
    }
}
