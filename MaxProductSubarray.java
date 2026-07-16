public class MaxProductSubarray {
    public static void main(String[] args) {
        int arr[] = {-2,0,-1};
        int max = MaxSubarray(arr);
        System.out.println(max);
    }
    public static int MaxSubarray(int[] arr){
        int max = Integer.MIN_VALUE;
        int prefix = 1;
        int postfix = 1;

        for(int i =0; i< arr.length; i++){
            if(prefix == 0) prefix=1;
            if(postfix == 0) postfix = 1;
            prefix *= arr[i];
            postfix *= arr[arr.length - 1 - i];
            max = Math.max(max, Math.max(postfix, prefix));
        }
        return max;
    }
}
