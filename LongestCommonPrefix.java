public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(findLongest(strs));

    }
    public static String findLongest(String[] arr){
        boolean found = true;
        for(int i = arr[0].length(); i >= 0;i--){
            String pre = arr[0].substring(0, i);
            for(int j = 1 ; j< arr.length; j++){
                if(arr[j].length() >= i){
                if(!arr[j].substring(0, i).equals(pre)){
                    found = false;
                    break;
                }
            }else{
                found = false;
                    break;
            }
            }
            if(found){
                return pre;
            }
            found = true;
        }
            return "";
    } 
}
