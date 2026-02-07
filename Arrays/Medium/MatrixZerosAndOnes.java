public class MatrixZerosAndOnes {
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstrow = false, firstcolumn=false;

        for(int j=0; j<m; j++){
            if(matrix[0][j] == 0){
                firstrow = true;
                break;
            } 

        }
        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0){
                firstcolumn = true;
                break;
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix[0][j] ==0 || matrix[i][0] ==0) matrix[i][j] = 0;
            }
        }

        if(firstrow){
            for(int j=0; j<m; j++) matrix[0][j] = 0;
        }
        if(firstcolumn){
            for(int i=0; i<n; i++) matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        
        setZeroes(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
