package ma.pj.stock;

import java.util.Scanner;

// Practicing first, then doing the TP
// 

public class ExOne {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("entrer la base : ");
		float base = sc.nextFloat();
		// System.out.println("La base est: "+ base);

		System.out.println("entrer l'hauteur : ");
		float hauteur = sc.nextFloat();
		// System.out.println("L'hauteur est: "+ hauteur);

		float area = 0.5f * hauteur * base;
		System.out.println("La surface est: " + area);

	}
}
