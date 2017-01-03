import java.util.Arrays;
public class C1E6{

    public static void main(String[] args){
        int[][] numbers = {
                            {1,0,0},
                            {0,1,0},
                            {1,0,1}
                          };
        rotate(numbers);
        System.out.println(Arrays.deepToString(numbers));
    }

    public static void rotate(int[][] image){
        for(int i=0; i<=image.length/2; i++){
            for(int j=0; j<=image.length/2; j++){
                int len=image.length;
                int temp=image[i][j];
                int iTransform1=len-1-j;
                int jTransform1=i;
                //System.out.println(iTransform1 + " " + jTransform1);
                image[i][j]=image[iTransform1][jTransform1];
                System.out.println(i + " " + j + " : " + iTransform1 + " " + jTransform1);
                System.out.println(Arrays.deepToString(image));
                int iTransform2=len-1-jTransform1;
                int jTransform2=iTransform1;
                image[iTransform1][jTransform1]=image[iTransform2][jTransform2];
                System.out.println(Arrays.deepToString(image));
                int iTransform3=len-1-jTransform2;
                int jTransform3=iTransform2;
                image[iTransform2][jTransform2]=image[iTransform3][jTransform3];
                System.out.println(Arrays.deepToString(image));
                image[iTransform3][jTransform3]=temp;
                System.out.println(Arrays.deepToString(image));
            }
        }
    }

}
