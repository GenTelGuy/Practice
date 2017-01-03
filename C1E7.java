import java.util.Arrays;
public class C1E7{
    public static void main(String[] args){
        int[][] matrix = {
            {1, 1, 1, 1, 0},
            {1, 1, 0, 1, 0},
            {1, 1, 1, 1, 1}
        };
        zero(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    private static void zero(int[][] matrix){
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        for(int i=0; i<rows.length; i++){rows[i]=false;}
        for(int i=0; i<columns.length; i++){columns[i]=false;}


        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    rows[i]=true;
                    columns[j]=true;
                }
            }
        }
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(rows[i] || columns[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
