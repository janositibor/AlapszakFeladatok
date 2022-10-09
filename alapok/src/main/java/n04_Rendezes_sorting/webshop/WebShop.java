package n04_Rendezes_sorting.webshop;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class WebShop {
    List<Product> productsList=new ArrayList<>();

    public void addProducts(Product product){
        productsList.add(product);
    }

    public List<Product> getProductsOrderByName(){
        List<Product> orderedList=new ArrayList<>(productsList);
        orderedList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return orderedList;
    }
    public List<Product> getProductsOrderByPrice(){
        List<Product> orderedList=new ArrayList<>(productsList);
        orderedList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getPrice()-o2.getPrice();
            }
        });
        return orderedList;
    }
    public List<Product> getProductsOrderByDate(){
        List<Product> orderedList=new ArrayList<>(productsList);
        orderedList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getFrom().compareTo(o2.getFrom());
            }
        });
        return orderedList;
    }
}
