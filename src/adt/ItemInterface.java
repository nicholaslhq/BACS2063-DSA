
package adt;

/**
 *
 * @author YKWong
 */
public interface ItemInterface<T> {
    
    public boolean add(T newElement);
    public boolean isEmpty();
    public void clear();
    public boolean remove(T anElement);
    
}
