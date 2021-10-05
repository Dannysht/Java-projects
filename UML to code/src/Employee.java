public class Employee{
    private String name = "Bob";
    private long ID;
    private double salary = 120.00;

    public String toString()
    {
        return name + " " + ID + " " + salary + "\n";
    }

    public Employee()
    {

    }

    public Employee(String name)
    {
        setName(name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary=salary;
    }

    public long getID()
    {
        return ID;
    }
}
