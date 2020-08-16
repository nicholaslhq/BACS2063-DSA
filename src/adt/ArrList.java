
package adt;

/**
 *
 * @author YKWong
 */
public class ArrList<T> implements ItemInterface<T> {
    T[] arrList;
    int numberOfElement;
    private final static int DEFAULT_CAPACITY = 25;
     
    public ArrList() {
    this(DEFAULT_CAPACITY);
  }

  public ArrList(int initialCapacity) {
    numberOfElement = 0;
    arrList = (T[]) new Object[initialCapacity];
  }
  
  public boolean add(T newElement)
  {
     
      if(isArrayFull())
          doubleArray();
      
      arrList[numberOfElement] = newElement;
      numberOfElement++;
      return true;
  }
  
  public boolean contains(T anEntry) {
     for(int i=0; i<numberOfElement; i++)
      {
          if(arrList[i].equals(anEntry))
              return true;
      }
     return false;
    }
  
public boolean replace(int givenPosition, T newEntry) {
    boolean isSuccessful = true;

    if ((givenPosition >= 1) && (givenPosition <= numberOfElement)) {
      arrList[givenPosition - 1] = newEntry;
    } else {
      isSuccessful = false;
    }

    return isSuccessful;
  }

  public boolean remove(T anElement)
  {
      boolean t = true;
      for(int i=0; i<numberOfElement; i++)
      {
          if(arrList[i].equals(anElement))
          {
              removeGap(i);
              numberOfElement--;
          }
          else
          {
             t = false; 
          }
      }
      return t;
  }
  public void clear()
  {
      numberOfElement = 0;
  }

  public boolean isEmpty()
  {
      return numberOfElement == 0;
  }
  
  private void doubleArray()
  {
      T[] oldArray = arrList;
      int oldSize = oldArray.length;
      arrList = (T[]) new Object[oldSize*2];
  }
  private boolean isArrayFull()
  {
      return numberOfElement == arrList.length;
  }
  
  private void removeGap(int index)
  {
     for(int i=index; i<numberOfElement; i++)
     {
         arrList[i] = arrList[i+1];
     }
  }
  
  public String toString()
  {
      String lst = "";
      for(int i=0; i<numberOfElement; i++)
      {
          lst += arrList[i];
          lst += "\n";
          
      }
      return lst;
  }
}
