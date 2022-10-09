package n03_Kereses_searching;

import java.util.Objects;

public class Pike{
    private String name;
    private int height;

    public Pike(String name, int height) {
        this.name = name;
        this.height = height;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pike pike = (Pike) o;
        return height == pike.height && Objects.equals(name, pike.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height);
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
