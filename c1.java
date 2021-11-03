public class c1 {
    public static void main(String[] args) {
        String [][] matrix = {{"*","*","*","*"},
                {"*","*","*","*"},
                {"*","*","*","*"},
                {"*","*","*","*"}};
        int length = matrix.length;
        for(int i =0;i<length;i++){
            for(int j =0;j<=i;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
