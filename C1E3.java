public class C1E3{
    public static void main(String[] args){
        System.out.println(removeDuplicates("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(removeDuplicates("abcdefghijklmnopqrstuvwxyza"));
        System.out.println(removeDuplicates("aabcdefghijklmnopqrstuvwxyz"));
        System.out.println(removeDuplicates("abcdefghijklmnopqrstuvwxyzz"));
        System.out.println(removeDuplicates("zabcdefghijklmnopqrstuvwxyz"));
        System.out.println(removeDuplicates("abcdefghijklmmnopqrstuvwxyz"));
        System.out.println(removeDuplicates("abcdefghijklmnnopqrstuvwxyz"));
        System.out.println(removeDuplicates("abcdefghijklmnopqrssssstuvwxyz"));

    }

    public static String removeDuplicates(String input){
        char[] chrArray = input.toCharArray(); 
        for(int i = 0; i<chrArray.length-1; i++){
            if(chrArray[i]!='\0'){
                for(int j=i+1; j<chrArray.length; j++){
                    if(chrArray[j]==chrArray[i]){
                        chrArray[j]='\0';
                    }
                }
            }
        }
        String outputString="";
        for(int i = 0; i< chrArray.length; i++){
            outputString+=chrArray[i];
        }
        return(outputString);
    }
}
