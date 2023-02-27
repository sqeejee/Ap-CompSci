public class Album
{
    private String name;
    private double rating, pitchForkScore;
    
    
    
    public Album (String name, double rating)
    {
        this.name = name;
        this.rating = rating;
    }
    /**
     * Pitchfork is a music review website, this is where the user will enter their favorite album's score and have their dreams crushed.
     */
    public void pitchforkScore (double pitchForkScore2)
    {
        pitchForkScore = pitchForkScore2;
        if (rating > pitchForkScore2)
        {
            System.out.println ("You like the album more then pitchfork!");
        }
        else if (rating < pitchForkScore2)
        {
         System.out.println ("Wow you're such a contrarian");
        }
        else
        {
            System.out.println ("Come up with your own opinion");
        }
    }
    public void setRating (double rating)
    {
        this.rating = rating;
    }
    public void setPitchForkScore (double pitchForkScore)
    {
        this.pitchForkScore = pitchForkScore;
    }
    public void setName (String name)
    {
        this.name = name;
    }
    
    public double getRating ()
    {
        return rating;
    }
    public double getPitchForkScore ()
    {
        return pitchForkScore;
    }
    public String getName ()
    {
        return this.name;
    }
}
