package myPackage;

import java.util.Scanner;

public class NomJoueurs {

	public static void main(String[] args) {
		//Demande du nom pour le joueur 1
		
		System.out.println("Nom du joueur 1 : ");
		
		Scanner nomJoueur1 = new Scanner(System.in);
		String nomEntr�1 = nomJoueur1.next();
		
		//Demande du nom pour le joueur 1
		
		System.out.println("Nom du joueur 2 : ");
		Scanner nomJoueur2 = new Scanner(System.in);
		String nomEntr�2 = nomJoueur2.next();
		
		System.out.println("Joueur 1 : " +  nomEntr�1);
		System.out.println("Joueur 2 : " +  nomEntr�2);
		
		
		//Demande de l'age pour le joueur 1
		
		System.out.println(nomEntr�1 + " tape ton age :");
		Scanner var = new Scanner (System.in);
		int a = var.nextInt();
		
		//Demande de l'age pour le joueur 1
		
		System.out.println(nomEntr�2 + " tape ton age :");
		Scanner var2 = new Scanner (System.in);
		int b = var2.nextInt();
		
		if ((a>= 18) && (b>= 18) ) {
			System.out.println("Welcome guys!!");
		}
		
		else {
			System.out.println("D�sol� interdit aux mineurs");
		}
	}	
}