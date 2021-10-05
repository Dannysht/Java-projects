import java.util.ArrayList;

public class CarDealer {
    private String name;
    private ArrayList<Car> carsForSale = new ArrayList();

    public CarDealer(String name)
    {
        this.name = name;
    }

    public void addCar(Car car)
    {
        carsForSale.add(car);
    }
    public void printCars()
    {
        System.out.println("The cars we currently have: ");
        for(Car car : carsForSale)
        {
            System.out.println(car);
        }
    }
    public void printCarsOfColor(String color)
    {
        System.out.println("We have the following " + color + " cars for sale");
        for(Car car: carsForSale)
        {
            if(car.getColor().equalsIgnoreCase(color))
            {
                System.out.println(car);
            }
        }

    }
}
