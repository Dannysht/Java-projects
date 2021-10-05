public class Point
{
    private int x;
    private int y;
    public Point()
    {
        x = 0 ;
        y = 0 ;
    }

    public Point(int x, int y)
    {
        setX(x);
        setY(y);
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public int quadrant()
    {
        if(x == 0 && y == 0)
        {
            return 0;
        }
        if(x > 0 && y > 0)
        {
            return 1;
        }
        if(x < 0 && y > 0)
        {
            return 2;
        }
        if(x < 0 && y < 0)
        {
            return 3;
        }
        if(x > 0 && y < 0)
        {
            return 4;
        }
        return 0;
    }
}
