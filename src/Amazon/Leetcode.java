package Amazon;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {

    public static void main(String[] args) {

        new Leetcode().print2DArray(new int[][]{{1,2,3},{4,5,6},{7,8,9}, {10,11,12}});


    }

    //Problem 54 - Spiral Matrix'
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> output = new ArrayList();

        if(matrix==null || matrix.length==0)
            return output;

        int top, bottom, left, right;
        top = 0;
        bottom = matrix.length-1;
        left = 0;
        right = matrix[0].length-1;
        int size = matrix.length*matrix[0].length;

        while(output.size()<size){

            for(int i = left;i<=right && output.size()<size; i++){
                output.add(matrix[top][i]);
            }
            top++;

            for(int i = top;i<=bottom && output.size()<size; i++){
                output.add(matrix[i][right]);
            }
            right--;

            for(int i=right; i>=left && output.size()<size ; i--){
                output.add(matrix[bottom][i]);
            }
            bottom--;

            for(int i=bottom;i>=top && output.size()<size ;i--){
                output.add(matrix[i][left]);
            }
            left++;

        }

        return output;

    }










    // Base of all 2d questions
    //This is how you iterate over 2D Array
    public void print2DArray(int[][] matrix){

        System.out.println(matrix.length+" "+matrix[0].length);

        for(int row = 0; row<matrix.length; row++){
            for(int col = 0; col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }


    }



}
