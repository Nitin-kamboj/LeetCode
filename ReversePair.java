public class ReversePair {
    public static void main(String[] args) {
        int arr[] = {1,3,2,3,1};
         int low = 0;
        int high = arr.length-1;
        int count = partition(arr, high, low);
        System.out.println(count);
    }

    public static int partition(int[] arr, int high, int low){
        int count = 0;
        if(low < high){
        int mid = low + (high - low)/2;
        count += partition(arr, mid, low);
        count += partition(arr, high, mid+1);
        count += pairCheck(arr,low,high,mid);
        merge(arr,low,high,mid);
        }
        return count;
    }
    public static void merge(int[] arr, int low, int high, int mid){
        
        int left = mid - low + 1;
        int right = high - mid;

        int leftArr[] = new int[left];
        int rightArr[] = new int[right];

        for (int i = 0; i < leftArr.length; i++) {
            leftArr[i] = arr[low+i];
        }
        for (int i = 0; i < right; i++) {
            rightArr[i] = arr[mid+i+1];
        }

        int leftPointer = 0;
        int rightPointer = 0;
        int i = low;

        while(leftPointer < leftArr.length && rightPointer < rightArr.length){
            if(leftArr[leftPointer] <= rightArr[rightPointer]){
                arr[i] = leftArr[leftPointer];
                leftPointer++;
            }
            else{
                arr[i] = rightArr[rightPointer];
                rightPointer++;
            }
            i++;
        }

        // copy the remaining from left if left
         while (leftPointer < left) {
            arr[i] = leftArr[leftPointer];
            leftPointer++;
            i++;
        }

        // copy the remainng from rtiught if left
        while (rightPointer < right) {
            arr[i] = rightArr[rightPointer];
            rightPointer++;
            i++;
        }

    }

    public static int pairCheck(int[] arr, int low, int high, int mid){
        int count = 0;
        int leftPointer = low;
    int rightPointer = mid + 1;

    while (leftPointer <= mid) {
        // Move rightPointer as far right as possible while the condition is met
        while (rightPointer <= high && arr[leftPointer] > 2.0 * arr[rightPointer]) {
            rightPointer++;
        }
        // All elements from the start of the right subarray up to rightPointer-1 are valid pairs
        count += (rightPointer - (mid + 1));
        leftPointer++;
    }
    
    return count;
    }
}
