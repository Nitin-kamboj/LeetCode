public class SearchRotatedArray {
    public static void main(String[] args) {
        int[] nums= {4,5,6,7,0,1,2};
        int target = 21;
         System.out.println( findTarget(nums,target));
    }
    public static int findTarget(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            
        int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return mid;
            }
            // check left sorted
             if(nums[low] <= nums[mid]){
                if(target < nums[mid] && target >= nums[low]){
                    high = mid-1;
                }else{
                    low= mid+1;
                }
            }
            else{
                if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }else{
                    high= mid - 1;
                }
            }
        }
        return -1;
    }
}
