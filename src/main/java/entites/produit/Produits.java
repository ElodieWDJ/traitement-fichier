/**
 * 
 */
package entites.produit;

/**
 * Produits contient les produits possédant un id undique, un id_cat un nom, une
 * marquen un score et une catégorie
 *
 */
public class Produits {
	private Integer id;
	private Integer id_cat;
	private String nom;
	private String categorie;
	private String marque;

	/**
	 * @param id
	 * @param id_cat
	 * @param nom
	 * @param categorie
	 * @param marque
	 * @param score
	 */
	public Produits(Integer id, Integer id_cat, String nom, String categorie, String marque, char score) {

		this.id = id;
		this.id_cat = id_cat;
		this.nom = nom;
		this.categorie = categorie;
		this.marque = marque;
		this.score = score;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the id_cat
	 */
	public Integer getId_cat() {
		return id_cat;
	}

	/**
	 * @param id_cat the id_cat to set
	 */
	public void setId_cat(Integer id_cat) {
		this.id_cat = id_cat;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}

	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	/**
	 * @return the marque
	 */
	public String getMarque() {
		return marque;
	}

	/**
	 * @param marque the marque to set
	 */
	public void setMarque(String marque) {
		this.marque = marque;
	}

	/**
	 * @return the score
	 */
	public char getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(char score) {
		this.score = score;
	}

	private char score;

}
