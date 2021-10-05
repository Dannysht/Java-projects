import java.io.FileNotFoundException;

public class Main
{
    final static int arraySize = 5;
    public static void main(String[] args) {
        Bike bike = new Bike("Drag", "Red", 155, 12, 15);
        Bike bike2 = new Bike ("Cross", "Blue", 160, 13, 18);
        Bike[] bikes = new Bike[arraySize];
        bikes[0] = bike;
        bikes[1] = bike2;
        try {
            MyFileWriter file = new MyFileWriter("results.txt");
            file.addPersonToFile( "Daniel", 21, 178);
            file.addBikeToFile(bike);
            file.addBikesToFile(bikes);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
        }

    }
}
