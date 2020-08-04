/**
 * 
 */
package outils;

import java.util.Set;

import entites.produit.Composition;
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
			String scoreNutritionnel = chaines[3];
			Set<Composition> ingredients = (Set<Composition>) Recette.SepIng(chaines[4]);
			double energie100g = Composition.extraire(chaines,5);
			double graisse100g = Composition.extraire(chaines,6);
			double sucre100g = Composition.extraire(chaines,7);
			double fibre100g = Composition.extraire(chaines,8);
			double proteine100g = Composition.extraire(chaines,9);
			double sel100g = Composition.extraire(chaines,10);
			double vitA100g = Composition.extraire(chaines,11);
			double vitD100g = Composition.extraire(chaines,12);
			double vitE100g = Composition.extraire(chaines,13);
			double vitK100g = Composition.extraire(chaines,14);
			double vitC100g = Composition.extraire(chaines,15);
			double fibres100g = Composition.extraire(chaines,16);
			double proteines100g = Composition.extraire(chaines,17);
			double vitB1100g = Composition.extraire(chaines,18);
			double vitB2100g = Composition.extraire(chaines,19);
			double vitPP100g = Composition.extraire(chaines,20);
			double vitB6100g = Composition.extraire(chaines,21);
			double vitB9100g = Composition.extraire(chaines,22);
			double vitB12100g = Composition.extraire(chaines,23);
			double calcium100g = Composition.extraire(chaines,24);
			double magnesium100g = Composition.extraire(chaines,25);
			double iron100g = Composition.extraire(chaines,26);
			double fer100g = Composition.extraire(chaines,27);
			double betaCarotene100g = Composition.extraire(chaines,28);
			double presenceHuilePalme = Composition.extraire(chaines,29);
			
			Double additifs = chaines.length>=36? Composition.extraire(chaines,30):null;
			Double allergenes = chaines.length>=37? Composition.extraire(chaines,31):null;
	}

}
