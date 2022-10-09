package i11_inheritanceconstructor.tea;

public class TeaMain {
    public static void main(String[] args) {
        Tea tea=new Tea("Lipton Yellow",160);
        HerbalTea herbalTea=new HerbalTea("Kamilla",310);

        System.out.println(tea.getName()+": "+tea.getPrice()+" Ft");
        System.out.println(herbalTea.getName()+": "+herbalTea.getPrice()+" Ft");
    }
}
