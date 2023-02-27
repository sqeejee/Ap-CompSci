public class GameManager {
    private Player player;
    private Computer computer;
    
    public GameManager(Player p, Computer c){
        this.player = p;
        this.computer = c;
    }
    
    
    public void setPlayerInformation (String name, String choice)
    {
        name = name;
        choice = choice;
        
    }
    
    public boolean didPlayerWin()
    {
        if (player.choice == "rock" && computer.choice == "scissors" || player.choice == "paper" && computer.choice ==  "rock" || player.choice == "scissors" && computer.choice ==  "paper"){
            return (true);
    }
     return (false);
}
}