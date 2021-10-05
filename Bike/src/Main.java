public class Main
{
    public static void main(String[] args)
    {
        Bike bikeOne = new Bike();
        Bike bikeTwo = new Bike ("Cross","Red", 50, 30, 155 );
        Bike bikeThree = new Bike ("Trek", "Black", 64, 38, 173);

        BikeRepairShop bikeRepairShop = new BikeRepairShop();
        bikeRepairShop.startRepair(bikeOne, 0);
        bikeRepairShop.startRepair(bikeTwo, 1);
        bikeRepairShop.startRepair(bikeThree, 4);
        bikeRepairShop.printInfoAboutBikes();

    }

}
