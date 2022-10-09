package c03_TombokTombje_arrayofarrays;

import java.util.Scanner;

public class Rectangle {
    int[][] rectangularMatrix(int size){
        int[] innerArray;
        int[][] rectangularArray=new int[size][size];
        for (int i = 0; i < size; i++) {
            innerArray= new int[size];
            for (int j = 0; j < size; j++) {
                innerArray[j]=i;
            }
            rectangularArray[i]=innerArray;
        }
        return rectangularArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Rectangle rectangle=new Rectangle();
        ArrayOfArrays arrayOfArrays=new ArrayOfArrays();

        System.out.println("Type in the number of rows in the rectangle matrix:");
        int rowNumber=scanner.nextInt();

        int[][] rectangleMatrix=rectangle.rectangularMatrix(rowNumber);
        arrayOfArrays.printArrayOfArrays(rectangleMatrix);
    }
}
