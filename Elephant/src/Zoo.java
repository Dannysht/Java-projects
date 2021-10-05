import java.util.ArrayList;

public class Zoo
{
    String name;
    ArrayList<Elephant> elephants = new ArrayList<>();

    public void addElephant(Elephant elephant)
    {
        elephants.add(elephant);
    }

    public void charge()
    {
        for(Elephant elephant : elephants)
        {
            elephant.charge();
        }
    }

    public void removeElephant()
    {
        elephants.remove(elephants.size()-1);
    }

    public int averageElephantStamina()
    {
        int totalElephants = 0, totalStamina = 0;
        for(Elephant elephant : elephants)
        {
            ++totalElephants;
            elephant.charge();
            totalStamina += elephant.getStamina();
        }
        return totalStamina/totalElephants;

    }

    public int totalStompingPressure()
    {
        int totalStompingPressure = 0;
        for(Elephant elephant: elephants)
        {
            totalStompingPressure+= elephant.stomp();
        }
        return totalStompingPressure;
    }

    public String toString()
    {
        return "Welcome to: " + name + " we currently have these elephants: " + elephants + "\n";
    }
}
