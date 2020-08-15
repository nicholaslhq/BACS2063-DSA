package adt;

public interface SequenceInterface<T> {
    public void add(T newElement);          //Insert newElement at the end of the queue.
    public T retrieve();                    //Retrieve and remove the first element from the queue, then add the retrieved element to the completed queue.
    public T peek();                        //Retrieve the first element from the queue.
    public T peek(int index);               //Retrieve the element at the position index from the queue.
    public int indexOf(T givenElement);     //Retrieve the index of the element at the position of first givenElement found in the queue.
    public int remaining();                 //Retrieve the number of elements from the second to the last element currently in the queue.
    public int size();                      //Retrieve the number of elements currently in the queue.
    public int capacity();                  //Retrieve the total size of the array queue.
    public boolean isEmpty();               //Determine whether the queue is empty.
    public boolean isFull();                //Determine whether the queue is full.
    public void clear();                    //Remove all elements from the queue.
    public void doubleCapacity();           //Double the capacity of the queue.
    public String completed();              //Retrieve the elements that have been dequeued from the queue.
    public String toString();               //Retrieve all elements currently in the queue in string format.
}
