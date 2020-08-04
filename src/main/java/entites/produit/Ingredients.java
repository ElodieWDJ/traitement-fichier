/**
 * 
 */
package entites.produit;

/**
 * Ingrédients représente tous les attributs d'un produit
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
		super();
		this.id = id;
		this.nom = nom;
	}
	private Categorie 

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
