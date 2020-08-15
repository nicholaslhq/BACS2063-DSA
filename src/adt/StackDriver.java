
package adt;

public class StackDriver {
    
    public static void main(String[] args){
    StackInterface<Integer> stack = new StackArr<>(3);
    
    System.out.println("isEmpty() return:" + stack.isEmpty());
    stack.push(5);
    stack.push(10);   
    stack.push(20);
    stack.push(30);
    stack.push(30);
    
    System.out.println("All element: " + stack.toString());
    
    System.out.println("isEmpty() return:" + stack.isEmpty());
    System.out.println("Removing: " + stack.pop());
    System.out.println("Removing: " + stack.pop());
    System.out.println("Removing: " + stack.pop());
     
    System.out.println("isEmpty() return:" + stack.isEmpty());
    System.out.println("Removing: " + stack.pop());
    System.out.println("isEmpty() return:" + stack.isEmpty());
    
    stack.push(5);
    stack.push(10);
    stack.push(20);
    stack.push(30);
    
    System.out.println("All element: " + stack.toString());
    
    System.out.println("Search element 10: " + stack.search(10));
    System.out.println("Search element 60: " + stack.search(60));
    System.out.println("Search element 5: " + stack.search(5));
    System.out.println("stack.peek() return: " + stack.peek());
    System.out.println("Removing: " + stack.pop());
    stack.clear();
    System.out.println("isEmpty() return:" + stack.isEmpty());
    System.out.println("stack.pop() return: " + stack.pop());
    
    
    }
}
