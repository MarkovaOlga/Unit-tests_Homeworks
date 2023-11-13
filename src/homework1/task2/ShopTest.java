package homework1.task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import static org.assertj.core.api.Assertions.*;


public class ShopTest {

    /*
   1. Напишите тесты, чтобы проверить, что магазин хранит верный список продуктов (правильное количество продуктов, верное содержимое корзины).
   2. Напишите тесты для проверки корректности работы метода getMostExpensiveProduct.
   3. Напишите тесты для проверки корректности работы метода sortProductsByPrice (проверьте правильность сортировки).
   */
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setTitle("Milk");
        product1.setCost(80);

        Product product2 = new Product();
        product2.setTitle("Bread");
        product2.setCost(30);

        Product product3 = new Product();
        product3.setTitle("Chocolate");
        product3.setCost(100);

        List<Product> listOfProducts = new ArrayList<>();
        listOfProducts.add(product1);
        listOfProducts.add(product2);
        listOfProducts.add(product3);

        Shop shop = new Shop();
        shop.setProducts(listOfProducts);

        countOfProducts(shop);
        correctContentOfBasket(shop);
        getMostExpensiveProduct(shop);
        sortProductByPrice(shop);
    }

    public static void countOfProducts(Shop shop) {
        assertThat(shop.getProducts().size()).isEqualTo(3);
    }

    public static void correctContentOfBasket(Shop shop) {
        List<String> titlesOfProducts = new ArrayList<>();
        for (Product i : shop.getProducts()) {
            titlesOfProducts.add(i.getTitle());
        }
        assertThat(titlesOfProducts).contains("Milk", "Bread", "Chocolate");
    }

    public static void getMostExpensiveProduct(Shop shop) {
        assertThat(shop.getMostExpensiveProduct().getCost()).isEqualTo(100);
    }
    public static void sortProductByPrice(Shop shop) {
        List <Product> products = shop.getProducts();
        products.sort(Comparator.comparing(Product::getCost));
        List <Product> sortProducts = shop.sortProductsByPrice();
        assertThat(sortProducts).isEqualTo(products);
    }
}