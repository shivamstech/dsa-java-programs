public class Array_TwoPointersPrograms {

    //1. WAP to check if array is palindrome or not ?

//    static boolean isPalindrome(int[] arr)
//    {
//        int L = 0;
//        int R = arr.length - 1;
//
//        while(L < R)
//        {
//            if(arr[L] != arr[R])
//            {
//                return false;
//            }
//
//            L++;
//            R--;
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {1,2,4,4,3,2,1};
//
//        System.out.println(isPalindrome(arr));
//    }


    //===========================================================================

    // 2. WAP to remove duplicate elements from a sorted array
//
//    public static void main(String[] args) {
//
//
//        int[] arr = {1, 2, 2, 3, 4, 5, 5, 5, 6, 6, 7};
//
//        int L = 0;
//
// //        for(int R=1; R<arr.length; R++)
// //        {
// //            if(arr[L] != arr[R])
// //            {
// //                L++;
// //                arr[L] = arr[R];
// //            }
// //        }
//
//        int R = 1;
//        while (R < arr.length) {
//            if (arr[L] != arr[R]) {
//                L++;
//                arr[L] = arr[R];
//                R++;
//            } else {
//                R++;
//            }
//        }
//
//        for (int i = 0; i <= L; i++) {
//            System.out.print(arr[i] + " ");
//        }
//
//  //        for(int a:arr)
//  //        {
//  //            System.out.print(" "+a);
//  //        }
//
//    }

    //============================================================================

    // 3. WAP to move all zeros to the end of an array

//    public static void main(String[] args) {
//
//        int[] arr = {5, 0, 6, 3, 0, 0, 0, 1, 2, 0, 7};
//
//        int L = 0;
//
//        for(int R=0; R<arr.length; R++)
//        {
//            if(arr[R] != 0)
//            {
//                int temp = arr[L];
//                arr[L] = arr[R];
//                arr[R] = temp;
//
//                L++;
//            }
//        }
//
//        for(int no : arr)
//        {
//            System.out.print(no+" ");
//        }
//
//    }

    //==============================================================

//
//    // 3.1 Second way WAP to move all zeros to the end of an array
//
//
//    public static void main(String[] args) {
//
//        int[] arr = {5, 0, 6, 3, 0, 0, 0, 1, 2, 0, 7};
//
//          int L=0;
//          int R=arr.length-1;
//
//          while(L<R)
//          {
//              if(arr[L]!=0)
//              {
//                  L++;
//              }
//              else if(arr[R]==0)
//              {
//                  R--;
//              }
//              else
//              {
//                  int temp=arr[L];
//                  arr[L]=arr[R];
//                  arr[R]=temp;
//
//                  L++;
//                  R--;
//              }
//
//
//          }
//            for(int a:arr)
//            {
//                System.out.print(" "+a);
//            }
//
//    }

    //============================================================================

//    // *WAP to reverse an array elements
//
//    public static void main(String[] args)
//    {
//        int[] arr = {10, 20, 30, 40, 50, 60, 70,80,};
//
//        int L = 0;
//        int R = arr.length - 1;
//
//        while(L<R)
//        {
//            int temp=arr[L];
//            arr[L]=arr[R];
//            arr[R]=temp;
//
//            L++;
//            R--;
//        }
//        for(int a:arr)
//        {
//            System.out.print(" "+a);
//        }
//    }

    //=====================================================================

//    // * WAP to shift all negative numbers to left side and positive to right side
//    public static void main(String[] args) {
//
//        int[] arr = {10, -4, -3, 20, 50, -7, 30};
//
//        int L=0;
//        int R=arr.length-1;
//
//        while(L<R)
//        {
//            if(arr[L] < 0)
//            {
//                 L++;
//            }
//            else if(arr[R]>=0)
//            {
//                R--;
//            }
//            else
//            {
//                int temp=arr[L];
//                arr[L]=arr[R];
//                arr[R]=temp;
//
//                L++;
//                R--;
//            }
//
//        }
//        for(int a:arr)
//        {
//            System.out.print(" "+a);
//        }
//    }


    //=============================================================================

//    //* Another way  WAP to shift all negative numbers to left side and positive to right side
//    // and Zero in middle.
//
//    public static void main(String[] args) {
//
//
//        int[] arr = {10, -4, 0, -3, 20, 50, -7, 0, 30};
//
//        int low = 0;   // negatives ke liye
//        int mid = 0;   // current element
//        int high = arr.length - 1; // positives ke liye
//
//        while (mid <= high)
//        {
//            if (arr[mid] < 0)
//            {   // Negative -> Left
//                int temp = arr[low];
//                arr[low] = arr[mid];
//                arr[mid] = temp;
//
//                low++;
//                mid++;
//            }
//            else if (arr[mid] == 0)
//            { // Zero -> Middle
//                mid++;
//            }
//            else
//            {   // Positive -> Right
//                int temp = arr[mid];
//                arr[mid] = arr[high];
//                arr[high] = temp;
//
//                high--;
//            }
//        }
//
//        for (int a : arr)
//        {
//            System.out.print(a + " ");
//        }
//    }
//
         //=================================================================================

//    // Remove duplicate
//
//    public int removeDuplicates(int[] nums) {
//
//        int L=0;
//
//        for(int R=1; R<nums.length; R++)
//        {
//            if(nums[L]!=nums[R])
//            {
//                L++;
//                nums[L]=nums[R];
//
//            }
//        }
//        return L+1;
//    }
//    public static void main(String[] args) {
//
//        int[] nums={0,0,1,1,1,2,2,3,3,4};
//
//        Array_TwoPointersPrograms ob=new Array_TwoPointersPrograms();
//
//        System.out.println(ob.removeDuplicates(nums));
//    }

}
