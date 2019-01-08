//serline cai
public class SortingUtil {
    public static void swaps(int arr[],int i, int j){
        int temp = arr [j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }

    public static void BubbleSort(int[]arr){

            for (int i=0; i<arr.length-1; i++)
            {
                for (int j = 0; j < arr.length - i -1 ; j++)
                {
                    if (arr[j]>arr[j+1])
                    {
                        swaps(arr, i, j);
                    }
                }

            }
        }

     public static boolean isSorted(int[]arr){
        for (int i=0; i<arr.length-1; i++)
        {
            if (arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
     }
     
     public static boolean checkSum(int[]before, int[]after) {
        int a = 0;
        int b = 0;

        for (int i=0; i<before.length; i++)
        {
            b+=before[i];
        }
        for (int i=0; i<after.length; i++)
        {
            a+=after[i];
        }
         if (a==b)
         {
             return true;
         }
         return false;
     }

}

