package myPackage;

import java.util.Scanner;

public class ProjetPerso4 {
	
	
	public static int nbreCartes = 52;


	public static void main(String[] args) throws InterruptedException {
		
		
		
		//On demande aux joueurs d'entrer leur nom
		
		System.out.println("Nom du joueur 1 : ");
		
		Scanner nomJoueur = new Scanner(System.in);
		String nomEntré = nomJoueur.next();
		
		System.out.println("Nom du joueur 2 : ");
		Scanner nomJoueur2 = new Scanner(System.in);
		String nomEntré2 = nomJoueur.next();
		
		
		// Liste des nombres et des couleurs des cartes
		
		String nombre [] =  {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi"}; 
		String couleur [] = {" de coeur", " de carreau", " de pique", " de trèfle"};
		
		//joueur 1 --> 4 cartes - random d'un nombre et d'une couleur
		
		int nbreAleatoire = (int) (Math.random() * nombre.length);
		int nbreAleatoire2 = (int) (Math.random() *couleur.length);
		
		String carte1 = (nombre[nbreAleatoire] + couleur[nbreAleatoire2]);
		
		
		int nbreAleatoire3 = ((int) (Math.random() * nombre.length));
		int nbreAleatoire4 = (int) (Math.random() * couleur.length);
		
		String carte2 = (nombre[nbreAleatoire3]+ couleur[nbreAleatoire4]);
		
		int nbreAleatoire5 = ((int) (Math.random() * nombre.length));
		int nbreAleatoire6 = (int) (Math.random() * couleur.length);
		
		String carte3 = (nombre[nbreAleatoire5] + couleur[nbreAleatoire6]); 
		
		int nbreAleatoire7 = ((int) (Math.random() * nombre.length));
		int nbreAleatoire8 = (int) (Math.random() * couleur.length);
		
		String carte4 = (nombre[nbreAleatoire7] + couleur[nbreAleatoire8]);
		
		
		//joueur 2 --> 4 cartes
		
		int nbreAleatoire9 = (int) (Math.random() * nombre.length);
		int nbreAleatoire10 = (int) (Math.random() *couleur.length);
		
		String carte5 = (nombre[nbreAleatoire9] + couleur[nbreAleatoire10]);
				
		int nbreAleatoire11 = ((int) (Math.random() * nombre.length));
		int nbreAleatoire12 = (int) (Math.random() * couleur.length);
		
		String carte6 = (nombre[nbreAleatoire11] + couleur[nbreAleatoire12]);
				
		int nbreAleatoire13 = ((int) (Math.random() * nombre.length));
		int nbreAleatoire14 = (int) (Math.random() * couleur.length);
		
		String carte7 = (nombre[nbreAleatoire13] + couleur[nbreAleatoire14]);
				
		int nbreAleatoire15 = ((int) (Math.random() * nombre.length));
		int nbreAleatoire16 = (int) (Math.random() * couleur.length);
		
		String carte8 = (nombre[nbreAleatoire15] + couleur[nbreAleatoire16]);
		
		
		
		//if(carte1.equals(carte2) || carte1.equals(carte3) || carte1.equals(carte4) || carte2.equals(carte3) || carte2.equals(carte4) || carte3.equals(carte4))  {}
		Thread.sleep(2000);
		System.out.println(nomEntré +  " : " + carte1 + ", " + carte2  + ", " + carte3  + ", " + carte4 + ".");
			nbreCartes = nbreCartes - 4;
		
		Thread.sleep(2000);
		System.out.println(nomEntré2 + " : " + carte5 + ", " + carte6  + ", " + carte7  + ", " + carte8 + ".");
			nbreCartes = nbreCartes - 4;
			
		Thread.sleep(2000);
		System.out.println("Il reste " + nbreCartes + " cartes dans le jeu");
	}
		
	}