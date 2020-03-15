package com.kuebiko.it.bibhusan;

/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 *
 * eg. 16 -> 25, 23 -> -1
 *
 */
public class NextPerfectSquare {

  public int getNextPerfectSquare(int num) {
    if(!isPerfectSquare(num)){
      return -1;
    }
    else{
      while (true){
        if(isPerfectSquare(++num)){
          return num;
        }
      }
    }
  }

  private boolean isPerfectSquare(int square){
    double num= Math.sqrt((double) square);
    if(Math.pow((int)num,2)==square){
      return true;
    }
    return false;
  }
}
