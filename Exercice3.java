package Exercices;
import java.util.Scanner;

public class Exercice3 {
	private int code;
	private String prenom;
	private String nom;
	private double solde;
	
	public Exercice3 (int codeCompte, String Prenom , String Nom, double soldeCompte) {
		code = codeCompte;
		prenom = Prenom;
		nom = Nom;
		solde = soldeCompte;
	}
	
	public void verser (double montantV) {
		this.solde+=montantV;
	}
	
	public void debiter(double montantD) {
		this.solde-=montantD;
	}
	public void display() {
		System.out.println("Mon Compte \nNuméro de compte est : "+this.code);  
        System.out.println("Nom : "+this.nom +"\nPrenom : "+this.prenom);  
        System.out.println("Mon Solde: "+this.solde); 
        System.out.print("\n\n");
	}

	public static void main(String[] args) {
		Exercice3 client1 = new Exercice3(24564654, "ElHoumaini" , "Karim", 100000);
		Exercice3 client2 = new Exercice3(94874660, "ElBakali" , "Wissal", 800000);
		
		client1.display();
		client2.display();
		client1.verser(6000);
		client2.debiter(3000);
		client1.display();
		client2.display();
		

	}

}
