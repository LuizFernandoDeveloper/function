package util;

import java.util.function.Function;

import model.Product;

public class UppercaseName implements Function<Product, String> {

    @Override
    public String apply(Product t) {
        return t.getName().toUpperCase();
    }
    
}
