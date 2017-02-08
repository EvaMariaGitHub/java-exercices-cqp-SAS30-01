package com.simplon;
/**
 * Created by alonso on 07/02/17.
 */
public class Product  {
    private String name;
    private float price;

    public Product(String name, float price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name + " : "+ price+" $\n";
    }
}
