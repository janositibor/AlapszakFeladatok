package d07_KompozicioListaval_Computer_compositionlist;

import java.util.ArrayList;
import java.util.List;

public class Capsules {
    private List<String> capsuleList = new ArrayList<>();
    public void addFirst(String capsule){
        capsuleList.add(0,capsule);
    }
    public void addLast(String capsule){
        capsuleList.add(capsule);
    }
    public void removeFirst(){
        capsuleList.remove(0);
    }
    public void removeLast(){
        int numberOfElements=capsuleList.size();
        capsuleList.remove(numberOfElements-1);
    }
    List<String> getColors(){
        return capsuleList;
    }

    public static void main(String[] args) {
        Capsules capsules=new Capsules();
        capsules.addLast("vörös");
        capsules.addLast("narancs");
        capsules.addLast("sárga");
        capsules.addLast("zöld");
        capsules.addLast("kék");
        capsules.addLast("ibolya");
        System.out.println(capsules.getColors());
        capsules.addFirst("vörös");
        capsules.addFirst("narancs");
        capsules.addFirst("sárga");
        capsules.addFirst("zöld");
        capsules.addFirst("kék");
        capsules.addFirst("ibolya");
        System.out.println(capsules.getColors());
        capsules.removeFirst();
        capsules.removeFirst();
        System.out.println(capsules.getColors());
        capsules.removeLast();
        System.out.println(capsules.getColors());
        capsules.addFirst("rózsaszin");
        System.out.println(capsules.getColors());
    }
}
