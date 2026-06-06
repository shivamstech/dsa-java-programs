import java.awt.*;

public class ArrayIterativeApproachTasks {
    public static void main(String[] args) {

//        //WAP to calculate the sum of even and odd numbers separately in a given array.
//
//        int[] arr={10,20,33,40,53,60,77};
//
//        int evensum=0;
//        int oddsum=0;
//
//        for(int i=0; i<arr.length; i++)
//        {
//            if(arr[i]%2 ==0)
//            {
//               evensum +=arr[i];
//            }
//            else{
//
//                oddsum +=arr[i];
//            }
//        }
//        System.out.println("Sum of even numbers "+evensum+" & Sum of odd number is "+oddsum);

        //===============================================================

//        // WAP to count the number of positive, negative, and zero elements in a given array.
//
//        int[] arr1={10,20,0,0,-1,0,-4,10,20};
//
//        int positivevalue=0 , zero=0 , negativevalue=0 ;
//
//        for(int i=0; i<arr1.length; i++)
//        {
//            if(arr1[i]>0)
//            {
//                positivevalue++;
//            }
//            else if(arr1[i]<0)
//            {
//                negativevalue++;
//            }
//            else if(arr1[i]==0)
//            {
//                zero++;
//            }
//        }
//        System.out.println("positive value is "+positivevalue+" / negative value is  "+negativevalue+" / Zero value is  "+zero);

        //=======================================================

//         //WAP to calculate the average of all elements in a given array .
//
//        int[] arr2={10,20,30,40,50};
//
//            int totalsum=0;
//           for(int i=0; i<arr2.length; i++)
//           {
//               totalsum +=arr2[i];
//           }
//           int result=totalsum /arr2.length;
//
//           System.out.println(result);

        //=================================================================

//        //WAP to swap two elements in a given array at specified positions.
//
//        int[] arr3={10,20,30,40,50,60,70};
//
//        //swap tha index 2 and index 4
//
//
//            int temp=0;
//
//            temp=arr3[1];
//            arr3[1]=arr3[4];
//            arr3[4]=temp;
//
//            for(int a:arr3)
//            {
//                System.out.print(" "+a);
//            }

      //==========================================================

//        //WAP to replace all negative elements in an array with zero .
//
//        int[] arr4={10,-1,20,-3,-3,-4,40};
//
//        for(int i=0; i<arr4.length; i++)
//        {
//            if(arr4[i]<0)
//            {
//                arr4[i]=0;
//            }
//        }
//        for(int a:arr4)
//        {
//            System.out.print(" "+a);
//        }

        //================================================================

//        //WAP to check whether all elements in an array are positive.
//
//        int[] arr5={10,20,-1,30,40};
//
//        boolean postive=true;
//        for(int i=0; i<arr5.length; i++)
//        {
//            if(arr5[i]<0)
//            {
//                postive=false;
//                break;
//            }
//        }
//        if(postive)
//        {
//            System.out.println("Array is positive");
//        }
//        else {
//            System.out.println("Array is not positive");
//        }

        //==============================================================
//
//        //WAP to count elements greater than a given number.
//
//        int[] arr6={10,20,30,40,50,60,70};
//
//        int givenNo=450;
//        int arraycount=0;
//
//        for(int i=0; i<arr6.length; i++)
//        {
//            arraycount +=arr6[i];
//        }
//        if(arraycount>givenNo)
//        {
//            System.out.println("count is greater then given number");
//        }
//        else {
//            System.out.println("given number is greater then count");
//        }

        //=========================================================

//        //WAP to find the greatest and smallest number in an array
//
//        int[] arr7={20,50,39,40,28,38,20,66,78};
//
//        int minValue=arr7[0];
//        int maxValue=arr7[arr7.length-1];
//
//        for(int i=0; i<arr7.length; i++)
//        {
//            if(minValue>arr7[i])
//            {
//                int temp=minValue;
//                minValue=arr7[i];
//                arr7[i]=temp;
//
//            }
//            if(maxValue<arr7[i])
//            {
//                int temp=maxValue;
//                maxValue=arr7[i];
//                arr7[i]=temp;
//            }
//        }
//        System.out.println("Min Value is "+minValue+" Max Value is "+maxValue);

        //==============================================================
//
//        //WAP to find the Second Largest Element in an array
//
//        int[] arr8={99,20,40,88,57,37,48,88};
//
//          int largest= Integer.MIN_VALUE;
//          int secondlargest= Integer.MIN_VALUE;
//
//          for(int i=0; i<arr8.length; i++)
//          {
//              if(largest<arr8[i])
//              {
//                    secondlargest=largest;
//                  largest=arr8[i];
//              }
//              else if(arr8[i]<largest && secondlargest<arr8[i])
//              {
//                  secondlargest=arr8[i];
//              }
//
//          }
//
//          System.out.println(secondlargest);

        //========================================================================

        //WAP to check if two arrays are same or not

        int[] arr9={10,20,30,40,50,60};
        int[] arr10={10,20,88,40,50,60};

        int n1=arr9.length;
        int n2=arr10.length;
        boolean same=true;

        if(n1!=n2)
        {
            System.out.println("Arrays are not same");
            return;
        }
        for(int i=0; i<n1; i++)
        {
            if(arr9[i]!=arr10[i])
            {
                same=false;
                break;
            }
        }
        if(same)
        {
            System.out.println("Array are same ");
        }
        else {
            System.out.println("Array are not same ");
        }
    }
}
