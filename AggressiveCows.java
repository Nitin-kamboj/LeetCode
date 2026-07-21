
import java.util.Arrays;

public class AggressiveCows {
    public static void main(String[] args) {
        int arr[] = {4,2,1,3,6}; 
        Arrays.sort(arr);
        int k = 2;
        int n = 6;
        System.out.println(findDistance(arr, k));

    }
    public static int findDistance(int[] arr, int k){
        int low = arr[0];
        int high = arr[arr.length-1] - arr[0];
        int ans = Integer.MIN_VALUE;
        

        // 0,3,4,7,9,10
        while(low <= high){
            int mid = low + (high - low)/2;
            int cowsFound = 1;
            int StartingCowPosition = arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] - StartingCowPosition >= mid){
                    cowsFound++;
                    StartingCowPosition = arr[i];
                }
            }
            if(cowsFound < k){
                high = mid - 1;
            }
            else{
                ans = Math.max(ans,mid);
                low = mid + 1;
            }
        }
        return ans;
    }
    
}
