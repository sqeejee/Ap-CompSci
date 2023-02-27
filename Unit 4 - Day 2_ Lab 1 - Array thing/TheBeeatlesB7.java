import java.util.*;

public class TheBeeatlesB7
{
    public static void main(String [] args)
    {
        
        String[] bandMembers = new String[4];
        bandMembers[0] = "Paul";
        bandMembers[1] = "George";
        bandMembers[2] = "Ring";
        bandMembers[3] = "John";
        
        bandMembers[1] = null;
        
        ArrayList band = new ArrayList();
        
        band.add("Ringo");
        band.add("John");
        band.add("Paul");
        band.add("George");
        band.add("Lopez");
        
        System.out.println(band);
        
    }
    
}