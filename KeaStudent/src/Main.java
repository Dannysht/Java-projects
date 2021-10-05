public class Main
{
    public static void main(String[] args)
    {
        Student me = new Student();
        me.setName("Daniel");
        me.setAge(21);
        me.setGender("Male");
        me.setSemester(1);
        me.setClassNumber("Dat21i");
        me.setEducation("Computer Science");

        Student random = new Student();
        random.setName("Zola");
        random.setAge(20);
        random.setGender("Female");
        random.setSemester(1);
        random.setClassNumber("Dat21i");
        random.setEducation("Computer Science");

        Student meme = new Student();
        meme.setName("Jeff");
        meme.setAge(12) ;
        meme.setGender("Attack helicopter");
        meme.setSemester(1);
        meme.setClassNumber("Dat21i");
        meme.setEducation("Computer Science");

        System.out.println("Student name: " + me.getName());
        System.out.println("Student's gender: " + me.getGender());
        System.out.println("Student age: " + me.getAge());
        System.out.println("Student education: " + me.getEducation());
        System.out.println("Student semester: " + me.getSemester());
        System.out.println("Student's class' number: " + me.getClassNumber() + "\n");

        System.out.println("Student name: " + random.getName());
        System.out.println("Student's gender: " + random.getGender());
        System.out.println("Student age: " + random.getAge());
        System.out.println("Student education: " + random.getEducation());
        System.out.println("Student semester: " + random.getSemester());
        System.out.println("Student's class' number: " + random.getClassNumber() + "\n");

        System.out.println("Student name: " + meme.getName());
        System.out.println("Student's gender: " + meme.getGender());
        System.out.println("Student age: " + meme.getAge());
        System.out.println("Student education: " + meme.getEducation());
        System.out.println("Student semester: " + meme.getSemester());
        System.out.println("Student's class' number: " + meme.getClassNumber() + "\n");
    }
}
