public class MinSortedRotatedArray {
     public static void main(String[] args) {
     int[] nums= {11,13,15,17};
         System.out.println(findMin(nums));
    }
    public static int  findMin(int[] nums){
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            
        int mid = low + (high - low)/2;
            // check left sorted
            if(nums[low] <= nums[mid] ){
                min = Math.min(min, nums[low]);
                low = mid+1;
            }
            else{
                min = Math.min(min, nums[mid]);
                high = mid - 1;
            }
        }
        return min;
    }
}
