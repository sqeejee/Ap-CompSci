public class Computer
{
    // instance variables - replace the example below with your own
    public String choice;

    public String choice ()
    {
        String result;
        int choice = (int) (Math.random () *3) +1 ;
        System.out.println(choice);
        
        if (choice == 1)
        result = "rock";
        else if (choice == 2)
        result = "paper";
        else
        result = "scissors";
        
        return (result);
    }
    
    
    public String toString (String result)
    {
        return("The Computer chose " +  result);
    }
    
    public void setChoice (String choice)
    {
        this.choice = choice;
    }
    
    public String getChoice ()
    {
        return choice;
    }
}