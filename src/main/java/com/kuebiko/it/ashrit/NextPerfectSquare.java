package  com.kuebiko.it.ashrit;

/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25, 23 -> -1
 *
 */
public class NextPerfectSquare {

  public int getNextPerfectSquare(int num) {
    if (isNumberPerfect(num)) {
      do {
        num++;
      } while (!isNumberPerfect(num));
      return num;
    }
    return -1;
  }
  private boolean isNumberPerfect(int num) {
    int sqrt = (int)Math.sqrt(num);
    return num == sqrt*sqrt;
  }
}
