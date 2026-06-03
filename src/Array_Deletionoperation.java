public class Array_Deletionoperation
{
    public static void main(String[] args) {


        int[] arr={10,20,30,40,50};

        int index=-3;
        boolean rightindex=false;

        if(index >=0 && index <arr.length)
        {
            for(int i=index; i<arr.length-1; i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=0;
            for(int a:arr)
            {
                System.out.print(" "+a);
            }
            rightindex=true;
        }

        if(!rightindex)
        {
            System.out.println("Index is not correct so you can't delet it");
        }


    }
}
