
package ADT;

import java.util.Iterator;

 

public interface SortedLinkedListInterface<T extends Comparable<T>> {

  
  public boolean add(T newEntry);

  public boolean contains(T anEntry);

  public void clear();

  public int getLength();

  public boolean isEmpty();

  public Iterator<T> getIterator();

  //public void add(String string);
} 


