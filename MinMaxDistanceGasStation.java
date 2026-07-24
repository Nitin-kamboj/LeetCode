public class MinMaxDistanceGasStation{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int k =1;
        double maxGap = findMaxDistance(arr);
        System.out.println(find(arr,k,maxGap));
    }
    public static double findMaxDistance(int[] arr){
        long max = Integer.MIN_VALUE;
        for (int i =0; i < arr.length-1; i++){
            long gap = arr[i+1] - arr[i];
            max = Math.max(max, gap);
        }
        return max;
    }
    public static double  find(int[] arr, int k , double  maxGap){
        double low = 0;
        double high = maxGap;
        while(high - low > 1e-6){
        int cnt = 0;
            double mid = low + (high - low)/2;
            for(int i =1; i< arr.length; i++){
                int numberOfGasStations  = (int)((arr[i] - arr[i-1]) / mid);
                if ((arr[i] - arr[i - 1]) / mid == numberOfGasStations) {
                numberOfGasStations--;
            }
                cnt+= numberOfGasStations;
            }
            if(cnt > k){
                low = mid;
            }
            else{
                high = mid;
            }
        }
        return high;
    }
}