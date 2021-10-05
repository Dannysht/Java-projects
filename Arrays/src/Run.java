import java.util.*;

public class Run
{

    public static int getHeightBasedOnName (String name, Person[] people) throws NullPointerException
    {
        for (int i = 0; i < people.length;  i++)
        {
            if(people[i].getName().equalsIgnoreCase(name))
            {
                return people[i].getHeight();
            }
        }
        return 0;
    }

    public static Person tallestPerson(Person[] people) throws NullPointerException
    {
        Person tallestPerson = people[0];
        for(int i = 1; i < people.length; ++i)
        {
            if(tallestPerson.getHeight() < people[i].getHeight())
            {
                tallestPerson = people[i];
            }
        }
        return tallestPerson;
    }

    public static Person heavyTallPerson (int x, int y, Person[] people)
    {
        for(int i = 0 ; i < people.length; ++i)
        {
            if(people[i].getHeight() > x && people[i].getWeight() > y)
            {
                return people[i];
            }
        }
        return null;
    }

    public static Person[] heavyTallPeople(int x, int y, Person[] people)
    {
        Person[] persons = new Person[people.length];
        int currentPerson = 0;
        for (int i = 0; i < people.length; i++)
        {
            if(people[i].getHeight() > x &&  people[i].getWeight() > y)
            {
                persons[currentPerson] = people[i];
                ++currentPerson;
            }
        }

        return persons;
    }

    public static void main(String[] args)
    {

        Person person1 = new Person("Jens",175,69);
        Person person2 = new Person("Helle",168,58);
        Person person3 = new Person("Berit", 163,72);
        Person person4 = new Person("Allan", 192,95);
        Person[]people  = new Person[4];

            people[0] = person1;
            people[1] = person2;
            people[2] = person3;
            people[3] = person4;

            for(int i = 0; i < people.length; ++i)
            {
                System.out.println("Person's name: " + people[i].getName() +
                        " Person's height: " + people[i].getHeight() + " Person's weight: " + people[i].getWeight());
            }

        System.out.println(getHeightBasedOnName("Jens", people));
        System.out.println(tallestPerson(people));



        //1: Create 4 person objects.
        //person 1: Jens, 175 cm, 69 kg.
        //person 2: Helle, 168 cm, 58 kg
        //person 3: Berit, 163 cm, 72 kg
        //person 4: Allan, 192 cm, 95 kg



        //2: Create a Person array with 4 positions.
        //Populate the array with the 4 person objects


        //3: Using System.out.println(), print out the names and heights and weights of the 4 people.
        // Note: It must work without modification if you changed the size of the array and the number of
        // person objects in it.

        /*Person[] persons = new Person[people.length];
            persons = heavyTallPeople();
        for (int i = 0; i < persons.length; ++i)
        {
            if(persons[i] != null)
            {
                System.out.println(persons[i]);
            }
        }*/


    }







    //4: Write a static method that returns the height of the specified name. The specified name
    //is sent to the method as a parameter. The Person array to search in is also sent as a parameter.
    //If the specified name does not exist in the array, the method should return 0.






    //5: Write a static method that returns the tallest person object in a given person array.
    //The method must take in a person array as a parameter.
    //The method should return null if the array is empty. (no people objects in it).



    //6: write a static method that returns the first person object in the array, that weighs more and is taller than x and y.
    //x and y should be parameters to the method and the person array to search in as well.
    //The method should return null if the array is empty. (no people objects in it).


    //7: write a method like the one above, but this time do not return only the first person object that fits the criteria.
    //Instead return all objects that fits the criteria. The method must work also if you changed the array and number of
    //people in it.
}