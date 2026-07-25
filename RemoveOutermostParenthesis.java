public class RemoveOutermostParenthesis {
    public static void main(String[] args) {
        String s = "(()())(())";
        System.out.println(remove(s));
    }
    public static String remove(String s){
        StringBuilder str = new StringBuilder();
        int open = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(open == 0){
                open++;
                continue;
                }
                open++;
                str.append(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                open--;
                if(open != 0)
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}
