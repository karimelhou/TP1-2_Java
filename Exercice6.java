package Exercices;

public class Exercice6 {

	public static void main(String[] args) {
		Point matr[][];
		matr = new Point[2][3];
		
		Point obj1= new Point(2,3);
		Point obj2= new Point(4,3);
		Point obj3= new Point(8,9);
		Point obj4= new Point(6,8);
		Point obj5= new Point(1,4);
		
		for (int i=0; i<matr.length; i++) {
			for (int j=0; j<matr.length;j++) {
				matr[i][j] = obj1;
			}
		}
		

	}

}
