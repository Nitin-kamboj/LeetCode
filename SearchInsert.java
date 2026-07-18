public class SearchInsert {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6}; 
        int target = 7;
        System.out.println( search(arr, target));
    }
    public static int search(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low+ (high-low)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(target > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
}
