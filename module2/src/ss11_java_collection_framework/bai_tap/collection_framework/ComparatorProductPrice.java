package ss11_java_collection_framework.bai_tap.collection_framework;

import java.util.Comparator;

public class ComparatorProductPrice implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getPrice() - o1.getPrice();
    }
}
