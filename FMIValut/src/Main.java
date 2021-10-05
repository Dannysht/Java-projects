import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cardNumber;
        System.out.print("Please enter your card number: ");
        cardNumber = scanner.nextInt();
        int cardVersion = cardNumber / 100000000;
        int ownerSpec = (cardNumber / 1000000) % 10;
        int ownerId = cardNumber % 1000000 / 10 ;
        int ownerIdFirstNumber = (ownerId / 10000);
        int ownerIdSecondNumber = (ownerId / 1000 )% 10;
        int ownerIdThirdNumber = (ownerId / 100 )% 10;
        int ownerIdFourthNumber = (ownerId / 10 )% 10;
        int ownerIdFifthNumber = ownerId % 10;
        if(cardVersion >= 10 || cardVersion <= 0 || ownerSpec == 7 || ownerSpec > 8
                || (ownerIdFirstNumber == 0 && ownerIdFirstNumber == ownerIdSecondNumber)
                || (ownerIdSecondNumber == 0 && ownerIdSecondNumber == ownerIdThirdNumber)
                ||(ownerIdThirdNumber == 0 && ownerIdThirdNumber == ownerIdFourthNumber)
                ||(ownerIdFourthNumber == 0 && ownerIdFourthNumber == ownerIdFifthNumber))
        {
            System.out.println("Invalid card number");
        }
        System.out.print("{ \"card_version\":" + cardVersion);
        switch (ownerSpec)
        {
            case 0:
            {
                System.out.print(", \"owner_spec\":" + "\"Informatics\"");
                break;
            }
            case 1:
            {
                System.out.print(", \"owner_spec\":" + "\"Computer Science\"");
                break;
            }
            case 2:
            {
                System.out.print(", \"owner_spec\":" + "\"Information systems\"");
                break;
            }
            case 3:
            {
                System.out.print(", \"owner_spec\":" + "\"Software engineering\"");
                break;
            }
            case 4:
            {
                System.out.print(", \"owner_spec\":" + "\"Applied Maths\"");
                break;
            }
            case 5:
            {
                System.out.print(", \"owner_spec\":" + "\"Maths\"");
                break;
            }
            case 6:
            {
                System.out.print(", \"owner_spec\":" + "\"Statistics\"");
                break;
            }
            case 8:
            {
                System.out.print(", \"owner_spec\":" + "\"Mathematics & Informatics\"");
                break;
            }
        }
        System.out.print(", \"owner_id\": " + ownerId + " }");
    }
}
