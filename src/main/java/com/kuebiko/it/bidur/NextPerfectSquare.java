package com.kuebiko.it.bidur;

/**
 * Given a number, find if it's perfect square, if not perfect return -1
 * if perfect find the next perfect square
 * <p>
 * eg. 16 -> 25, 23 -> -1
 */
public class NextPerfectSquare {

    public int getNextPerfectSquare(int num) {
        boolean checker = checkPercect(num);
        if (checker) {
            int root = (int) Math.sqrt((double) num);
            int next_num = root + 1;
            int next_square = next_num * next_num;
            return next_square;
        }
        return -1;
    }

    public boolean checkPercect(int num) {
        int root = (int) Math.sqrt((double) num);
        return num == root * root;
    }
}
