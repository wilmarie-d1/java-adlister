//import java.util.ArrayList;
import java.util.List;

public class ListProductsDao implements Products{

private List<Product> products = generateProducts();

    private List<Product> generateProducts() {
        return null;
    }


    @Override
    public List<Product> allProducts() {
        return products;
    }

    @Override
    public void deleteProductById(long id) {
        for(Product product : products){
            if (product.getId() == id) {
                products.remove(product);
            }
        }
    }

    @Override
    public Product getProductById(long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
//        public List<Product> generateProducts () {
//            List<Product> products = new ArrayList<>();
//            Product duck = new Product();

        return null;
    }}
