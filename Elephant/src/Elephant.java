public class Elephant
{
    private String name;
    private int weight;
    private boolean angry;
    private int stamina = 100;

    public Elephant()
    {
        name = "unknown";
        weight = 0;
        angry = false;
    }

    public Elephant(String name, int weight, boolean angry)
    {
        setName(name);
        setWeight(weight);
        setAngry(angry);
    }

    public void printElephant()
    {
        System.out.println("Your elephant's name is: " + name);
        System.out.println("Your elephant's weight is: " + weight);
        System.out.println("Is your elephant angry? " + angry);
        System.out.println("Your elephant's stomping pressure is: " + this.stomp());
        charge();
    }

    public int stomp()
    {
        return 3*weight+300;
    }

    public void charge()
    {
        int xyz = 100 - weight/1000;
        System.out.println("Yeehaaaa topspeed is " + xyz + "\n" );
        stamina-= Math.floor(Math.random()*(10-0+1)+0);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public boolean isAngry()
    {
        return angry;
    }

    public void setAngry(boolean angry)
    {
        this.angry = angry;
    }

    public int getStamina()
    {
        return stamina;
    }

    public void setStamina(int stamina)
    {
        this.stamina = stamina;
    }


    public String toString()
    {
        return "This elephant is named: " + name + " It weighs: " + weight
                + " Kilograms Is it angry: " + angry + " Its stamina is: " + stamina;
    }


}
