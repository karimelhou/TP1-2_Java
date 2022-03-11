package Exercices;

import java.util.Scanner;

public class Exercice4 {

	public static void main(String[] args) {
		int nombreEt , nombreEtSup=0;

		double[] notes;
		double sum=0, moy=0;
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Entrez le nombre des étudiants de la classe : ") ;
	    nombreEt= sc.nextInt();
	    notes = new double[nombreEt];
		
	    for (int i=0 ; i< nombreEt; i++) {
	    	System.out.print("Entrer la note de l'etudiant "+(i+1)+"\n");
	    	notes[i] = sc.nextDouble();
	    	sum+=notes[i];
	    	
	    }
	    moy=sum/nombreEt;
	    for (int i=0; i < nombreEt; i++) {
	    	if (notes[i] >= moy) {
	    		nombreEtSup++;
	    	}
	    }
		sc.close();
	    System.out.println("le nombre des etudiants qui ont une notes superieure à la moyenne est "+nombreEtSup);

	}

}
