
package entity;

/**
 *
 * @author YKWong
 */
public class Weapon extends Item {
    private int damage;
   
public Weapon(){

}
    
public Weapon(int damage, int itemID, String itemName, String itemDes){
        this.damage = damage;
        
}

 public int getdamage() {
        return damage;
    }

    public void setdamage(int hp) {
        this.damage = damage;
    }
    
   /* public String toString()
    {
        return "Weapon{" + "weaponID=" + itemID + 
    }*/
}
