public class ArraySortingOperation {

    public static void main(String[] args) {
//
//        // * Bubble sort
//
//        int[] arr={10,40,30,50,20};
//
//        for(int i=0; i<arr.length ; i++)
//        {
//            boolean swapped=false;
//            for(int j=0; j<arr.length-1; j++)
//            {
//                if(arr[j]>arr[j+1])
//                {
//
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    swapped=true;
//                }
//            }
//            if(!swapped)
//            {
//                break;
//            }
//        }
//        for(int a:arr)
//        {
//            System.out.print(" "+a);
//        }

        //=================================================================

        // * Selection Sort

        int[] arr = {32, 12, 25, 18, 42, 83, 91, 34, 55, 71, 6, 28};

        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            int minIndex = i;

            for(int j=i+1; j<n; j++)
            {
                if(arr[minIndex] > arr[j])
                {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for(int no : arr)
        {
            System.out.print(no+" ");
        }


    }
}
