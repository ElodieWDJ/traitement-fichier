/**
 * 
 */
package entites.produit;

/**
 * ScoreNutritionnel représente un score nutritionnel de type Char classé de A à
 * F
 *
 */
public class ScoreNutritionnel {
	char A;
	char B;
	char C;
	char D;
	char E;
	char F;

	/**
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 * @param e
	 * @param f
	 */
	public ScoreNutritionnel(char a, char b, char c, char d, char e, char f) {

		A = a;
		B = b;
		C = c;
		D = d;
		E = e;
		F = f;
	}

	/**
	 * @return the a
	 */
	public char getA() {
		return A;
	}

	/**
	 * @param a the a to set
	 */
	public void setA(char a) {
		A = a;
	}

	/**
	 * @return the b
	 */
	public char getB() {
		return B;
	}

	/**
	 * @param b the b to set
	 */
	public void setB(char b) {
		B = b;
	}

	/**
	 * @return the c
	 */
	public char getC() {
		return C;
	}

	/**
	 * @param c the c to set
	 */
	public void setC(char c) {
		C = c;
	}

	/**
	 * @return the d
	 */
	public char getD() {
		return D;
	}

	/**
	 * @param d the d to set
	 */
	public void setD(char d) {
		D = d;
	}

	/**
	 * @return the e
	 */
	public char getE() {
		return E;
	}

	/**
	 * @param e the e to set
	 */
	public void setE(char e) {
		E = e;
	}

	/**
	 * @return the f
	 */
	public char getF() {
		return F;
	}

	/**
	 * @param f the f to set
	 */
	public void setF(char f) {
		F = f;
	}

}
