package Dao;
import java.util.List;

import entites.produit.Categories;

/**
 * 
 */

/**
 * @author perse
 *
 */
public interface CategoriesDao {
	List<Categories>extraire();
	void insert(Categories categories) throws Exception;
	int update(String ancienNom, String nouveauNom) throws Exception;
	boolean delate (Categories categories);

}
