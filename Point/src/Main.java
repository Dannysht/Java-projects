public class Main
{
    public static void main(String[] args)
    {
        Point newPoint = new Point();
        Point point2 = new Point(2, -3);
        System.out.println(newPoint.quadrant());
        System.out.println(point2.quadrant());
    }
}
