public class ArrayBruteForceApproachTasks {
    public static void main(String[] args) {


//        // o WAP to Count the Frequency of Each Element
//
//        int[] arr = {10, 20, 10, 30, 20, 40, 10}
//
//        int n = arr.length;
//
//        for(int i=0; i<n; i++)
//        {
//            boolean isRepeated = false;
//            for(int k=0; k<i; k++)
//            {
//                if(arr[i]==arr[k])
//                {
//                    isRepeated = true;
//                    break;
//                }
//            }
//
//            if(isRepeated)
//            {
//                continue;
//            }
//
//            int count = 1;
//            for(int j=i+1; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                }
//            }
//
//            System.out.println(arr[i]+" -> "+count+" times");
//        }

        //==================================================================

//        // o WAP to Count the Frequency of Each Element
//
//
//        int[] arr = {10, 20, 10, 30, 20, 40, 10};
//
//        int n = arr.length;
//
//        boolean[] bArr = new boolean[n];
//
//        for(int i=0; i<n; i++)
//        {
//            if(bArr[i])
//            {
//                continue;
//            }
//
//            int count = 1;
//            for(int j=i+1; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                    bArr[j] = true;
//                }
//            }
//
//            System.out.println(arr[i]+" -> "+count+" times");
//        }

        //=============================================================

//        // o WAP to print only the elements with frequency greater than 1
//
//        int[] arr = {10, 20, 10, 30, 20, 40, 10};
//
//        int n = arr.length;
//
//        boolean[] bArr = new boolean[n];
//
//        for(int i=0; i<n; i++)
//        {
//            if(bArr[i])
//            {
//                continue;
//            }
//
//            int count = 1;
//            for(int j=i+1; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                    bArr[j] = true;
//                }
//            }
//
//            if(count > 1)
//            {
//                System.out.println(arr[i]+" -> "+count+" times");
//            }
//        }

        //===================================================

        // o WAP to find the element with the highest frequency
//
//        int[] arr = {10, 20, 10, 30, 20, 40, 10, 20, 50, 20, 10};
//
//        int n = arr.length;
//
//        int maxCount = 0;
//        int maxElement = arr[0];
//
//        boolean[] bArr = new boolean[n];
//
//        for(int i=0; i<n; i++)
//        {
//            if(bArr[i])
//            {
//                continue;
//            }
//
//            int count = 1;
//            for(int j=i+1; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                    bArr[j] = true;
//                }
//            }
//
//            if(count > maxCount)
//            {
//                maxCount = count;
//                maxElement = arr[i];
//            }
//        }
//
//        System.out.println(maxElement+" -> "+maxCount+" times");

     //==============================================================================

        //o WAP to find all non-Repeating Elements in an array

        int[] arr = {10, 20, 10, 30, 20, 40, 10};

        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            int count = 0;
            for(int j=0; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            if(count == 1)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
