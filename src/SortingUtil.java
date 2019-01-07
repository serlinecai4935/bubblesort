
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
}

