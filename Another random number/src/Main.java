import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String answer = scanner.next();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        while(!answer.equalsIgnoreCase("No"))
        {
            while (answer.equalsIgnoreCase("Yes"))
            {
                randomNumbers.add((int) (Math.random() * 10));
                System.out.print("Please enter yes or no: ");
                answer = scanner.next();
                if(answer.equalsIgnoreCase("No"))
                {
                    break;
                }
            }
            if(!answer.equalsIgnoreCase("Yes") && !answer.equalsIgnoreCase("No"))
            {
                System.out.print("Please enter yes or no: ");
                answer = scanner.next();
            }
        }
        System.out.println("Random number: " + randomNumbers);
    }
}