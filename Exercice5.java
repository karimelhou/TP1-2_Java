package Exercices;

import java.util.Scanner;

public class Exercice5 {

	public static void main(String[] args) {
		double[] myArr;
		double max=0;
		int size=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer la taille du tableau ");
		size = sc.nextInt();
		
		myArr = new double[size];
		for (int i=0;i<size;i++) {
			myArr[i] = sc.nextDouble();
			if (max < myArr[i]) {
				max = myArr[i];
			}
		}
		
		
		System.out.print("max is "+max);

	}

}
