import javax.swing.text.Caret;

public class Main
{
    public static void main(String[] args)
    {
        Car mustang = new Car();
        Car mercedes = new Car();

        //чупи енкапсулация! НЕ ПРАВИ!
        mustang.setColor("Blue");
        mustang.brand = "Ford";
        mustang.isWorking = true;
        mustang.numberOfSeats = 5;
        mustang.acceleration = 4.3;
        mercedes.setColor("Red");
        mercedes.brand = "Mercedes";
        mercedes.isWorking = true;
        mercedes.numberOfSeats = 5;
        mercedes.acceleration = 6.2;
        System.out.println(mustang.getColor());
        mustang.printColor();

        CarDealer dealer = new CarDealer("Danny's dealership");
        dealer.addCar(mustang);
        dealer.addCar(mercedes);
        dealer.printCars();
        dealer.printCarsOfColor("red");
    }
}
