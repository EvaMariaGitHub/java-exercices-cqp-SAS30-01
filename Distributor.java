package com.simplon;

/**
 * Created by alonso on 07/02/17.
 */
public class Distributor extends Store implements ConvenienceStore  {
     private static int max = 5;

    public Distributor(){
   }

    public Boolean filled(){
        return (products.size() >= max);
    }

    @Override
    public String toString() {
        String s = "Products in the distributor : \n" + super.toString();
        return s;
    }
}
