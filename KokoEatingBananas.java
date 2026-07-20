public class KokoEatingBananas {
    public static void main(String[] args) {
        int piles[] = {3,6,7,11};
        int h = 8;
        int max = findsMax(piles);
        int minBananas = minBananas(piles, h, max);
        System.out.println(minBananas);
    }

    public static int findsMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static int minBananas(int[] arr, int h, int max){
        int min = Integer.MAX_VALUE;
        int low = 1;
        int high = max;

        while(low <= high){
            int mid = low + (high - low)/2;
            int totalHours=0;
            for(int i =0 ; i< arr.length; i++){
                totalHours+= Math.ceil((double)(arr[i]) / (double)(mid));
            }
            if(totalHours <= h){
                min = Math.min(min, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }

        return min;
    }
}
