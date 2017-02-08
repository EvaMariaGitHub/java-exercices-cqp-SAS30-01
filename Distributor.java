package com.simplon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alonso on 07/02/17.
 */
public class Distributor implements ConvenienceStore  {
     private static int max = 5;
     private List<Product> products;

    public Distributor(){
        this.products = new ArrayList<>();
   }

    public void addProducts(List<Product> products){
        this.products.addAll(products);
    }

    @Override
    public Boolean sell(Product product){
        for(Product p : products) {
            if (p.getName().equals(product.getName())){
                return products.remove(p);
            }
        }
        return false;
    }

    @Override
    public Boolean filled(){
        return (products.size() >= max);
    }

    @Override
    public String toString() {
        String s = "Products in the distributor : \n";
        for(Product p : this.products) s+=p;
        return s;

    }
}
