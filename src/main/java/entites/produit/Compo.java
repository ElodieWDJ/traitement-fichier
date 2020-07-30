package entites.produit;

public class Compo {
	/**
	 * Compo représente la table de jointure avec son id unique et l'id_ing et
	 * l'id_pdt
	 */
	private Integer id;
	private Integer id_ing;
	private Integer id_pdt;

	/**
	 * @param id
	 * @param id_ing
	 * @param id_pdt
	 */
	public Compo(Integer id, Integer id_ing, Integer id_pdt) {

		this.id = id;
		this.id_ing = id_ing;
		this.id_pdt = id_pdt;
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
	 * @return the id_ing
	 */
	public Integer getId_ing() {
		return id_ing;
	}

	/**
	 * @param id_ing the id_ing to set
	 */
	public void setId_ing(Integer id_ing) {
		this.id_ing = id_ing;
	}

	/**
	 * @return the id_pdt
	 */
	public Integer getId_pdt() {
		return id_pdt;
	}

	/**
	 * @param id_pdt the id_pdt to set
	 */
	public void setId_pdt(Integer id_pdt) {
		this.id_pdt = id_pdt;
	}

}
