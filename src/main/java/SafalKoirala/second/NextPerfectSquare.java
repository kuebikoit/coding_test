package SafalKoirala.second;

/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25, 23 -> -1
 *
 */
public class NextPerfectSquare {

  public int getNextPerfectSquare(int num) {
    if(isaPerfectSquare(num)){
      while (!isaPerfectSquare(++num)){

      }
      return num;
    }
    return num;
  }

  public boolean isaPerfectSquare(int num){
    int sqrt=(int)Math.sqrt(num);
    return num==sqrt*sqrt;
  }




}
