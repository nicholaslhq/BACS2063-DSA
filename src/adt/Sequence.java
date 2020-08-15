package adt;

import java.util.Arrays;

public class Sequence<T> implements SequenceInterface<T> {
    //Declaration
    private T[] sequence, completedSeq; 
    private int startIndex;         //Store the index of first element
    private int endIndex;           //Store the index of last element
    private int counterIndex;       //Store the number of  element
    private int counterCompleted;   //Store the number of  element retrieved
    private final static int DEFAULT_CAPACITY = 5;
    
    //No Arguments Constructor
    public Sequence(){
        this(DEFAULT_CAPACITY);
    }
    
    //Parameterized Constructor
    public Sequence(int capacity){
        sequence = (T[])new Object[capacity];
        completedSeq = (T[])new Object[capacity];
        
        //Initializing
        startIndex = 0;
        endIndex = -1;
        counterIndex = 0;
        counterCompleted = 0;
    }
    
    //Implement methods
    @Override
    public void add(T newElement){ //Insert newElement at the end of the queue.

        if(isFull()){ //Check if the array is full
            doubleCapacity(); //Expand the array
        }
        
        endIndex = (endIndex + 1) % sequence.length; //Increase the last index by 1       
        sequence[endIndex] = newElement;
        
        counterIndex++; //Increase the number of element by 1 
    }

    @Override
    public T retrieve(){ //Retrieve and remove the first element from the queue, then add the retrieved element to the completed queue.
        if(!isEmpty()){
            T FirstElement = sequence[startIndex]; //Temporarily store the first element to a variable
            
            completedSeq[counterCompleted] = sequence[startIndex]; //Also insert the first element into the completed array
            
            sequence[startIndex] = null; //Remove the first element by assigning to null value
            startIndex = (startIndex + 1) % sequence.length; //Increase the first index by 1

            counterIndex--; //Decrease the number of element by 1 
            counterCompleted++; //Increase the number of element completed by 1 
            
            return FirstElement;
        }
        else{
            return null; //Return null if sequence array is empty
        }
    }

    @Override
    public T peek(){ //Retrieve the first element from the queue.
        T FirstElement = null;
        
        FirstElement = sequence[startIndex];
        
        return FirstElement;
    }

    @Override
    public T peek(int index){ //Retrieve the element at the position index from the queue.
        T FirstElement = null;
        
        if(index < size()){ //Check whether the input value is within the range, return null if not
            FirstElement = sequence[index];
        }
        
        return FirstElement;
    }

    @Override
    public int indexOf(T givenElement){ //Retrieve the index of the element at the position of first givenElement found in the queue.
        int index = -1;
        
        for(int i = startIndex; i != endIndex; i = (i + 1) % sequence.length){
                if(sequence[i].equals((givenElement))){
                    index = i; //If there is element in sequence array same as the input value then the index is equal
                }
            }
        
        if(sequence[endIndex].equals(givenElement)){ //Check for last index, because the for loop above only capable to loop from first to (last-1) index
                    index = endIndex;
                }
        
        return index; //Return -1 if givenElement is not in the queue.
    }

    @Override
    public int remaining(){ //Retrieve the number of elements from the second to the last element currently in the queue.
        int count = 0;
        
        for(int i = startIndex; i != endIndex; i = (i + 1) % sequence.length){
                if(sequence[i] != null){
                    count++;
                }
        }
        
        return count;
    }

    @Override
    public int size(){ //Retrieve the number of elements currently in the queue.
        return counterIndex;
    }

    @Override
    public int capacity(){ //Retrieve the total size of the array queue.
        return sequence.length;
    }

    @Override
    public boolean isEmpty(){ //Determine whether the queue is empty.
        return counterIndex == 0;
    }

    @Override
    public boolean isFull(){ //Determine whether the queue is full.
        return counterIndex == sequence.length;
    }

    @Override
    public void clear(){ //Remove all elements from the queue.
        if(!isEmpty()){ //Only proceed if the queue is not empty
            for(int i = startIndex; i != endIndex; i = (i + 1) % sequence.length){
                sequence[i] = null; //Assign null value to every value in the queue
            }
            
            sequence[endIndex] = null;
            
            //Reset the variable to initial state
            startIndex = 0;
            endIndex = -1;
            counterIndex = 0;
        }
    }

    @Override
    public void doubleCapacity(){ //Double the capacity of the queue.
        T[] newArr = (T[]) new Object[sequence.length * 2]; //To temporarily store sequence array
        T[] newArr2 = (T[]) new Object[sequence.length * 2]; //To temporarily store completedSeq array
        
        //Expand sequence array
        int count = 0;
        for(int i = startIndex; i != endIndex ; i = (i + 1) % sequence.length){
            newArr[count] = sequence[i];         
            count++;
        }
        
        newArr[count] = sequence[endIndex];
        
        sequence = newArr;
        startIndex = 0;
        endIndex = count;
        
        //Expand completedSeq array
        for(int i = 0; i < completedSeq.length; i++){
            newArr2[i] = completedSeq[i];
        }
        
        completedSeq = newArr2;
    }

    @Override
    public String completed(){ //Retrieve the elements that have been dequeued from the queue.
        String output = "Completed: ";
        
        if(counterCompleted > 0){ //Check whether the completed queue is empty
            for(int i = 0; i < counterCompleted - 1; i++){
                output += completedSeq[i]; //Concatenate the element into a string
                output += ", ";
            }

            output += completedSeq[counterCompleted - 1];
        }
        else{
            output = "There is nothing completed yet."; //Display a message if there is nothing in the completed queue
        }
        
        return output;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Arrays.deepHashCode(this.sequence);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sequence<?> other = (Sequence<?>) obj;
        if (!Arrays.deepEquals(this.sequence, other.sequence)) {
            return false;
        }
        return true;
    }

    
    
    @Override
    public String toString(){ //Retrieve all elements currently in the queue in string format.
        String output = "START:" + startIndex + " END:" + endIndex + " | QUEUE: ";
        
        if(!isEmpty()){ //Check whether the sequence queue is empty
            for(int i = startIndex; i != endIndex; i = (i + 1) % sequence.length){
                output += sequence[i]; //Concatenate the element into a string
                output += ", ";
            }

            output += sequence[endIndex];
        }
        else{
            output = null; //Assign null value if the queue is empty
        }
        
        return output;
    }
}
