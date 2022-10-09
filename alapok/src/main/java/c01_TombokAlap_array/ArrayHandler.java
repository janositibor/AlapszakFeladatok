package c01_TombokAlap_array;

public class ArrayHandler {
    public static void addIndexToNumber(int[] source){
        for (int i = 0; i < source.length; i++){
            source[i]=source[i]+i;
        }
    }
    public static void concatenateIndexToWord(String[] source) {
        for (int i = 0; i < source.length; i++) {
            source[i] = i+"-"+source[i];
        }
    }

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 6};
        String[] fruits = {"apple", "peach", "plum", "orange"};

        System.out.println("The initial array of numbers:");
        for (int element: numbersArray){
            System.out.print(element+", ");
        }
        System.out.println();

        System.out.println();
        System.out.println("The initial array of strings:");
        for (String element: fruits){
            System.out.print(element+", ");
        }
        System.out.println();

        addIndexToNumber(numbersArray);
        concatenateIndexToWord(fruits);

        System.out.println();
        System.out.println("The new array of numbers:");
        for (int element: numbersArray){
            System.out.print(element+", ");
        }
        System.out.println();
        for (int element: numbersArray){
            System.out.println(element);
        }

        System.out.println();
        System.out.println("The new array of strings:");
        for (String element: fruits){
            System.out.print(element+", ");
        }
        System.out.println();
        for (String element: fruits){
            System.out.println(element);
        }

    }

}
