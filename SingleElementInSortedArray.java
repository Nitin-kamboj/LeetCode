public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(singleElement(arr));
    }
    public static int singleElement(int[] arr){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(low - high == 0){
                return arr[low];
            }

            if( arr[mid] == arr[mid-1] ){
                if(((mid-1) - high) % 2 ==0){
                    low = mid+1;
                }
                else{
                    high = mid-2;
                }
            }
            else if(arr[mid] == arr[mid+1]){
                if((mid - high) % 2 ==0){
                    low = mid+2;
                }
                else{
                    high = mid-1;
                }
            }
            else{
                return arr[mid];
            }
        }
        return -1;
    }
}
