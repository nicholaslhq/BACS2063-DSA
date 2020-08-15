
package ADT;

import java.util.Iterator;

public class SortedLinkedList<T extends Comparable<T>> implements SortedLinkedListInterface<T> 
{

    private Node firstNode;
    private Node LastNode;
    private int length;

    public SortedLinkedList() {
        firstNode = null;
        LastNode = null;
        length = 0;
    }

    public boolean add(T newEntry) {
        Node newNode = new Node(newEntry);

        Node nodeBefore = null; 
        Node currentNode = firstNode;   
        while (currentNode != null && newEntry.compareTo(currentNode.data) < 0) {
            nodeBefore = currentNode;
            currentNode = currentNode.next;
        }

        if (isEmpty() || (nodeBefore == null)) { 
            newNode.next = firstNode;
            firstNode = newNode;
        } else {	
            newNode.next = currentNode;
            nodeBefore.next = newNode;
        }
        length++;
        return true;
    }

    @Override
       
      
      public boolean contains(T anEntry) {
          boolean found = false;
          Node currentNode = firstNode;
 
          while (!found && (currentNode != null)) 
          {
          if (anEntry.equals(currentNode.data))
          found = true;
          else
          currentNode = currentNode.next;
          } 
            return found;  
    }
      
      

    public final void clear() {
        firstNode = null;
        length = 0;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public String toString() 
    {
        String outputInt = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            outputInt += currentNode.data + "\n";;
            currentNode = currentNode.next;
        }
        return outputInt;
    }
    
    @Override
    public Iterator<T> getIterator() 
    {
       return new SortedLinkedListIterator();
    }

    private class SortedLinkedListIterator implements Iterator<T>
    {
        Node currentNode = firstNode;

        @Override
        public boolean hasNext() {
          return currentNode != null;
        }

        @Override
        public T next() {
          T currentElement = null;
          if (hasNext())
          {
              currentElement = currentNode.data;
              currentNode = currentNode.next;
          }
          return currentElement;
        }
    }
    
    
 
    private class Node {

        private T data;
        private Node next;
    
       

        private Node(T data) {
            this.data = data;
            next = null;
            
        }
      

        private Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}


