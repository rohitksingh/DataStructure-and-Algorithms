package Microsoft;

public class MaxNumWith5 {

    public int maxNum(int num){

        boolean isNegative = (num<0) ? true : false;
        boolean positionFound = false;

        char[] charArray = (num+"").toCharArray();
        StringBuffer sb = new StringBuffer();

        for(char c: charArray){
            int value = Character.getNumericValue(c);


        }

    }

}
