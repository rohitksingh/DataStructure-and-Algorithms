package Amazon;

public class P240Searchin2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int right = matrix[0].length-1;
        int top = 0;
        int bottom = matrix.length;

        boolean found = false;

        while(!found && top!=bottom && right>=0){
            if(target < matrix[top][right])
                right--;
            else if(target>matrix[top][right])
                top++;
            else
                return true;
        }

        return false;

    }

}
