
package client;

import java.util.*;

public class TextAdventureDriver {
    
    Scanner input = new Scanner(System.in);
    
    public int menu(){
        int menuSelection;
        
        System.out.println("\n1. Attack");
        System.out.println("2. Attack");
        System.out.println("3. Attack");
        System.out.println("4. Attack");
        
        menuSelection = input.nextInt();
        
        return menuSelection;
    }
    
    public static void main(String[] args) {
        TextAdventureDriver textAdventure = new TextAdventureDriver();
        Story story = new Story();
        
        //Print out the main screen of game
        System.out.println("  _______        _                 _                 _                  ");
        System.out.println(" |__   __|      | |       /\\      | |               | |                 ");
        System.out.println("    | | _____  _| |_     /  \\   __| |_   _____ _ __ | |_ _   _ _ __ ___ ");
        System.out.println("    | |/ _ \\ \\/ / __|   / /\\ \\ / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\");
        System.out.println("    | |  __/>  <| |_   / ____ \\ (_| |\\ V /  __/ | | | |_| |_| | | |  __/");
        System.out.println("    |_|\\___/_/\\_\\\\__| /_/    \\_\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|");
        System.out.println("_________________________________________________________________________");
        System.out.println("                  An Interactive Text-based Fiction Game                  ");
        System.out.println("_________________________________________________________________________");
        
        System.out.println("\n                    -Press [Enter] to start the game-");
        
        textAdventure.input.nextLine();
        System.out.println(story.getIntro());

        
        //int next2 = textAdventure.menu();
    }
    
}
