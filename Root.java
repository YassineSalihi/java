package ma.pj.stock;

import java.util.Scanner;

// Practicing first, then doing the TP
// 

public class ExOne {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c;

		System.out.println("Entrer les coeff: ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		double r1, r2;
		r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a; //might add something later
		r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;

		System.out.println("Soultion 1 est: " + r1);
		System.out.println("Soultion 2 est: " + r2);

	}
}
