package Entity;

/**
 *
 * @author ccs
 */
public class MonsterCounter {
    private int monsterID;
    private String monsterName;


    public MonsterCounter() {
        
    }
    
    public MonsterCounter(int monsterID, String monsterName) {
        this.monsterID = monsterID;
        this.monsterName = monsterName;
     
    }
   
    
    public void setMonsterID(int monsterID) 
    {
        this.monsterID = monsterID;
    }
     public int getMonsterID()
    {
        return monsterID;
    }
     
    public void setMonsterName(String monsterName) 
    {
        this.monsterName = monsterName;
    }
    
      public String getMonsterName() 
      {
        return monsterName;
      }

   
    @Override
    public String toString() {
        return "Monster{" + "monsterID=" + monsterID + ", monsterName=" +
                monsterName ;
    }
            
}/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

