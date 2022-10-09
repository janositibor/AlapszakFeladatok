package c07_BejarasCiklusokkal_looptypes;

public class Sum {
    public void printSums(int[] numbers){
        for (int i=1;i<numbers.length;i++){
            System.out.print(numbers[i-1]+numbers[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] numbersArray = {1, 2, 3, 4, 6};
        Sum sum=new Sum();
        sum.printSums(numbersArray);
    }
}
