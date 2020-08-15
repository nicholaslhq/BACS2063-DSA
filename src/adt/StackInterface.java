package adt;




public interface StackInterface<T> {
    
    public void push(T Entry);   
    public T pop();   
    public T peek();
    public int search(T element);
    public void expand();
    public boolean isEmpty();
    public boolean isFull();
    public void clear();
}
