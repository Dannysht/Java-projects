public class Rabbit extends Animal
{
    private boolean direction = true;

    public Rabbit()
    {
        super(0,0);
    }

    public Rabbit(int x)
    {
        super(x,0);
    }

    public Rabbit (int x, int y)
    {
        super(x,y);
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

    public boolean getDirection()
    {
        return direction;
    }

    public void setDirection(boolean direction)
    {
        this.direction = direction;
    }
}
