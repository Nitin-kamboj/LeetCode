public class LargestOddNumberInString {
    public static void main(String[] args) {
        String num = "52";
        System.out.println(findOdd(num));
    }
    public static String findOdd(String num){
        int n = num.length()-1;
        String max = "";
        if((int)(num.charAt(n)) % 2 != 0){
            return num;
        }
        for(int i = num.length() - 1; i >= 0; i--){
            if(num.charAt(i) % 2 != 0){
                return max = num.substring(0, i+1);
            }
        }
        return max;
    }
}
