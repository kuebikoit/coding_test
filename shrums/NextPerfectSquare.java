package com.kuebiko.it.second;

/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25, 23 -> -1
 *
 */
public class NextPerfectSquare {
public static boolean isPerfectSquare(int num){
  int sqrt = Math.sqrt(num);
  return num = sqrt*sqrt;
}
  public int getNextPerfectSquare(int num) {
    if(isPerfectSquare(num)){
      return (int) Math.pow(Math.sqrt(num)+1,2);
    }
    return -1;
  }
}
