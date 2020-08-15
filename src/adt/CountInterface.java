
package adt;

/**
 *
 * @author YKWong
 */
public interface CountInterface<T> {
  public int getCount();

  public void reset();

  public void increment();

  public void decrement();
}
