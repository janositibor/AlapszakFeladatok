package i13_Ososztaly_objectclass.bag;

import java.util.Objects;

public class Beer {
    private String name;
    private int price;

    public Beer(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        System.out.println(o.getClass().getName());
        Beer beer = (Beer) o;
        //return price == o.price && Objects.equals(name, o.name);
        return price == beer.price && Objects.equals(name, beer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
