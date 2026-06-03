public class ArraySearchingOperation {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int element = 40;

        int pos = -1;

        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            if(arr[i] == element)
            {
                pos = i;
                break;
            }
        }

        if(pos != -1)
        {
            System.out.println("Element found at "+pos+" index position");
        }
        else
        {
            System.out.println("Element not found");
        }

    }
}
