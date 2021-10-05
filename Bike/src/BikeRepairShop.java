public class BikeRepairShop {
    private Bike[] bikes = new Bike[3];
    private static int bikesRepaired = 0 ;

    public void startRepair(Bike bike, int index)
    {
        try
        {
            bikes[index] = bike;
            System.out.println("Your bike has successfully been placed in place: " + index);
            ++bikesRepaired;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index can't be bigger than 2");
        }
    }

    public void printInfoAboutBikes()
    {
        for (int i = 0; i < bikes.length; ++i)
        {
            try
            {
                bikes[i].printBike();
            }
            catch (NullPointerException e)
            {
                System.out.println("No bike in position " + i);
            }
        }
    }

    public static int getBikesRepaired() {
        return bikesRepaired;
    }
}
