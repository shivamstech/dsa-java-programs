public class ArrayBruteForceApproachTasks {
    public static void main(String[] args) {


        // o WAP to Count the Frequency of Each Element

        int[] arr = {10, 20, 10, 30, 20, 40, 10}

        int n = arr.length;

        for(int i=0; i<n; i++)
        {
            boolean isRepeated = false;
            for(int k=0; k<i; k++)
            {
                if(arr[i]==arr[k])
                {
                    isRepeated = true;
                    break;
                }
            }

            if(isRepeated)
            {
                continue;
            }

            int count = 1;
            for(int j=i+1; j<n; j++)
            {
                if(arr[i] == arr[j])
                {
                    count++;
                }
            }

            System.out.println(arr[i]+" -> "+count+" times");
        }

    }
}
