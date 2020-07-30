/**
 * 
 */
package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import entites.produit.Categories;


/**
 * @author perse
 *
 */
public class CategoriesDaoJdbc implements CategoriesDao {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		CategoriesDaoJdbc ofo = new CategoriesDaoJdbc();
//		List<Categories> listeCat = ofo.extraire();
//		System.out.println(listeCat.size());
//		for (Categories fo : listeCat) {
//			System.out.println(fo);
		}

	//}

	@Override
	public List<Categories> extraire() {
		Connection connection = null;
		List<Categories> listeCat = new ArrayList<Categories> ();
		try {
			connection = this.getConnection();
			Statement monCanal = connection.createStatement();
			ResultSet monResultat = monCanal.executeQuery("SELECT * FROM categories;");
			while(monResultat.next()) {
				listeCat.add(new Categories(monResultat.getInt("id_Categories"),monResultat.getString("nom")));
			}
			
			monResultat.close();
			monCanal.close();
		}
		catch(Exception e) {
			System.err.println("Erreur d'execution : " + e.getMessage());
			
		}
		finally {
			try {
				if(connection != null) connection.close();
			}
			catch(SQLException e) {
				System.err.println("Problème de connexion close : " + e.getMessage());
			}
			
		}
		
		return listeCat;
	}

	private Connection getConnection() {
		// recupere le fichier properties
				ResourceBundle db = ResourceBundle.getBundle("database");

				try {
					// enregistre le pilote
					Class.forName(db.getString("db.driver"));

					return DriverManager.getConnection(db.getString("db.url"), db.getString("db.user"),
							db.getString("db.pass"));
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
					throw new RuntimeException();
				}
	}

	@Override
	public void insert(Categories categories) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int update(String ancienNom, String nouveauNom) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delate(Categories categories) {
		// TODO Auto-generated method stub
		return false;
	}

}
