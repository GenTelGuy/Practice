import java.util.HashMap;
import java.util.Arrays;

public class C1E1{
    public static void main(String[] args){
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyza"));
        System.out.println(isUnique("aabcdefghijklmnopqrstuvwxyz"));
        System.out.println(isUnique("abcdefghijklmnopqrstuvwxyzz"));
        System.out.println(isUnique("zabcdefghijklmnopqrstuvwxyz"));
        System.out.println(isUnique("abcdefghijklmmnopqrstuvwxyz"));
        System.out.println(isUnique("abcdefghijklmnnopqrstuvwxyz"));
        System.out.println(isUnique("abcdefghijklmnopqrssssstuvwxyz"));

        System.out.println(isUniqueNoHash("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(isUniqueNoHash("abcdefghijklmnopqrstuvwxyza"));
        System.out.println(isUniqueNoHash("aabcdefghijklmnopqrstuvwxyz"));
        System.out.println(isUniqueNoHash("abcdefghijklmnopqrstuvwxyzz"));
        System.out.println(isUniqueNoHash("zabcdefghijklmnopqrstuvwxyz"));
        System.out.println(isUniqueNoHash("abcdefghijklmmnopqrstuvwxyz"));
        System.out.println(isUniqueNoHash("abcdefghijklmnnopqrstuvwxyz"));
        System.out.println(isUniqueNoHash("abcdefghijklmnopqrssssstuvwxyz"));
    }
    public static boolean isUnique(String input){
        HashMap< Character, Integer > map = new HashMap<Character, Integer>();
        for(int i=0; i<input.length(); i++){
            Integer lookup = map.get(input.charAt(i));
            if( lookup!=null ){
                return false;
            }
            else{
                map.put(input.charAt(i), 1);
            }
        }

        return true;
    }
    public static boolean isUniqueNoHash(String input){
        char[] inputChars = input.toCharArray();
        Arrays.sort(inputChars);        
        for(int i=1; i<input.length(); i++){
            if(inputChars[i]==inputChars[i-1]){
                return false;
            }
        }

        return true;
    }
}
