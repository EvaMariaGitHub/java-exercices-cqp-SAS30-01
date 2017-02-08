package com.simplon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by alonso on 07/02/17.
 */
public class LifeStores {

    private static void extractProd(String source, List<Product> products) {
        try {
            String line ;
            String name;
            float price;
            BufferedReader fichier = new BufferedReader(new FileReader(source));
            while ((line = fichier.readLine()) != null) {
                name =  line.substring(0,line.indexOf(","));
                price = Float.parseFloat(line.substring(line.indexOf(",")+1,line.length()));
                products.add(new Product(name, price));
            }
            fichier.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        List<Product> products = new ArrayList<>();
        // Extraction des produits
        extractProd("./src/com/simplon/Products.csv", products);
       //2/remplir le distributeur avec les produits
        Distributor distributor = new Distributor();
        distributor.addProducts(products);
        System.out.println(distributor);
        //3/le distributeur vend une bouteille aquarius, quel est le résultat?
        System.out.println("vente d'aquarius validé ? : "+distributor.sell(new Product("aquarius")));
        System.out.println("vente de toto validé ? : "+distributor.sell(new Product("toto"))); //test achat produit qui n'existe pas
         //4/afficher si le distributeur est rempli
        System.out.println("Le distributeur est rempli ? : "+distributor.filled());
        //affichage distributeur
        System.out.println(distributor);
        //6/remplir le family mart avec les mêmes produits et un employé
        FamilyMart familyMart = new FamilyMart(1);
        familyMart.addProducts(products);
         //7/afficher si le magasin est rempli
        System.out.println("Le familyMart est rempli ? : "+familyMart.filled());
        //8/le family mart vend un pocky, quel est le résultat ?
        System.out.println("vente de pocky validé ? : "+familyMart.sell(new Product("pocky")));
        //9/il est 23h, l’employé rentre chez lui. Le family mart vend un evian. Quel est le résultat ?
        familyMart.setNbEmploys(0);
        System.out.println("vente d'evian validé ? : "+familyMart.sell(new Product("evian")));
        //10/afficher le contenu du magasin
        System.out.println(familyMart);
    }
}
