import java.util.HashMap;

public class SubArraySumEqualK {
    public static void main(String[] args) {
        int arr[] = {3, 4, 7};
        int k = 7;
        int cnt = subarray(arr, k);
        System.out.println(cnt); 
    }

    public static int subarray(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1); 
        
        int currentSum = 0;
        int count = 0;

        for (int idx = 0; idx < arr.length; idx++) {
            currentSum = currentSum + arr[idx];
            int num = currentSum - k;
            
            if (map.containsKey(num)) {
                count += map.get(num); 
            }
            
            // Fix 3: Don't forget to track the current prefix sum!
            map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
        }
        return count;
    }
}