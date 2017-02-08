package com.simplon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alonso on 07/02/17.
 */
public class FamilyMart implements ConvenienceStore {
    private static int max = 2;
    private int nbEmploys;
    private List<Product> products;

    public FamilyMart(int nbEmploys) {
        this.products = new ArrayList<>();
        this.nbEmploys = nbEmploys;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    @Override
    public Boolean sell(Product product) {
        if (nbEmploys >= 1) {
            for (Product p : products) {
                if (p.getName().equals(product.getName())) {
                    return products.remove(p);
                }
            }

        }
        return false;
    }

    public void setNbEmploys (int nbEmploys) {
        this.nbEmploys = nbEmploys;
    }

    @Override
    public Boolean filled(){
        return (products.size() >= max);
    }

    @Override
    public String toString() {
        String s = "Products in the FamilyMart : \n";
        for(Product p : this.products) s+=p;
        s+= "nb employés present : "+this.nbEmploys;
        return s;
    }
}
