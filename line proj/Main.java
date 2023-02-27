public class Main
{
    public static void main (String[] args)
    {
        Point p1 = new Point(5, -2);
        Point p2 = new Point(7, 8);
        Point p3 = new Point(8, 13);
        
        line line1 = new line (5, 4, -17);  
        double slope1 = line1.getSlope();
        boolean onLine1 = line1.isOnLine(p1.getX(), p1.getY());
       
        line line2 = new line (-25, 40, 30);  
        double slope2 = line2.getSlope();
        boolean onLine2 = line2.isOnLine(p2);
        System.out.println (slope1);
        System.out.println (onLine1);
        System.out.println (slope2);
        System.out.println (onLine2);
    }
}
