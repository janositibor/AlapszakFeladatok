package k03_exceptionmulticatch.converter;

public class AnswerStat {
    private BinaryStringConverter binaryStringConverter;

    public AnswerStat(BinaryStringConverter binaryStringConverter) {
        this.binaryStringConverter = binaryStringConverter;
    }

    public boolean[] convert(String stringToConvert){
        boolean[] output;
        try{
            output=binaryStringConverter.binaryStringToBooleanArray(stringToConvert);
        }
        catch(NullPointerException | IllegalArgumentException e){
            throw new InvalidBinaryStringException("InvalidBinaryStringException",e);
        }
        return output;
    }
    public int answerTruePercent(String answers){
        boolean[] booleanArray=convert(answers);
        int numberOfTrues=0;
        for(boolean answer:booleanArray){
            if(answer){
                numberOfTrues++;
            }
        }
        return (int) Math.round(100.0*numberOfTrues/booleanArray.length);
    }
}
