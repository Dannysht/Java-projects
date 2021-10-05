import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class MyFileWriter
{
    private File f;
    private FileOutputStream fos;
    private PrintStream output;
    String filepath;

    private void openFile()  throws FileNotFoundException
    {
        f = new File(filepath);
        fos = new FileOutputStream(f, true);
        output = new PrintStream(fos);
    }

    private void closeFile()
    {
        output.close();
    }

    public MyFileWriter(String filepath) throws FileNotFoundException
    {
        this.filepath = filepath;
        f = new File(filepath);
        fos = new FileOutputStream(f, true);
        output = new PrintStream(fos);
        closeFile();
    }

    public void addPersonToFile(String name, int age, int height) throws FileNotFoundException
    {
        openFile();
        output.println(name + " " + age + " " + height);
        closeFile();
    }

    public void addBikeToFile(Bike bike) throws FileNotFoundException
    {
            openFile();
            output.println(bike);
            closeFile();
    }

    public void addBikesToFile(Bike[] bikes) throws FileNotFoundException
    {
            openFile();
            for(int i = 0; i < bikes.length; ++i)
            {
                if(bikes[i] != null)
                {
                    output.println(bikes[i]);
                }
            }
        closeFile();
    }

}
