public class QuickSort{
    public static void main(String[] args) {
        int arr[] = {7,5,3,8,1,4,2};
        quickSort(arr, 0, arr.length-1);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static void quickSort(int arr[], int low, int high){
        if(low < high){
        int partition_index = partition(arr,low,high);

        quickSort(arr, low, partition_index);
        quickSort(arr, partition_index+1, high);
        }


    }
    public static int partition(int[] arr, int low, int high){
        int mid = low + (high - low)/2;
        int pivot = arr[mid];
        int leftPointer = low-1;
        int rightPointer = high + 1;
        while(true){
            // move leftPointer
            do { 
                leftPointer++;
            } while (arr[leftPointer] < pivot);

            //move right pointer
            do { 
            rightPointer--;
        } while (arr[rightPointer] > pivot);

        if (leftPointer >= rightPointer) {
                return rightPointer; 
            }
            swap(arr, leftPointer, rightPointer);
        }
    }

    public static void swap(int[] arr, int pointer1, int pointer2){
        int temp = arr[pointer1];
        arr[pointer1] = arr[pointer2];
        arr[pointer2] = temp;
    }
}