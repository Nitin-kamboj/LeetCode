public class SmallestDivisorGIvenTreshold {
    public static void main(String[] args) {
    int arr[] = {1,2,5,9};
    int threshold = 6;

    int max = findsMax(arr);
    System.out.println(findSmallest(arr, threshold, max));

    }
    public static int findsMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int findSmallest(int[] arr, int threshold, int max){
        int minNumber = Integer.MAX_VALUE;
        int low = 1;
        int high = max;
        long totalNumber = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            for(int i = 0;i < arr.length; i++){
                totalNumber+= Math.ceil((double)arr[i]/mid);
            }
            if(totalNumber <= threshold){
                minNumber = Math.min(minNumber, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
            totalNumber=0;
        }
        return minNumber;
    }
}
