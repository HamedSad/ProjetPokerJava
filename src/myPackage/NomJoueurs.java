package myPackage;

import java.util.Scanner;

public class NomJoueurs {

	public static void main(String[] args) {
		//Demande du nom pour le joueur 1
		
		System.out.println("Nom du joueur 1 : ");
		
		Scanner nomJoueur1 = new Scanner(System.in);
		String nomEntré1 = nomJoueur1.next();
		
		//Demande du nom pour le joueur 1
		
		System.out.println("Nom du joueur 2 : ");
		Scanner nomJoueur2 = new Scanner(System.in);
		String nomEntré2 = nomJoueur2.next();
		
		System.out.println("Joueur 1 : " +  nomEntré1);
		System.out.println("Joueur 2 : " +  nomEntré2);
		
		
		//Demande de l'age pour le joueur 1
		
		System.out.println(nomEntré1 + " tape ton age :");
		Scanner var = new Scanner (System.in);
		int a = var.nextInt();
		
		//Demande de l'age pour le joueur 1
		
		System.out.println(nomEntré2 + " tape ton age :");
		Scanner var2 = new Scanner (System.in);
		int b = var2.nextInt();
		
		if ((a>= 18) && (b>= 18) ) {
			System.out.println("Welcome guys!!");
		}
		
		else {
			System.out.println("Désolé interdit aux mineurs");
		}
	}	
}