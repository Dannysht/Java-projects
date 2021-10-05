public class Person {
    private int age;
    private String name;

    public Person()
    {
        setAge(0);
        setName("No name");
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    public String toString()
    {
        return name + ", " + age + " years old.";
    }
}

class LivingRoom
{
    private String name;
    private int numberOfPeople = 0;
    private Person personInChair, personInCouchPosition1, personInCouchPosition2;

    public Person getPersonInChair()
    {
        return personInChair;
    }

    public void setPersonInChair(Person personInChair)
    {
        if(this.personInChair == null)
        {
            ++numberOfPeople;
        }
        this.personInChair = personInChair;
    }

    public Person getPersonInCouchPosition1()
    {
        return personInCouchPosition1;
    }

    public void setPersonInCouchPosition1(Person personInCouchPosition1)
    {
        if(this.personInCouchPosition1 == null)
        {
            ++numberOfPeople;
        }
        this.personInCouchPosition1 = personInCouchPosition1;
    }

    public int getNumberOfPeople()
    {
        return numberOfPeople;
    }

    public Person getPersonInCouchPosition2()
    {
        return personInCouchPosition2;
    }

    public void setPersonInCouchPosition2(Person personInCouchPosition2)
    {
        if(this.personInCouchPosition2 == null)
        {
            ++numberOfPeople;
        }
        this.personInCouchPosition2 = personInCouchPosition2;
    }

    public LivingRoom(String name)
    {
        this.name = name;
    }

}
