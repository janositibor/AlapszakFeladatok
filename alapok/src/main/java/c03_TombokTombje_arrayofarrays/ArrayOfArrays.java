package c03_TombokTombje_arrayofarrays;

public class ArrayOfArrays {
    public void printArrayOfArrays(int[][] a){
        for (int i = 0; i < a.length; i++) {
            int[] innerArray=a[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.print(innerArray[j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {{4,3,2,1}, {1, 2,3}, {1, 2}, {2, 4, 6}, {2, 4, 8, 16}};
        ArrayOfArrays arrayOfArrays=new ArrayOfArrays();
        arrayOfArrays.printArrayOfArrays(numbers);

    }
}
