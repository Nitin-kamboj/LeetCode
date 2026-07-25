public class ReverseWordsInString {
    public static void main(String[] args) {
        String s = " asdasd df f";
        System.out.println(Reverse(s));
    }
    public static String Reverse(String s){
        int pointer1 = s.length()-1;
        int pointer2 = s.length()-1;
        StringBuilder str = new StringBuilder();

        while(pointer1 >= 0){
            System.out.println(pointer1);
            pointer1--;
            if(s.charAt(pointer2) == ' '){
                pointer2 = pointer1;
            }
            if(pointer1 == -1 && pointer1 != pointer2){
                str.append(' ');
                str.append(s.substring(pointer1+1, pointer2+1));
                break;
            }else if(pointer1 == -1){
                break;
            }
            if(s.charAt(pointer1) == ' ' && s.charAt(pointer2) != ' '){
                if(str.length() != 0){
                str.append(" ");
                }
                str.append(s.substring(pointer1+1, pointer2+1));
                while(s.charAt(pointer1) == ' '){
                    pointer1--;
                    if(pointer1 <= 0){
                        break;
                    }
                }
                pointer2 = pointer1;
            }
        }
        return str.toString();
    }
}
