public class SearchRotatedArray2 {
    public static void main(String[] args) {
     int[] nums= {1,0,1,1,1};
         int target = 0;
         System.out.println(findTarget(nums,target));
    }
    public static boolean  findTarget(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;

        while(low <= high){
            
        int mid = low + (high - low)/2;
            if(nums[mid] == target){
                return true;
            }
            // check left sorted
            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                low +=1;
                high -=1;
            }
             else if(nums[low] <= nums[mid] ){
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
        return false;
    }
}

