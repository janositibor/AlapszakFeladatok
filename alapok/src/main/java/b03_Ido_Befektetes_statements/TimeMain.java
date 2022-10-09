package b03_Ido_Befektetes_statements;

public class TimeMain {
    public static void main(String[] args) {
        Time time1=new Time("Első időpont");
        Time time2=new Time("Második időpont");
        System.out.println();
        /*
        System.out.println(time1.toString()+" = "+time1.getInMinutes()+" perc"+" = "+time1.getInSeconds()+" másodperc");
        System.out.println(time2.toString()+" = "+time2.getInMinutes()+" perc"+" = "+time2.getInSeconds()+" másodperc");
        */
        System.out.println(time1.toString()+" = "+time1.getInMinutes()+" perc");
        System.out.println(time2.toString()+" = "+time2.getInSeconds()+" másodperc");
        /*
        if(time1.earlierThan(time2)){
            System.out.println("\""+time1.getName()+"\" korábbi, mint a \""+time2.getName()+"\"");
        }
        else if(time2.earlierThan(time1)){
            System.out.println("\""+time2.getName()+"\" korábbi, mint a \""+time1.getName()+"\"");
        }
        else{
            System.out.println("\""+time1.getName()+"\" ugyanaz, mint a \""+time2.getName()+"\"");
        }
        */
        System.out.println("Az első korábbi, mint a második: "+time1.earlierThan(time2));
    }
}
