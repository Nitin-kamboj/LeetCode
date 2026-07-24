public class MedianTwoSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2};
        int[] arr2 = {3,4};
        System.out.println(median(arr1, arr2)); 
    } 
    public static double median(int[] arr1, int[] arr2){
        if(arr1.length > arr2.length){
           return median(arr2, arr1);
        }
        int low = 0;
        int high = arr1.length;

        while(low <= high){
            int cut1 = low + (high - low)/2;
            int cut2 = (arr1.length + arr2.length + 1)/2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int r1 = (cut1 == arr1.length) ? Integer.MAX_VALUE : arr1[cut1];

            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r2 = (cut2 == arr2.length) ? Integer.MAX_VALUE : arr2[cut2];
            if(l1 <= r2 && l2 <= r1){
                if((arr1.length + arr2.length) % 2 == 0){
                    int num1 = Math.max(l1, l2);
                    int num2 = Math.min(r1, r2);
                    return (num1 + num2)/2.0;
                }
                else{
                    return (Math.max(l1, l2));
                }
            }
            else if( l1 > r2){
                high = cut1-1;
            }
            else{
                low = cut1 + 1;
            }
        }
        return 0.0;
    }
}
