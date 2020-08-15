
package adt;

/**
 *
 * @author YKWong
 */
public class count<T> implements CountInterface<T> {
    private int countQty;

  public count() {
    countQty = 0;
  }

  public int getCount() {
    return countQty;
  }

  public void reset() {
    countQty = 0;
  }

  public void increment() {
    countQty++;
  }

  public void decrement() {
    if (countQty > 0) {
      countQty--;
    }
  }
}
