
package ADT;

import java.util.Iterator;


public class TestSortedLinkedList {
   
  public static void main(String[] args) {
    SortedLinkedListInterface<String> monsterList = new SortedLinkedList<String>();

    monsterList.add("Lich");
    monsterList.add("Axe");
    monsterList.add("Tiny");
    monsterList.add("Lich");
    monsterList.add("Lich");
    monsterList.add("Axe");
    monsterList.add("Tiny");
    monsterList.add("Axe");
    monsterList.add("Juggernaunt");
    
    //System.out.println("The sequence of the monster killed is \n" );
    System.out.println("ID Monster Name \n" + monsterList);

    String monsterName = "Juggernaunt";
    System.out.println("Congratulation, you have finished all the stage : " + monsterList.contains(monsterName));
   
    monsterList.clear();
    System.out.println("clear"+monsterList.toString());
    System.out.println("Pls try agian :"+ monsterList.isEmpty());
    System.out.println("The total monster killed is :"+ monsterList.getLength());
    //System.out.println("Count of 100 is " + monsterList.count1(100)); 
   
   // int count = 0;
    String name1 = "Lich";
    Iterator<String> it = monsterList.getIterator();
    while (it.hasNext())
   {
       String name = it.next();
       if(name == name1)
       {
       //count ++;
       System.out.println("nice");
       }
       else
       System.out.println("bad");
    }
    
    
    // System.out.printf("\b\b" + sum);
    
    //Node current = head; 
     //   int count = 0; 
      //  while (current != null) { 
         //   if (current.data == search_for) 
         //       count++; 
         //   current = current.next; 
         
    //int sum = 0;
    //Iterator<Integer> it = monsterList.getIterator();
    //while (it.hasNext())
   // {
       // int number = it.next();
        // System.out.printf(number + "+");
         //sum += number;
   // }
    
    // System.out.printf("\b\b" + sum);
  }
}
        
  
  

    
    
    
    
   
    
  
  
   
  
  
