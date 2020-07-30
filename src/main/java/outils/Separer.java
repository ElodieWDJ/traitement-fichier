/**
 * 
 */
package outils;

import java.util.Set;

import entites.produit.Ingredients;
import entites.produit.Produits;

/**
 * @author perse
 *
 */
public class Separer {

	/**
	 * Permet de séparer
	 */
	public static Produits Separateur (String chaine) {
		
		String[] chaines = chaine.split("\\");
			int id = 0;
			String categorie = chaines[0];
			String marque = chaines[1];
			String nom = chaines[2];
			String score = chaines[3];
			Set<Ingredients> ingredients = Recette.SepIng(chaines[4]);
			double energie = 
			
				
		

	}

}
