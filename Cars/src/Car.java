//Class names should be in a singular form
public class Car {
    private String color;
    String brand;
    int numberOfSeats;
    boolean isWorking; //can the car run
    double acceleration; //0-100 km/h

    public Car()
    {
    }

    public Car(String color, String brand)
    {
        this.setColor(color);
        this.setBrand(brand);
    }

    public String toString()
    {
        return brand + " " + color + " " +  numberOfSeats;
    }

    public void setColor(String colorChange)
    {
        this.color = colorChange;
    }
    public void printColor()
    {
        System.out.println(this.color);
    }
    public String getColor()
    {
        return this.color;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

}