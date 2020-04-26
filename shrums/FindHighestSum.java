import java.util.Arrays;

/**
 * Given array of positive integers "arr" and a number "num"
 * find highest sum from the "arr" by using the total number of elements = "num"
 *
 * eg. arr = [5,2,3,4,1], num = 3 => 12 (5+3+4)
 * arr = [1, 11, 111], num = 1 => 111 (1)
 * arr = [3, 7, 2, 5], num = 2 => 12 (7 + 5)
 */
public class FindHighestSum {

  private  int[] sortInverse(int [] arr,int num){
    Arrays.sort(arr);
    int [] newArr =new int[num];
    int len = arr.length-1;
    for(int i=0;i<num;i++) {
      newArr[i] = arr[len-i];
    }
    return newArr;
  }
  public  int findHighestSum(int[] arr, int num) {

    int [] newArr;
    newArr= sortInverse(arr,num);
    int total =0;
    for (int i = 0;i<num;i++){
      total+=newArr[i];
    }
    return total;
  }
}
