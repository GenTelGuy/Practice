import java.util.HashMap;

public class C1E4{
    public static void main(String[] args){
        String s1="stop";
        String s2="pots";
        String s3="potsw";
        System.out.println( areAnagrams(s1, s2));
        System.out.println( areAnagrams(s1, s3));

    }

    public static boolean areAnagrams(String i1, String i2){
        if(i1.length()!=i2.length()){return false;}
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        char c1, c2;
        for(int i = 0; i<i1.length(); i++){
            c1=i1.charAt(i);
            c2=i2.charAt(i);
            map1.put(i1.charAt(i), (map1.get(c1)==null?0:map1.get(c1)+1));
            map2.put(i2.charAt(i), (map2.get(c2)==null?0:map2.get(c2)+1));
        }
        for(int i = 0; i < i1.length(); i++){
            if(map1.get(i1.charAt(i))!=map2.get(i2.charAt(i))){
                return false;
            }
        }
        return true;
    }


}
