/**
 * 
 */
package entites.produit;

/**
 * Ingrédients représente un ingrédient avec son id unique et son nom
 *
 */
public class Ingredients {
	private Integer id;
	private String nom;

	/**
	 * @param id
	 * @param nom
	 */
	public Ingredients(Integer id, String nom) {

		this.id = id;
		this.nom = nom;
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

}
