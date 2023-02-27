
public class Main
{
    public static void main (String [] args)
    {
        Rectangle rect = new Rectangle (5, 4,"blue");
        Rectangle steve = new Rectangle (2, 3, "orange");
        Album donda =  new Album ("donda", 10);
        Album clb = new Album ("Certified lover boy", 3);
        
        donda.pitchforkScore(6);
        clb.pitchforkScore(4.5);
        
        steve.getLength();
        steve.getColor();
        rect.getWidth();
        rect.getColor();
        
    }
}
