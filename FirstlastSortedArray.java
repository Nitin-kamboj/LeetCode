public class FirstlastSortedArray {
    public static void main(String[] args) {
        
    int arr[] = {1,3,5,6,6,6,7}; 
        int target = 6;
        System.out.println( searchfirst(arr, target, false));
        System.out.println(searchfirst(arr, target, true));
    }
    public static int searchfirst(int[] arr, int target, boolean findhigh){
        int first = -1;
        int last = -1;
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;

            if(arr[mid] == target){
                if(findhigh){
                    last = mid;
                    low = mid+1;
                }
                else{
                first = mid;
                high = mid-1;
                }
            }
            else if(target > arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        if(findhigh){
            return last;
        }
        else
        return first;
    }
}