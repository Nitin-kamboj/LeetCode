public class PeakElement2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int[] ar= (findPeak(arr));

        for(int i =0; i< ar.length;i++){
            System.out.println(ar[i]);
        }
    }
    public static int[] findPeak(int[][] arr){
        int low = 0;
        int high = arr[0].length-1;

        while(low <= high){
            int mid = low + (high - low)/2;  //col
            int maxRow = findmax(mid, arr);  //row
            int left = (mid > 0) ? arr[maxRow][mid - 1] : -1;
            int right = (mid < arr[0].length - 1) ? arr[maxRow][mid + 1] : -1;

            if (arr[maxRow][mid] > left && arr[maxRow][mid] > right) {
                return new int[] {maxRow, mid}; // [row, col]
            } 
            // Move binary search toward the larger neighbor
            else if (left > arr[maxRow][mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return new int[] {-1,-1};
    }

    public static int findmax(int col, int[][] arr){
        int max = Integer.MIN_VALUE;
        int maxrow = 0;
        for(int i= 0; i < arr.length; i++){
            max = Math.max(arr[i][col], max);
            if(max == arr[i][col]){
                maxrow = i;
            }
        }
        return maxrow;
    }
}
