public class Main
{
    final static int MaxArrayValue = 100;
    final static int MaxNumberCounter = 11;
    static int[] numberCounter = new int[MaxNumberCounter];

    public static void main(String[] args)
    {
        int[] numberContainer = new int[MaxArrayValue];
        for(int i = 0; i < MaxNumberCounter; ++i)
        {
            numberCounter[i] = 0;
        }
        for (int i = 0 ; i < MaxArrayValue ; ++i)
        {
            numberContainer[i] = (int)(Math.random()*11);
            switch (numberContainer[i])
            {
                case 0:
                {
                    ++numberCounter[0];
                    break;
                }

                case 1:
                {
                    ++numberCounter[1];
                    break;
                }
                case 2:
                {
                    ++numberCounter[2];
                    break;
                }
                case 3:
                {
                    ++numberCounter[3];
                    break;
                }
                case 4:
                {
                    ++numberCounter[4];
                    break;
                }
                case 5:
                {
                    ++numberCounter[5];
                    break;
                }
                case 6:
                {
                    ++numberCounter[6];
                    break;
                }
                case 7:
                {
                    ++numberCounter[7];
                    break;
                }
                case 8:
                {
                    ++numberCounter[8];
                    break;
                }
                case 9:
                {
                    ++numberCounter[9];
                    break;
                }
                case 10:
                {
                    ++numberCounter[10];
                    break;
                }
            }
        }
        printNums();
    }

    public static void printNums()
    {
        for(int i = 0; i < MaxNumberCounter; ++i)
        {
            System.out.println(i + "'s: " + numberCounter[i]);
        }
    }

}
