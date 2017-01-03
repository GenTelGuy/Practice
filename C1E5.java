
public class C1E5{
    public static void main(String[] args){
        String s1="Road to 5 languages";
        String s2="     ";
        String s3="aaa b";
        System.out.println(replaceSpaces(s1));
        System.out.println(replaceSpaces(s2));
        System.out.println(replaceSpaces(s3));

    }

    public static String replaceSpaces(String input){
        String output="";
        for(int i=0; i<input.length(); i++){
            if(input.charAt(i)==' '){
                output+="%20";
            }
            else{
                output+=input.charAt(i);
            }
        }
        return output;
    }



}
