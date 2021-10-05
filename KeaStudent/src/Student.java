//create add 3 objects and print them out.

public class Student
{
    private String name;
    private int age;
    private String education;
    private int semester;
    private String classNumber;
    private String gender;

    public Student(){

    }

    public void setEducation(String education)
    {
        this.education = education;
    }

    public void setSemester(int semester)
    {
        this.semester = semester;
    }

    public void setClassNumber(String classNumber)
    {
        this.classNumber = classNumber;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getEducation()
    {
        return education;
    }

    public int getSemester()
    {
        return semester;
    }

    public String getClassNumber()
    {
        return classNumber;
    }

    public String getGender()
    {
        return gender;
    }
}
