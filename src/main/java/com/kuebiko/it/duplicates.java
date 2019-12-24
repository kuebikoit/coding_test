import java.util.ArrayList;

public class duplicates {

    public static void main(String[] args) {

        String[] arr= {"one","two","four","four","one","four"};
        ArrayList<String> duplicates = new ArrayList<>();



        for(int i=0;i<arr.length;i++){
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]==arr[j]){
                    if (!duplicates.contains (arr[j]))
                    {
                        duplicates.add(arr[j]);
                    }
                    break;
                }
            }
        }
        System.out.println (duplicates);
    }
}
