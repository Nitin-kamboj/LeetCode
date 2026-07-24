public class Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,3}};
        int target = 3;
        // int row = findRow(arr, target);
        System.out.println(findTarget(arr,target));
    }
    // public static int findRow(int[][] arr, int target){
    //     for(int i = 0;i < arr.length; i++){
    //         System.out.println(arr[i][arr.length]);
    //         if(target <= arr[i][arr[0].length-1]){
    //             System.out.println(i);
    //             return i;
    //         }
    //     }
    //     return 0;
    // }
    // public static boolean  findTarget(int[][] arr, int target, int row) {
    //     int low = 0;
    //     int high = arr[row].length-1;

    //     while(low <= high){
    //         int mid = low + (high - low)/2;
    //         if(arr[row][mid] == target){
    //             return true;
    //         }
    //         if(target > arr[row][mid]){
    //             low = mid + 1;
    //         }
    //         else{
    //             high = mid -1;
    //         }
    //     }
    //     return false;
    // }
    public static boolean findTarget(int[][] arr, int target){
        int low = 0;
        int high = arr.length * arr[0].length -1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid / arr[0].length][mid % arr[0].length] == target){
                return true;
            }
            if(arr[mid / arr[0].length][mid % arr[0].length] > target){
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return false;
    }
}
