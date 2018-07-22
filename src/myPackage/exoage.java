package myPackage;

import java.util.Scanner;

public class exoage {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		
		System.out.println("Tape ton age ");
		
		Scanner var = new Scanner (System.in);
		int a = var.nextInt();
		
		System.out.println("Tu as " + a + " ans");
		
		if (a >= 18) {
			System.out.println("Bienvenue !!!");
		}
		else {
			System.out.println("Désolé tu es mineur");
		}
		
	
}
}
		



