package client;

public class Story {
    
    private final String title =   "\n  _______        _                 _                 _                  "
                     + "\n |__   __|      | |       /\\      | |               | |                 "
                     + "\n    | | _____  _| |_     /  \\   __| |_   _____ _ __ | |_ _   _ _ __ ___ "
                     + "\n    | |/ _ \\ \\/ / __|   / /\\ \\ / _` \\ \\ / / _ \\ '_ \\| __| | | | '__/ _ \\"
                     + "\n    | |  __/>  <| |_   / ____ \\ (_| |\\ V /  __/ | | | |_| |_| | | |  __/"
                     + "\n    |_|\\___/_/\\_\\\\__| /_/    \\_\\__,_| \\_/ \\___|_| |_|\\__|\\__,_|_|  \\___|"
                     + "\n_________________________________________________________________________"
                     + "\n                  An Interactive Text-based Fiction Game                  "
                     + "\n_________________________________________________________________________"
                     + "\n\n                    -Press [Enter] to start the game-";

    private final String intro =   ".\n.\n.\n\n\"Hey, you, you're finally awake.\"\n\n[You heard someone talking to you as you waking up.]"
                     + "\n\n\"Yes. It's you. What are you doing here? It's very dangerous out here, there are monsters in this forest.\""
                     + "\n\n[A passing villager is talking to you anxiously, but you have told him that you are here because of a mission.]"
                     + "\n\n\"Who are you exactly?\"\n";

    private final String intro2 =  "\n\"Wait, what? You are the famous Monster Hunter?!\""
                     + "\n\"Please, please help us. Our village was attacked by monsters a few days ago.\""
                     + "\n\"My wife and child were killed by Lernean Hydra (a gigantic monster with nine heads) during the invasion.\""
                     + "\n\n[The villagers are crying for your help.]"
                     + "\n\n\"Please go to the village called Henesys on Victoria Land to help the villagers who are still trapped in the village.\""
                     + "\n\nCan you help them?";

    private final String agreeHelp =   "\n\"Thank you very much, the life of the villagers is now in your hands. Please rescue them before the monsters kill them.\""
                         + "\n\"After passing through this mysterious forest, you should be able to reach the village.\""
                         + "\n\n[The villagers seemed satisfied with your choice and left happily.]"
                         + "\n\n[You are on your own now. You need to find the way to the village and help the villagers as soon as possible.]"
                         + "\n\n[There are four direction for you to go. Which direction will you choose?]";

    private final String disagreeHelp =    "\n\"You are really useless, such a coward. I hope you won't be killed by monsters one day.\""
                             + "\n\n[The villager left angrily.]";

    private final String nextLocation = "\n\n[You have moved to the next location.]"; 
    
    private final String noMonster = "\n[This place seems very quiet. There are no monsters here.]";

    private final String encounterMonster = "[You have encountered a monster. Please choose your next step.]";
    
    private final String dropItem = "\n[The monster dropped something.]";

    private final String killedMonster = "[You eliminated a monster. Please choose the next step.]";

    private final String directionMenu = "\n1. North\n2. South\n3. West\n4. East";

    private final String attackMenu = "\n1. Attack \n2. Use Item\n3. Others\n4. Run Away";
    
    private final String otherMenu = "\n1. View Status \n2. View Location\n3. View Quests\n4. Cancel";
    
    private final String questComplete = "[You have completed the quest.]";
    
    private final String gameOver = "\n\n-----GAME OVER-----\n\nThank you for playing Text Adventure.";
    
    private final String quitGame = "\n\n-----THE END-----\n\nThank you for playing Text Adventure, your story ends here."
                                    + "\nThe villagers were killed by monsters because no one could save them. What a sad story.";
      
    public String acquireItem(String itemName){
       return "\n[Congratulations! You have acquired " + itemName + " x1 \nThe item has been stored in your inventory.]";
    }
    
    public String useWeapon(String weaponName, int weaponDamage){
       return "\n[You have successfully equipped the " + weaponName + " which has " + weaponDamage + " weapon damage.]";
    }
    
    public String usePotion(String potionName, int recoverAmount){
       return "\n[You have successfully used the " + potionName + " and restored " + recoverAmount + " HP.]";
    }
    
    public String monsterDialog1(String monsterName){
       return "\n" + monsterName + ": \"Feel the wrath of the monster!\"";
    }
    
    public String monsterDialog2(String monsterName){
       return "\n" + monsterName + ": \"Mmmmmm, you look so tender and tasty, it must be my lucky day.\"";
    }
    
    public String monsterDialog3(String monsterName){
       return "\n" + monsterName + ": \"You shall not pass!\"";
    }
    
    public String monsterDialog4(String monsterName){
       return "\n" + monsterName + ": \"Arrrrrrggggggghhhhhhh!\"";
    }
    
    //Getter
    public String getTitle() {
        return title;
    }

    public String getIntro() {
        return intro;
    }

    public String getIntro2() {
        return intro2;
    }

    public String getAgreeHelp() {
        return agreeHelp;
    }

    public String getDisagreeHelp() {
        return disagreeHelp;
    }

    public String getNextLocation() {
        return nextLocation;
    }

    public String getNoMonster() {
        return noMonster;
    }

    public String getDropItem() {
        return dropItem;
    }

    public String getEncounterMonster() {
        return encounterMonster;
    }

    public String getKilledMonster() {
        return killedMonster;
    }

    public String getDirectionMenu() {
        return directionMenu;
    }

    public String getAttackMenu() {
        return attackMenu;
    }

    public String getOtherMenu() {
        return otherMenu;
    }

    public String getQuestComplete() {
        return questComplete;
    }

    public String getGameOver() {
        return gameOver;
    }

    public String getQuitGame() {
        return quitGame;
    }
    
}
