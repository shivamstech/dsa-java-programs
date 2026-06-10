public class ArrayBruteForceApproachTasks {
    public static void main(String[] args) {

        // * WAP to find the intersection of two arrays (Common Elements)
        // [1,2,3,4,5]+[3,4,5,6,7] = [3,4,5]

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int n1=arr1.length;
        int n2=arr2.length;

        int index=0;


        int[] newArr = new int[Math.min(arr1.length, arr2.length)];

        for(int i=0; i<n1; i++)
        {
            for(int j=0; j<n2; j++)
            {
                if(arr1[i]==arr2[j])
                {
                    newArr[index]=arr1[i];
                    index++;
                }
            }

        }
        for(int a: newArr)
        {
            System.out.print(" "+a);

        }

        //=======================================================================

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

//        //o WAP to find all non-Repeating Elements in an array
//
//        int[] arr = {10, 20, 10, 30, 20, 40, 10};
//
//        int n = arr.length;
//
//        for(int i=0; i<n; i++)
//        {
//            int count = 0;
//            for(int j=0; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                }
//            }
//
//            if(count == 1)
//            {
//                System.out.print(arr[i]+" ");
//            }
//        }

        //====================================================================

//        //o WAP to find the first non-Repeating Element
//
//        int[] arr = {10, 20, 10, 10, 20, 40, 40};
//
//        int n = arr.length;
//
//        boolean found = false;
//
//        for(int i=0; i<n; i++)
//        {
//            int count = 0;
//            for(int j=0; j<n; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    count++;
//                }
//            }
//
//            if(count == 1)
//            {
//                System.out.println("First non-repeating element is "+arr[i]);
//                found = true;
//                break;
//            }
//        }
//
//        if(!found)
//        {
//            System.out.println("Non-repeating element not found");
//        }

        //======================================================================

//        // o WAP to find the first non-Repeating Element
//
//        int[] arr = {10, 20, 10, 20, 10, 30};
//
//        int n = arr.length;
//
//        boolean[] bArr = new boolean[n];
//
//        boolean found = false;
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
//            if(count == 1)
//            {
//                found = true;
//                System.out.println("First non-repeating element is "+arr[i]);
//                break;
//            }
//        }
//
//        if(!found)
//        {
//            System.out.println("Non-repeating element not found");
//        }

        //===========================================================================

        // o WAP to find all pairs of elements whose sum equals to target

//        int[] arr = {2, 3, 5, 7, 8, 9, 11, 15};
//        int target = 12;
//
//        int n = arr.length;
//
//        for(int i=0; i<n; i++)
//        {
//            for(int j=i+1; j<n; j++)
//            {
//                if(arr[i]+arr[j] == target)
//                {
//                    System.out.println(arr[i]+" - "+arr[j]);
//                }
//            }
//        }

        //=======================================================================

//        //o WAP to remove duplicate elements in an array
//        //    -> Using temporary array
//
//        int[] arr = {10, 20, 10, 50, 20, 30, 40};
//
//        int n = arr.length;
//        int[] temp = new int[n];
//
//        int index = 0;
//
//        for(int i=0; i<n; i++)
//        {
//            boolean isDuplicate = false;
//
//            for(int j=0; j<index; j++)
//            {
//                if(arr[i] == temp[j])
//                {
//                    isDuplicate = true;
//                    break;
//                }
//            }
//
//            if(!isDuplicate)
//            {
//                temp[index] = arr[i];
//                index++;
//            }
//        }
//
//        for(int no : temp)
//        {
//            System.out.print(no+" ");
//        }

    //=======================================================================

//        //o WAP to remove duplicate elements in an array
//
//        int[] arr = {10, 20, 10, 50, 20, 30, 40};
//
//        int n = arr.length;
//
//        int index = 0;
//
//        for(int i=0; i<n; i++)
//        {
//            boolean found = false;
//
//            for(int j=0; j<index; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    found = true;
//                    break;
//                }
//            }
//
//            if(!found)
//            {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//
//        for(int i=0; i<index; i++)
//        {
//            System.out.print(arr[i]+" ");
//        }

        //=================================================================

//        // o WAP to remove duplicate elements in an array
//
//        int[] arr = {10, 20, 10, 50, 20, 30, 40};
//
//        int n = arr.length;
//
//        int index = 0;
//
//        for(int i=0; i<n; i++)
//        {
//            boolean found = false;
//
//            for(int j=0; j<index; j++)
//            {
//                if(arr[i] == arr[j])
//                {
//                    found = true;
//                    break;
//                }
//            }
//
//            if(!found)
//            {
//                arr[index] = arr[i];
//                index++;
//            }
//        }
//
////        for(int i=index; i<n; i++)
////        {
////            arr[i] = 0;
////        }
//
//        while(index < n)
//        {
//            arr[index] = 0;
//            index++;
//        }
//
//        for(int no : arr)
//        {
//            System.out.print(no+" ");
//        }


    }
}
