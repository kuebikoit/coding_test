package SafalKoirala.second;

/**
 * Given two positive number arrays,
 * first contains the number to evaluate which is smallest
 * in between the indexes contained in second array
 * find smallest number
 * eg. [1, 2, 4, 3, 7, 5] and [2, 4] => 3 (numbers evaluated 4, 3, 7)
 * [1, 3, 4, 3, 2, 5] and [0, 2] => 1 (numbers evaluated 1, 3, 4)
 * [7, 9, 10, 17, 2, 4] and [3, 5] => 2 (numbers evaluated 17, 2, 4)
 * [1, 2, 3, 0] and [0, 3] => 0 (numbers evaluated 1, 2, 3, 0)
 */
public class FindSmallestNumbersBetweenIndexes {

  public  int smallestNumberInBetween(int[] arr, int[] indexes) {

    int a = indexes[0];
    int b = indexes[1];
    int size=b-a+1;
    int min = 0;
    int temp=0;
    int res=0;
    int[] ar = new int[size];
    for (int i = a; i <= b; i++) {
      ar[min]=arr[i];
      min++;
    }
    for (int i = 0; i <= ar.length; i++) {
      for (int j = i + 1; j < ar.length; j++) {
        if (ar[i] < ar[j]) {
          temp = ar[i];
          ar[i] = ar[j];
          ar[j] = temp;
        }
      }
    }
    for (int i = 0; i <ar.length;i++){
      res=ar[i];
    }
    return res;
  }
}
