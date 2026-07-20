// Capacity to ship packages within Days 
public class CapacityToShipPackages {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1,1};
        int days = 4;
        int totalWeight = totalWeight(arr);
        System.out.println(minDays(arr, days, totalWeight));
    }
    public static int totalWeight(int arr[]){
        int total = 0;
        for(int i =0;i <arr.length; i++){
            total+=arr[i];
        }
        return total;
    }
    public static int minDays(int[] arr, int days, int maxWeight){
        int low = 1;
        int high = maxWeight;
        int minWeight = Integer.MAX_VALUE;
        int numberOfDays = 0;
        int WeightCheck = 0;
        for (int w : arr) {
            low = Math.max(low, w);
        }

        while(low <= high){
            int mid = low + (high - low)/2;
            for(int i = 0; i < arr.length; i++){
                WeightCheck += arr[i];
                int nextWeight = 0;
                if(arr.length > i+1){
                nextWeight = WeightCheck + arr[i+1];
                }
                if(WeightCheck == mid || nextWeight > mid){
                    numberOfDays++;
                    WeightCheck=0;
                }
                else if(nextWeight == 0){
                    numberOfDays++;
                    WeightCheck=0;
                }
            }
            if(numberOfDays > days){
                low=mid+1;
                numberOfDays=0;
            }
            else{
                high=mid-1;
                minWeight= Math.min(minWeight, mid);
                numberOfDays=0;
            }
        }
        return minWeight;
    }
}
