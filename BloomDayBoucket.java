public class BloomDayBoucket {
    public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3;
        int k =1;
        int max = max(bloomDay);
        System.out.println(minDay(bloomDay, m, k, max));
    }
    public static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i< arr.length; i++){
            max = Math.max(arr[i], max);
        }
        return max;
    }

    public static int minDay(int[] arr, int m, int k, int max){
        int low = 1;
        int high = max;
        int minDay = -1;

        while(low <= high){
            boolean checkHigher = true;
            int mid = low + (high - low)/2;
            int flowerBlommed = 0;
            int Bouquets = 0;
            for(int i = 0 ; i < arr.length; i++){
                if(arr[i] <= mid){
                    flowerBlommed++;
                    if(flowerBlommed == k){
                        Bouquets++;
                        if(Bouquets == m){
                            minDay = mid;
                            high = mid-1;
                            checkHigher = false;
                            break;
                        }
                        flowerBlommed=0;
                    }
                }
                else{
                    flowerBlommed = 0;
                }
                
            }
            if(checkHigher){
                low = mid+1;
            }

            
        }
        return minDay;


    }

}
