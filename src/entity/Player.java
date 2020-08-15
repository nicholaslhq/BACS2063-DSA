
package entity;


public class Player {
    private String playerName;
    private int playerCurrentHP;
    private int playerMaxHP;
    private int playerDamage;
    private int playerEXP;
    private int nextLevelEXP;
    private Location currentLocation;
    private int currentGold;

    public Player() {
    }

    public Player(String playerName) {
        this.playerName = playerName;
        this.playerCurrentHP = 100;
        this.playerMaxHP = 100;
        this.playerDamage = 20;
        this.playerEXP = 0;
        this.nextLevelEXP = 50;
        this.currentGold = 0;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setPlayerCurrentHP(int playerCurrentHP) {
        this.playerCurrentHP = playerCurrentHP;
    }

    public void setPlayerMaxHP(int playerMaxHP) {
        this.playerMaxHP = playerMaxHP;
    }

    public void setPlayerDamage(int playerDamage) {
        this.playerDamage = playerDamage;
    }

    public void setPlayerEXP(int playerEXP) {
        this.playerEXP = playerEXP;
    }

    public void setNextLevelEXP(int nextLevelEXP) {
        this.nextLevelEXP = nextLevelEXP;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setCurrentGold(int currentGold) {
        this.currentGold = currentGold;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getPlayerCurrentHP() {
        return playerCurrentHP;
    }

    public int getPlayerMaxHP() {
        return playerMaxHP;
    }

    public int getPlayerDamage() {
        return playerDamage;
    }

    public int getPlayerEXP() {
        return playerEXP;
    }

    public int getNextLevelEXP() {
        return nextLevelEXP;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    public int getCurrentGold() {
        return currentGold;
    }

    @Override
    public String toString() {
        return "Player{" + "playerName=" + playerName + ", playerCurrentHP=" + playerCurrentHP + ", playerMaxHP=" + playerMaxHP + ", playerDamage=" + playerDamage + ", playerEXP=" + playerEXP + ", nextLevelEXP=" + nextLevelEXP + ", currentLocation=" + currentLocation + ", currentGold=" + currentGold + '}';
    }
    
    
}
