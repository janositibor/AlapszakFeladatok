package c01_TombokAlap_array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] hetNapjai = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
        System.out.println("A hét második napja: "+hetNapjai[1]);
        System.out.println("A tömb hossza: "+hetNapjai.length);

        int[] powerOfTwo = new int[5];
        int actualValue=1;
        for (int i = 0; i < powerOfTwo.length; i++){
            powerOfTwo[i]=actualValue;
            actualValue*=2;
        }
        System.out.println();
        System.out.println("The power of two:");
        for (int element: powerOfTwo){
            System.out.print(element+" ");
        }
        System.out.println();


        boolean[] logicalValues=new boolean[6];
        boolean logicalValue=false;
        for (int i = 0; i < logicalValues.length; i++){
            logicalValues[i]=logicalValue;
            logicalValue=!logicalValue;
        }
        System.out.println();
        System.out.println("The logical values:");
        for (boolean element: logicalValues){
            System.out.print(element+" ");
        }
    }
}
