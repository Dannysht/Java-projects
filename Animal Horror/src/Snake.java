public class Snake extends Animal
{
    //Constructors
    public Snake()
    {
        super(0, 0);
    }

    public Snake(int x)
    {
        super(x,0);
    }

    public Snake(int x, int y)
    {
        super(x, y);
    }

    //Getters and Setters
    public void setX(int x)
    {
        super.setX(x);
    }

    public void setY(int y)
    {
        super.setY(y);
    }

    public int getX()
    {
        return super.getX();
    }

    public int getY()
    {
        return super.getY();
    }
}

abstract class Animal
{
    private int x;
    private int y;
    //Constructors

    public Animal()
    {
        setX(0);
        setY(0);
    }

    public Animal(int x)
    {
        setX(x);
        setY(0);
    }

    public Animal(int x, int y)
    {
        setX(x);
        setY(y);
    }

    //Getters and Setters
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }

    public int getY()
    {
        return y;
    }

    public void setY(int y)
    {
        this.y = y;
    }
}
