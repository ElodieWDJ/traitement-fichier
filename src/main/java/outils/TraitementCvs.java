package outils;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;

import entites.produit.Produits;

/*
 * Classe permettant de lire le contenu d'un fichier csv
 * et retourne une instance de la classe Csv
 */
public class TraitementCvs {
	
	public static ArrayList<Produits>lire(){
		ArrayList<Produits> produits = new ArrayList<>();
		try {
			File file = new File("C:/Users/perse/OneDrive/Bureau/Formation Java Full Stack/Modélisation BDD et normalisation/openFoodFacts.csv");
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			lignes.remove(0);
			
			for(int i = 0; i<lignes.size();i++) {
				String ligne = lignes.get(i);
				//ligne = Nettoyage.Remplacer(lignes,i);
				//Produits.add(prod);
			}
			return produits;
		}catch (IOException e) {
			System.err.println(e.getMessage());
			return null;
		}
		
		
	}
	
	
	
	
}

