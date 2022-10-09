package e08_RendomSzamTombTipusKonverzio_typeconversion;

public class Conversion {
    public double convertDoubleToDouble(double numberToConvert){
        int intNumber= (int) numberToConvert;
        return (double) intNumber;
    }
    public byte[] convertIntArrayToByteArray(int[] inputArray){
        byte[] output=new byte[inputArray.length];
        for(int i=0;i<inputArray.length;i++){
            int value=inputArray[i];
            if(0<=value && value<=127) {
                output[i] = (byte) value;
            }
            else{
                output[i] = -1;
            }
        }
        return output;
    }
    public int getFirstDecimal(double numberToConvert){
        double remainsValue=numberToConvert-(int) numberToConvert;
        return (int) (10*remainsValue);
    }
}
