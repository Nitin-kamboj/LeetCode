public class FindPeakElement {
    public static void main(String[] args) {
        int arr[]= {1,2,1,3,5,6,4};
        System.out.println(findPeak(arr));
    }
    public static int findPeak(int[] arr){
        if(arr.length-1 == 0){
            return 0;
        }
        if(arr[0] > arr[1]){
            return 0;
        }
        if(arr[arr.length-1] > arr[arr.length-2]){
            return arr.length-1;
        }
        int low = 1;
        int high = arr.length -2;
        while(low <= high){
            int mid = low+ (high - low)/2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[mid+1]){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
