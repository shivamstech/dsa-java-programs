public class Array_InsertionOperation {

    public static void main(String[] args) {

        int[] arr={10,20,30,40,50};

        for(int a:arr)
        {
            System.out.print(" "+a);
        }
        System.out.println(" ");
        int element=100 , index=3;

//   //      one way -------------

//        boolean rightindex=false;
//
//        if(index<arr.length){
//
//            for(int i=arr.length-1; i>index; i--)
//            {
//                arr[i]=arr[i-1];
//            }
//            arr[index]=element;
//
//            for(int a:arr)
//            {
//                System.out.print(" "+a);
//            }
//            rightindex=true;
//        }
//
//        if(!rightindex)
//        {
//            System.out.println("Invalid Index ");
//        }

     // Second way-----------------------------------------------------
        int[] arr1=new int[6]; // create a new array plus 1 size

        for(int i=0; i<index; i++) // put tha arr values in arr1 index tak
        {
            arr1[i]=arr[i];
        }
            arr1[index]=element;
        for(int i=index; i<arr.length ;i++)
        {
            arr1[i+1]=arr[i];
        }

        System.out.println(" ");
        for(int a:arr1)
        {
            System.out.print(" "+a);
        }
    }
}
