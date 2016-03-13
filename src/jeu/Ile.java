package Jeu;

import java.util.Random;
/**
 * Class Ile
 * @author teamJ3
 * Projet
 */

public class Ile {
	/**
	 * attribut
	 */

	private Parcelle [][] plateau;
	Random r = new Random();
	
	/**
	 * Constructeur de plateau
	 */
	Ile () {
		this.plateau = new Parcelle [10][10];
	}
	
	/**
	 * Constructeur de plateau avec selection de taille
	 * @param int taille
	 */
	Ile (int taille) {
		this.plateau = new Parcelle [taille][taille];
	}
	
	/**
	 * Methode d'initialisation de tableau
	 */
	public void initialiser () {
		for (int i=0; i<plateau.length; i++) {
			for (int j=0; j<plateau.length; j++) {
@@ -47,17 +32,14 @@ public class Ile {
		plateau[1][1].type = 2;
		plateau[plateau.length -2][plateau.length -2].type = 5;
		// COFFRE
		int x =r.nextInt(plateau.length -2);
		int y =r.nextInt(plateau.length -2);
		if(plateau[x][y].type == -1) {
			plateau[x][y].type = 7;
		}
		int x, y;
		do {
			x=r.nextInt(plateau.length -3)+1;
			y =r.nextInt(plateau.length -3)+1;
		} while(plateau[x][y].type != -1);
		plateau[x][y].type = 7;
		
	}
	
	/**
	 * Methode d'affichage toString
	 */
	public String toString() {
		int nombre = plateau.length;
		String res = "";
		return res;
	}
}