package c02_parancssor_cmdarguments.operation;

public class Operation {
    public static void parameterToAction(String parameter){
        switch(parameter) {
            case "/list":
                System.out.println("Listázás");
                break;
            case "/add":
                System.out.println("Hozzáadás");
                break;
            case "/delete":
                System.out.println("Törlés");
                break;
            default:
                System.out.println("Ismeretlen művelet");
            }
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            parameterToAction(args[i]);
        }

    }
}
