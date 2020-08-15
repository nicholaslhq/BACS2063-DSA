/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADT;

/**
 *
 * @author ccs
 */

public class TextMonsterCount 
{
     public static void main(String args[]) 
    { 
        MonsterCount monsterList = new MonsterCount(); 
  
        monsterList.aa(100); 
        monsterList.aa(200); 
        monsterList.aa(100); 
        monsterList.aa(300); 
        monsterList.aa(100); 
       
        System.out.println("The total of Lich killed is : " + monsterList.count(100));
        System.out.println("The total of Axe killed is : " + monsterList.count(200)); 
        System.out.println("The total of Tiny killed is : " + monsterList.count(300));
        
        
     }
}

