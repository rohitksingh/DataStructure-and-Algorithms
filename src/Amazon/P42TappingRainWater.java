package Amazon;

public class P42TappingRainWater {

    public int trap(int[] height) {

        if(height.length==0)
            return 0;

        int[] left = getLeftMax(height);
        int[] right = getRightMax(height);

        int sum = 0;

        for(int i=0;i<height.length;i++){
            int min = min(left[i], right[i]);
            sum =sum + min-height[i];
        }

        return sum;

    }

    public int min(int a, int b){
        return (a<=b) ? a : b;
    }


    public int[] getLeftMax(int[] arr){

        int[] left = new int[arr.length];

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            left[i] = max;
        }

        return left;

    }

    public int[] getRightMax(int[] arr){

        int[] right = new int[arr.length];

        int max = arr[arr.length-1];

        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
            }
            right[i]=max;
        }

        return right;

    }
}
