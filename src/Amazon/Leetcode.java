package Amazon;

public class Leetcode {

    public static void main(String[] args) {

        new Leetcode().print2DArray(new int[][]{{1,2,3},{4,5,6},{7,8,9}});


    }




    public void print2DArray(int[][] matrix){

        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }


    }



}
