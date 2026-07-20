public class findKthPositive {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(find(arr, k));

    }
    public static int find(int[] arr, int k){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - (mid + 1);

            if(missing >= k){
                high = mid-1;
            }
            else{
                low = mid+1; 
            }
        }
        return high + 1 + k;
    }
}
