package k03_exceptionmulticatch.converter;

public class BinaryStringConverter {
    public boolean[] binaryStringToBooleanArray(String stringToConvert){
        if(stringToConvert==null){
            throw new NullPointerException("Binary string is null.");
        }
        char[] charArray = stringToConvert.toCharArray();
        boolean[] output = new boolean[charArray.length];
        char c;

        for (int i=0; i<charArray.length; i++) {
            c=charArray[i];
            if(c!='0' && c!='1') {
                throw new IllegalArgumentException("Binary string is not valid.");
            }
            output[i]=(c=='1');
        }
        return output;
    }
    public String booleanArrayToBinaryString(boolean[] arrayToConvert){
        if(arrayToConvert==null){
            throw new NullPointerException("No input array was given to booleanArrayToBinaryString!");
        }
        StringBuilder tempStringBuilder=new StringBuilder();
        if(arrayToConvert.length==0){
            throw new IllegalArgumentException("Boolean array is empty.");
        }
        for(int i=0; i<arrayToConvert.length;i++){
            if(arrayToConvert[i]){
                tempStringBuilder.append("1");
            }
            else{
                tempStringBuilder.append("0");
            }
        }
        return tempStringBuilder.toString();
    }
}
