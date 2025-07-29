package CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem {

    private List<CartItem> productList = new ArrayList<>();
    private String bundleName;

    public ProductBundle(String bundleName) {
        this.bundleName = bundleName;
    }

    public void addItems(CartItem cartItem) {
        this.productList.add(cartItem);
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "Bundle: " + bundleName);
        for (CartItem item : productList) {
            item.display(indent + "  ");
        }
    }

    @Override
    public double getPrice() {
        double total = 0;
        for(CartItem prod : this.productList) {
           total += prod.getPrice();
        }
        return total;
    }
}
