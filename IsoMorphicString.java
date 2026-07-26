import java.util.Hashtable;
public class IsoMorphicString{
    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(findIso(s, t));
    }
    public static boolean findIso(String s, String t){
        Hashtable <Character, Character> table = new Hashtable<>();
        String str = "";
        for(int i = 0; i < s.length(); i++){
            if(! table.containsKey(s.charAt(i)) && !table.contains(t.charAt(i))){
            table.put(s.charAt(i), t.charAt(i));
            }
            str += table.get(s.charAt(i));
            System.out.println(str);
        }
        if(str.equals(t)){
            return true;
        }
        return false;
    }
}