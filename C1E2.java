public class C1E2{
    public static void main(String[] args){
        String test = "test string\0";
        
        char[] charArray=test.toCharArray();
        System.out.println(charArray.length);
        reverse(charArray);
        System.out.println(charArray);
    }

    public static void reverse(char[] input){
        int low=0;
        int high=input.length-2;
        char temp;
        while(high>low){
            temp=input[low];
            input[low]=input[high];
            input[high]=temp;
            low++;
            high--;
        }
    }
}
