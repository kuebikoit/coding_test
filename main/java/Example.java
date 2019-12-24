public class Example {
    public int[] sort(int[] arr) {
        int[] copy = arr.clone();
        int size = copy.length;
        for(int i=0;i<size;i++)
        {
            int element_i=copy[i];
            for (int j=i+1;j<size;j++)
            {
                int element_j=copy[j];
                if(element_j<element_i)
                {
                    copy[i]=element_j;
                    copy[j]=element_i;
                    element_i= element_j;
                }
            }
        }
    return copy;
    }

    public static void main(String[] args) {
        Example systemUnderTest= new Example();
        int[] input= {4,3,2,5};
        System.out.println(systemUnderTest.sort(input));

    }
}
