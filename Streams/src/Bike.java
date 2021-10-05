public class Bike
{
    private String brand;
    private String color;
    private int height;
    private int width;
    private int length;

    public Bike()
    {
        brand = "unknown";
        color = "unknown";
        height = 0;
        width = 0;
        length = 0;
    }

    public Bike(String brand, String color, int height, int width, int length)
    {
        setBrand(brand);
        setHeight(height);
        setWidth(width);
        setLength(length);
        setColor(color);
    }

    public void printBike()
    {
        System.out.println("The brand of this bike is: " + brand);
        System.out.println("The color of this bike is: " + color);
        System.out.println("The height of this bike is: " + height);
        System.out.println("The width of this bike is: " + width);
        System.out.println("The length of this bike is: " + length);
    }

    public int calculateProduct()
    {
        return height * width * length;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public String getBrand()
    {
        return brand;
    }

    public String getColor()
    {
        return color;
    }

    public int getHeight()
    {
        return height;
    }

    public int getWidth()
    {
        return width;
    }

    public int getLength()
    {
        return length;
    }

    public String toString() {
        return brand + ' ' +  color + ' ' + height + " " + width + " " + length;
    }
}
