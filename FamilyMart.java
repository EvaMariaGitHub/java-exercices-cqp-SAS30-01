package com.simplon;

/**
 * Created by alonso on 07/02/17.
 */
public class FamilyMart extends Store implements ConvenienceStore {
    private int nbEmploys;
    private static int max = 2;

    public FamilyMart(int nbEmploys) {
        this.nbEmploys = nbEmploys;
    }

    public Boolean sell(Product product){
        if (nbEmploys >= 1) {
            return super.sell(product);
        } else {
            return false;
        }
    }

    public void setNbEmploys (int nbEmploys) {
        this.nbEmploys = nbEmploys;
    }

    public Boolean filled(){
        return (products.size() >= max);

    }

    @Override
    public String toString() {
        String s = "Products in the FamilyMart : \n" + super.toString();
        s+= "nb employés present : "+this.nbEmploys;
        return s;
    }
}
