package exercice2;

public class Exercice2 {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		
		for (int i=1 ; i<=10 ; i++) {
			sum1+=i;
		}
		System.out.println("la somme avec la boucle for est : " +sum1);
		
		int i=1 ;
		while (i<=10) {
			sum2+=i;
			i++;
		}
		System.out.println("la somme avec la boucle While est : " +sum2);
		
		i=1 ;
		do {
			sum3+=i;
			i++;
		} while (i<11);
		System.out.println("la somme avec la boucle dO While est : " +sum3);
	}

}
