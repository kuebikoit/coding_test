package com.kuebiko.it;

/**
 * 2^2 -> 4
 * Given a number, find if its perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25
 * 23 -> -1
 *
 * primitive vs Object
 * int -> Integer
 */
public class NextPerfectSquare {

  public int getNextPerfectSquare(int num) {
    if (isNumberPerfect(num)) {

      while (!isNumberPerfect(++num)) {

      }
      return num;
    }

    return -1;
  }

  private boolean isNumberPerfect(int num) {
    int sqrt = (int)Math.sqrt(num); //25 -> 5, 5 * 5 -> 25

    return num == sqrt*sqrt;
  }

}
