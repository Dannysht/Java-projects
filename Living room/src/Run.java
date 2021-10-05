public class Run {
    public static void main(String[] args) {
        Person person1 = new Person("George", 15);
        Person person2 = new Person("Daniel", 21);
        Person person3 = new Person("Ivaylo", 47);
        LivingRoom livingRoom = new LivingRoom("Home");
        livingRoom.setPersonInChair(person3);
        System.out.println("Person in chair is: " + livingRoom.getPersonInChair());
        livingRoom.setPersonInCouchPosition1(person1);
        System.out.println("Person on couch position 1 is "+ livingRoom.getPersonInCouchPosition1());
        livingRoom.setPersonInCouchPosition2(person2);
        System.out.println("People in living room: " + livingRoom.getNumberOfPeople());
        livingRoom.setPersonInCouchPosition2(person1);
        System.out.println(livingRoom.getNumberOfPeople());
    }
}
