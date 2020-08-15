
package adt;


public class StackArr<T>implements StackInterface<T> {
    T[] stack;
    int top = -1;
    public final static int defaultSize = 50;
    
    public StackArr(){
        stack = (T[])new Object[defaultSize];
    }
    
    public StackArr(int size){
        stack = (T[])new Object[size];
    }
    
    public void push(T entry){
        top++;
        if(isFull()){
            expand();
        }
        stack[top] = entry;
        
    }   
    
    public T pop(){       
        if(!isEmpty()){
            T data = stack[top];
            stack[top] = null;   
            top--;
            return data;          
        }
        else
            return null;         
    }
    
    public T peek(){      
        if(!isEmpty()){                
            T data = stack[top];            
            return data;               
        }
        else{          
            return null;  
        }
    }
    
    public int search(T element){
        int distance = -1;
        for(int i = 0; i <= top; i++){
            if(element == stack[i])
                distance = top - i;
        }
       return distance;       
    }
    
    public void expand(){
        T[] newStack = (T[]) new Object[stack.length*2];
        for(int i = 0; i < top; i++){
            newStack[i] = stack[i];
        }
        stack = newStack;
    }
    
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == stack.length;
    }
        
    public void clear(){
        top = -1;
        for(int i = 0; i < stack.length; i++){
            stack[i] = null;
        }
    }
    
    public String toString(){
       String str = "";
       for(int i = top; i >= 0; i--){
           str += stack[i];
           str += " ";
       }   
       return str;
    }
}
