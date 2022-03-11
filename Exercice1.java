package exercice1;

import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Entrer le prix hors taxes: ");
		double priceHT = scan.nextDouble();
		scan.close();
		double priceTTC = priceHT*(1.186);
		double priceTT = 0;
		if (priceHT <= 1000) {
			priceTT = priceTTC;
		} else if (priceHT >= 1000 && priceHT < 2000) {
			priceTT = priceTTC*0.99;
		} else if (priceHT >= 2000 && priceHT < 5000) {
			priceTT = (priceTTC*0.97);
		} else if (priceHT >= 5000) {
			priceTT = priceTTC*0.95;
		} else System.out.print("Entrer un prix convenable ");
		
		System.out.printf("le prix totales est: " +priceTT+" MAD");
		
		
	}


}
