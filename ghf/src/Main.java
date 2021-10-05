import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: ");
        int number = scan.nextInt();
        System.out.println("Number is: " + number);
    }
}
