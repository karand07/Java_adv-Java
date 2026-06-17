package modules;

public class ProductUtil {

    private Product[] prd;
    private int count;

    public ProductUtil() {
        prd = new Product[100];
        count = 0;
    }

    public void addProduct(Product prdt) {
        if (count < prd.length) {
            prd[count] = prdt;
            count++;
        } else {
            System.out.println("Product list is full.");
        }
    }

    public void showAllProduct() {
        if (count == 0) {
            System.out.println("No products available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            System.out.println(prd[i]);
        }
    }
}