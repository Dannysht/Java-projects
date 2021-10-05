public class Test {

    private static Employee emp1;
    public static void main(String[] args) {

        emp1 = new Employee();
        Employee emp2 = new Employee("Jack");
        Employee emp3 = new Employee("Stan");
        System.out.println(emp1.getName() + " " + emp1.getSalary());
        System.out.println(emp2.getName() + " " + emp2.getSalary());
        System.out.println(emp1.toString() + emp2.toString() + emp3.toString());
    }

}
