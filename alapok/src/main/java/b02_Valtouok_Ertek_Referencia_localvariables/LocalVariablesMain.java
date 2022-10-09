package b02_Valtouok_Ertek_Referencia_localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {
        boolean b;
        //értékadás hiányában nem lehet kiiratni, ezért kikommentáltam a köv. sort.
        //System.out.println("Value of b is: "+b);
        b=true;
        System.out.println("Value of b is: "+b);

        int a=2;
        System.out.println("Value of a is: "+a);
        int a2=a;
        System.out.println("Value of a2 is: "+a2);
        a2=33;
        System.out.println("Value of a is: "+a);
        System.out.println("Value of a2 is: "+a2);
        System.out.println();

        int i=3;
        int j=4;
        int k=i;
        System.out.println("Value of i is: "+i);
        System.out.println("Value of j is: "+j);
        System.out.println("Value of k is: "+k);
        System.out.println();

        //definiálás elött nem lehet kiiratni, ezért kikommentáltam a köv. sort.
        //System.out.println("Value of undefinedVariable is: "+undefinedVariable);
        int undefinedVariable=1;

        String s;
        s="Hello World";
        System.out.println("Value of s is: "+s);
        String t;
        t=s;
        System.out.println("Value of t is: "+t);
        t="Lo World";
        System.out.println("Value of s is: "+s);
        System.out.println("Value of t is: "+t);
        System.out.println();

        {
            int x=0;
            System.out.println("Value of x is: "+x);

            System.out.println("Value of a is: "+a);
            System.out.println();
        }
        //Blokkban definiált változó nem látszik a blokkon kívül - nem lehet kiiratni, ezért kikommentáltam a köv. sort.
        //System.out.println("Value of x is: "+x);
    }
}