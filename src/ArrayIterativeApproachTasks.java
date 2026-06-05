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

         //WAP to calculate the average of all elements in a given array .

        int[] arr2={10,20,30,40,50};

            int totalsum=0;
           for(int i=0; i<arr2.length; i++)
           {
               totalsum +=arr2[i];
           }
           int result=totalsum /arr2.length;

           System.out.println(result);
    }
}
