public class MergeSort{
    public static void main(String[] args) {
        int arr[] = {7,5,3,8,1,4,2};
        int low = 0;
        int high = arr.length-1;
        split(arr,low,high);

        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
    public static void split(int []arr, int low, int high){
        if(low<high){
        int mid = low + (high - low) / 2;
        split(arr, low, mid);
        split(arr, mid+1, high);
        merge(arr,low,mid,high);
        }

    }
    public static void merge(int[] arr,int low, int mid, int high){
        int left =mid - low + 1;
        int right = high - mid;
        int leftArr[] = new int[left];
        int rightArr[] = new int[right];

        for (int i = 0; i < left; i++) {
            leftArr[i] = arr[low+i];
        }
        for (int i = 0; i < right; i++) {
            rightArr[i] = arr[mid+i+1];
        }

        int leftPointer = 0;
        int rightPointer = 0;
        int i = low;
        while(leftPointer < left && rightPointer < right){
            if(leftArr[leftPointer] <= rightArr[rightPointer]){
                arr[i] = leftArr[leftPointer];
                leftPointer++;
                i++;
            }
            else{
                arr[i] = rightArr[rightPointer];
                rightPointer++;
                i++;
            }
        }
        while (leftPointer < left) {
            arr[i] = leftArr[leftPointer];
            leftPointer++;
            i++;
        }

        // 6. Copy remaining elements of rightArr[], if any
        while (rightPointer < right) {
            arr[i] = rightArr[rightPointer];
            rightPointer++;
            i++;
        }

    }
}