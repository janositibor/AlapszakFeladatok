package c03_TombokTombje_arrayofarrays;

import java.util.Scanner;

public class Triangular {
    int[][] triangularMatrix(int size){
        int[] innerArray;
        int[][] triangleArray=new int[size][];
        for (int i = 0; i < size; i++) {
            innerArray= new int[i+1];
            for (int j = 0; j < innerArray.length; j++) {
                innerArray[j]=i;
            }
            triangleArray[i]=innerArray;
        }
        return triangleArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Triangular triangular=new Triangular();
        ArrayOfArrays arrayOfArrays=new ArrayOfArrays();

        System.out.println("Type in the number of rows in the triangular matrix:");
        int rowNumber=scanner.nextInt();

        int[][] triangularMatrix=triangular.triangularMatrix(rowNumber);
        arrayOfArrays.printArrayOfArrays(triangularMatrix);
    }
}
