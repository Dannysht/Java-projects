public class Main
{
    public static void main(String[] args)
    {
        Elephant elephantOne = new Elephant("Jumbo",6000, false );
        elephantOne.printElephant();
        Elephant elephantTwo = new Elephant();
        Elephant elephantThree = new Elephant("Rori", 5500,false);
        elephantTwo.printElephant();
        Zoo zoo = new Zoo();
        zoo.addElephant(elephantOne);
        zoo.addElephant(elephantTwo);
        zoo.addElephant(elephantThree);
        System.out.println(zoo);
        System.out.println(zoo.averageElephantStamina());
        /*zoo.charge();
        System.out.println("Total stomping pressure of elephants is: " + zoo.totalStompingPressure());
        zoo.removeElephant();
        System.out.println(zoo);*/

    }
}
