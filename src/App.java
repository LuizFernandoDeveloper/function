import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import model.Product;
import util.UppercaseName;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        List<Product> productsList = new ArrayList<>();

        productsList.add(new Product("Tv", 900.00));
        productsList.add(new Product("Mouse", 50.00));
        productsList.add(new Product("Tablet", 350.00));
        productsList.add(new Product("Hd Case", 80.90));

        Function<Product, String> functionProduct = (x) -> (x.getName().toUpperCase());;

        List<String> listString = productsList.stream().map(functionProduct).collect(Collectors.toList());
        
        listString.forEach(x -> System.out.println(x));
        // OU
        //listString.forEach(System.out::println);
    }
}
