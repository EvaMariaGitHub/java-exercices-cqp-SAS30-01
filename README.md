# java-exercices-cqp-SAS30-01 - LifeStores

L’objectif est de créer l'application "LifeStores" qui permet de gérer des magasins. 

La classe Product

Un produit est caractérisé par son nom et son prix.

La classe Distributor

Un distributeur est caractérisé par une liste de produits et implémente ConvenienceStore. Elle possède:

une méthode sell(Product product)

	-en entrée, il y a un produit

        -si le produit est présent alors il s’enlève de la liste et renvoie true

        -sinon false

une méthode filled()

	-si le stock est au dessus ou égale du maximum alors true

	-sinon false

	-le maximum est de 5

La classe FamilyMart

Un FamilyMart est caractérisé par une liste de produits et un nombre d’employés. Elle implémente aussi ConvenienceStore et possède:

une méthode sell(Product product)

        -en entrée, il y a un produit

        -si le produit est présent alors il s’enlève de la liste et renvoie true

        -le magasin peut vendre si et seulement s’il y a au moins un employé

une méthode filled()

	-si le stock est au dessus ou égale du maximum alors true

	-sinon false

	-la maximum est de 2

Le fichier Products.csv

aquarius,1.5

coca,2

kitkat,3.7

pocky,4

evian,1

L'application LifeStores

1/écrivez la fonction qui permet de lire le fichier csv dans l'application LifeStores

2/remplir le distributeur avec les produits

3/le distributeur vend une bouteille aquarius, quel est le résultat? 

4/afficher si le distributeur est rempli

5/afficher le contenu du distributeur

6/remplir le family mart avec les mêmes produits et un employé

7/afficher si le magasin est rempli

8/le family mart vend un pocky, quel est le résultat ?

9/il est 23h, l’employé rentre chez lui. Le family mart vend un evian. Quel est le résultat ?

10/afficher le contenu du magasin
