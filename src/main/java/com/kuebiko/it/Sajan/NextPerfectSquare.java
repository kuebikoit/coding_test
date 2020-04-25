package com.kuebiko.it.Sajan;

/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25, 23 -> -1
 *
 */
public class NextPerfectSquare {

  public int getNextPerfectSquare(int num) {
    int next;
    int number = (int)Math.sqrt((double)num);
    if(num==(number*number)){
      next = (number+1)*(number+1);
    }
    else
      next = -1;
    return next;
  }
}
