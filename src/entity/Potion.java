/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author YKWong
 */
public class Potion extends Item {
    private int hp;
    private int potionQty;
   
public Potion(){

}
    
public Potion(int hp, int itemID, String itemName, int potionQty, String itemDes){
        this.hp = hp;
        this.potionQty = potionQty;
        
}

 public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    
    public int getPotionQty() {
        return potionQty;
    }

    public void setPotionQty(int potionQty) {
        this.potionQty = potionQty;
    }
    
   /* public String toString()
    {
        return "Potion{" +  
    }*/
}
