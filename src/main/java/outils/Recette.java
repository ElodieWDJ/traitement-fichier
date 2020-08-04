/**
 * 
 */
package outils;

import java.util.HashSet;
import java.util.Set;

import entites.produit.Ingredients;

/** 
 *  méthode qui récupére les ingrédients d'un produit
 */
public abstract class Recette {
	public static Set<Ingredients> SepIng(String chaines) {

		String[] chaine = chaines.split("[\\-,;]");
		Set<Ingredients> listIng = new HashSet<Ingredients>(chaine.length);

		for (int i = 0; i < chaine.length; i++) {
			listIng.add(new Ingredients(i, chaine[i].trim()));
		}

		return listIng;
}
}
