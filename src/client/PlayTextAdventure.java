package client;
import entity.*;
import adt.*;
import java.util.*;

public class PlayTextAdventure {
    //Declaration
    InputValidation input = new InputValidation();
    Story story = new Story();
    
    SequenceInterface<Quest> questSequence = new Sequence<>();
    SequenceInterface<Location> locationSequence = new Sequence<>();
    StackInterface<Monster> monsterStack = new StackArr<>();
    
    //Main method
    public static void main(String[] args){
        PlayTextAdventure game = new PlayTextAdventure();          
        game.startGame();
    }
    
    public void startGame(){     
        System.out.println(story.getTitle()); //Display the game title     
        input.enterToContinue(); //Prompt player to press enter to continue      
        System.out.println(story.getIntro()); //Display the story intro
        
        String name = input.enterName("Enter your name> "); //Prompt player to enter player's name
        
        Player player = new Player(name); //Create a new player            
        System.out.println(story.getIntro2());  //Display the story intro     
        System.out.println("1. Accept, save the village\n2. Reject, ignore the villager's request");
        
        int startQuest = input.enterSelection("Enter selection> ", 1, 2); //Prompt player to choose whether want to accept the quest
        
        if(startQuest == 1){ //If player accept the quest
            //Add & display the quest and location
            locationSequence.add(new Location(2001, "Forest Entrance", "This is the place where the villager found you."));
            questSequence.add(new Quest(4001, "Kill Monsters #1", "Kill 2 monsters on the way to the village.", 10, 10));          
            System.out.println("\n[You have received a new quest.]" + questSequence.peek());
            System.out.println("\n[Your current location.]" + locationSequence.peek());
           
            //Run the game
            runGame(player);
        }
        else if(startQuest == 2){ //If player reject the quest
            //Display quit message and then quit the game
            System.out.println(story.getDisagreeHelp());
            System.out.println(story.getQuitGame());
        }
    }
    
    public void runGame(Player player){
        //Declaration
        int attackSelection = 0; 
        boolean quitGame = false;

        while (!quitGame){
            monsterStack.push(new Monster(3001, "Lernean Hydra", 300, 40, 100, 100));
            System.out.println("\nPlease select the next moving direction." + story.getDirectionMenu());
            directionSelect();
            
            quitGame = true;
        }
        
        System.out.println(story.getGameOver());
    }  
    
    public int directionSelect(){
        int directionSelection = input.enterSelection("Enter selection> ", 1, 4);
            
        if (directionSelection == 1){ //North
            System.out.println("\n[North direction selected.]");   
        }
        else if(directionSelection == 2){ //South
            System.out.println("\n[South direction selected.]");
        }
        else if(directionSelection == 3){ //West
            System.out.println("\n[West direction selected.]");
        }
        else{ //East
            System.out.println("\n[East direction selected.]");
        }
        
        return directionSelection;
    }
    
    public double randomInteger(double min, double max){
        double i = (int)(Math.random()*((max-min)+1))+min;
        return i;
    }
}
