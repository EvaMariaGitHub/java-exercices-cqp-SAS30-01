package com.simplon;

/**
 * Created by alonso on 07/02/17.
 */

import java.util.ArrayList;
import java.util.List;

public abstract class Store {

    protected List<Product> products = new ArrayList<>();

    public void addProducts(List<Product> products){
        this.products.addAll(products);
    }

    public Product findProduct(String name){
        for(Product p : products) {
            if (p.getName().equals(name)){
                return p;
            }
        }
        return null;
    }

    public Boolean sell(Product product){
        return products.remove(product);
    }

    @Override
    public String toString() {
        String s = "";
        for(Product p : this.products) s+=p;
        return s;
    }

    public abstract Boolean filled();
}
