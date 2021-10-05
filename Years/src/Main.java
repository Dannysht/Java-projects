import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter a year: ");
        year = scanner.nextInt();
        if(year > 3000 || year <= 0)
        {
            System.out.println("Invalid number!");
        }
        else
        {
            int yearFirstNum = year / 1000;
            int yearSecondNum = (year / 100) % 10;
            int yearThirdNumb = (year / 10) % 10;
            int yearFourthNum = year % 10 ;
            switch (yearFirstNum)
            {
                case 1:
                {
                    System.out.print("M");
                    break;
                }
                case 2:
                {
                    System.out.print("MM");
                    break;
                }
                case 3:
                {
                    System.out.print("MMM");
                }
            }
            switch (yearSecondNum) {
                case 1: {
                    System.out.print("C");
                    break;
                }
                case 2: {
                    System.out.print("CC");
                }
                case 3: {
                    System.out.print("CCC");
                    break;
                }
                case 4: {
                    System.out.print("CD");
                    break;
                }
                case 5: {
                    System.out.print("D");
                    break;
                }
                case 6: {
                    System.out.print("DC");
                    break;
                }
                case 7: {
                    System.out.print("DCC");
                    break;
                }
                case 8: {
                    System.out.print("DCCC");
                    break;
                }
                case 9: {
                    System.out.print("CM");
                    break;
                }
            }
                switch (yearThirdNumb) {
                    case 1: {
                        System.out.print("X");
                        break;
                    }
                    case 2: {
                        System.out.print("XX");
                        break;
                    }
                    case 3: {
                        System.out.print("XXX");
                        break;
                    }
                    case 4: {
                        System.out.print("XL");
                        break;
                    }
                    case 5: {
                        System.out.print("L");
                        break;
                    }
                    case 6: {
                        System.out.print("LX");
                        break;
                    }
                    case 7: {
                        System.out.print("LXX");
                        break;
                    }
                    case 8: {
                        System.out.print("LXXX");
                        break;
                    }
                    case 9: {
                        System.out.print("XC");
                    }
                }
                switch (yearFourthNum)
                {
                    case 1:
                    {
                        System.out.print("I");
                        break;
                    }
                    case 2:
                    {
                        System.out.print("II");
                        break;
                    }
                    case 3:
                    {
                        System.out.print("III");
                        break;
                    }
                    case 4:
                    {
                        System.out.print("IV");
                        break;
                    }
                    case 5:
                    {
                        System.out.print("V");
                        break;
                    }
                    case 6:
                    {
                        System.out.print("VI");
                        break;
                    }
                    case 7:
                    {
                        System.out.print("VII");
                        break;
                    }
                    case 8:
                    {
                        System.out.print("VIII");
                        break;
                    }
                    case 9:
                    {
                        System.out.print("IX");
                        break;
                    }
                }
        }
    }
}
