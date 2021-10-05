import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    private Scanner input;

    public boolean openFile(String filename)
    {
        boolean success = false;
        File file = new File(filename);

        try
        {
            input = new Scanner(file);
            success = true;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File named " + " cannot be found" );
        }
        return success;
    }

    public Scanner getInput() {
        return input;
    }
}
