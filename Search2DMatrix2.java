public class Search2DMatrix2 {
    public static void main(String[] args) {
        int arr[][] = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 60;
        System.out.println(findTraget(arr, target));
    }
    public static boolean findTraget(int[][] arr, int target){
        int low = 0;
        int high = arr[0].length-1;

        while(low < arr.length &&  high >= 0){
            if(arr[low][high] == target){
                return true;
            }
            else if(arr[low][high] > target){
                high--;
            }
            else{
                low++;
            }
        }
        return false;
    }
}
