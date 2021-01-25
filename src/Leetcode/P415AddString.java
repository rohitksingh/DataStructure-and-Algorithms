package Leetcode;

public class P415AddString {

    //num1+num2 will nt work for big numbers
    public String addStrings(String num1, String num2) {

        char[] charArray1 = num1.toCharArray();
        char[] charArray2 = num2.toCharArray();

        int size1 = charArray1.length-1;
        int size2 = charArray2.length-1;



        int rem=0;
        StringBuffer sb = new StringBuffer();

        while(size1>=0 && size2>=0){

            int val = toInt(charArray1[size1--])+toInt(charArray2[size2--])+rem;
            rem = val/10;
            val = (val<9) ? val : val%10;
            sb.insert(0,val);

        }

        while(size1>=0){
            int val = toInt(charArray1[size1--])+rem;
            rem = val/10;
            val = (val<9) ? val : val%10;
            sb.insert(0,val);
        }

        while(size2>=0){
            int val = toInt(charArray2[size2--])+rem;
            rem = val/10;
            val = (val<9) ? val : val%10;
            sb.insert(0,val);
        }

        if(rem==1)
            sb.insert(0,1);


        return sb.toString();


    }

    public int toInt(char c){
        return Character.getNumericValue(c);
    }

}
