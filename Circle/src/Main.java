import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, x2, y1, y2, r1, r2;
        int xDistance = 0, yDistance = 0;
        double circleDistance = 0;
        System.out.print("Enter a value for x1: ");
        x1 = scanner.nextInt();
        System.out.print("Enter a value for x2: ");
        x2 = scanner.nextInt();
        System.out.print("Enter a value for y1: ");
        y1 = scanner.nextInt();
        System.out.print("Enter a value for y2: ");
        y2 = scanner.nextInt();
        System.out.print("Enter a value for r1: ");
        r1 = scanner.nextInt();
        System.out.print("Enter a value for r2: ");
        r2 = scanner.nextInt();
        if(x1 >= x2)
        {
            xDistance = x1 - x2;
        }
        else
        {
            xDistance = x2 - x1;
        }
        if(y1 >= y2)
        {
            yDistance = y1 - y2;
        }
        else
        {
            yDistance = y2 - y1;
        }
        circleDistance = Math.sqrt(xDistance * xDistance + yDistance * yDistance);
        if(r1 + r2 > circleDistance)
        {
            System.out.println("Circles cross each other");
        }
        else if(r1 + r2 == circleDistance)
        {
            System.out.println("Circles touch each other");
        }
        else
        {
            System.out.println("Circles have no common tangents");
        }
    }
}
