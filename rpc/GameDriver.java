import java.util.*;

public class GameDriver extends Player{

    public static void main(String [] args){
        Player player = new Player();
        Computer comp = new Computer();
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("What is the player's name? ");
        player.name = keyboard.next();
        System.out.println("What does " + player.name + " choose? " );
        player.choice = keyboard.next();
       
        
        if (GameManager.didPlayerWin() == true)
        {
            System.out.println ("Congrats!");
        }
        else
        System.out.println ("Better luck next time!");
        
    
    }
}
