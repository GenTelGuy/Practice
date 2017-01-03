public class C1E8{
    public static boolean isSubString(String s1, String s2){
        for(int i=0; i<s2.length(); i++){
            for(int j=0; j<s1.length() && i+j<s2.length(); j++){
                if(s1.charAt(j)!=s2.charAt(i+j)){
                    break;
                }
                else if(j==s1.length()-1){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isRotation(String correct, String rotation){
        String correctTwice=correct+correct;
        return(isSubString(rotation, correctTwice));
    }

    public static void main(String[] args){
        String s1 = "banana";
        String s2 = "abanan";
        System.out.println(isRotation(s1, s2));
    }


}
