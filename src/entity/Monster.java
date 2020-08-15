
package entity;

public class Monster {
    private int monsterID;
    private String monsterName;
    private int monsterCurrentHP;
    private int monsterMaxHP;
    private int monsterDamage;
    private int rewardEXP;
    private int rewardGold;

    public Monster() {
        
    }
    
    public Monster(int monsterID, String monsterName, int monsterMaxHP, int monsterDamage, int rewardEXP, int rewardGold) {
        this.monsterID = monsterID;
        this.monsterName = monsterName;
        this.monsterCurrentHP = monsterMaxHP;
        this.monsterMaxHP = monsterMaxHP;
        this.monsterDamage = monsterDamage;
        this.rewardEXP = rewardEXP;
        this.rewardGold = rewardGold;
       
    }
   
    
    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public void setMonsterCurrentHP(int monsterCurrentHP) {
        this.monsterCurrentHP = monsterCurrentHP;
    }

    public void setMonsterMaxHP(int monsterMaxHP) {
        this.monsterMaxHP = monsterMaxHP;
    }

    public void setMonsterDamage(int monsterDamage) {
        this.monsterDamage = monsterDamage;
    }

    public void setRewardEXP(int rewardEXP) {
        this.rewardEXP = rewardEXP;
    }

    public void setRewardGold(int rewardGold) {
        this.rewardGold = rewardGold;
    }

   // public void setItemDrop(Item itemDrop) {
    //    this.itemDrop = itemDrop;
    //}
    
    public int getMonsterID() {
        return monsterID;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int getMonsterCurrentHP() {
        return monsterCurrentHP;
    }

    public int getMonsterMaxHP() {
        return monsterMaxHP;
    }

    public int getMonsterDamage() {
        return monsterDamage;
    }

    public int getRewardEXP() {
        return rewardEXP;
    }

    public int getRewardGold() {
        return rewardGold;
    }

    //public Item getItemDrop() {
    //    return itemDrop;
    //}
    
    public String combatMonster(Player player){
        String i = null;
        player.setPlayerCurrentHP(player.getPlayerCurrentHP() - monsterDamage); 
        monsterCurrentHP -= player.getPlayerDamage();
       
        System.out.println("player current hp: " + player.getPlayerCurrentHP());
        System.out.println("Monster current hp: " +monsterCurrentHP);
        
        if(player.getPlayerCurrentHP() <= 0){
            i = "over";         
        }
        else if(monsterCurrentHP <= 0){
            i = "win";
        }else{
            i = "continue";
        }
            
         return i;
    }
    
    public void gameOver(){
        System.out.println("Your HP is 0. GAME OVER");
    }

    @Override
    public String toString() {
        return "Monster{" + "monsterID=" + monsterID + ", monsterName=" +
                monsterName + ", monsterCurrentHP=" + monsterCurrentHP + ", "
                + "monsterMaxHP=" + monsterMaxHP + ", monsterDamage=" + 
                monsterDamage + ", rewardEXP=" + rewardEXP + ", rewardGold=" + 
                rewardGold;
    }
            
}
