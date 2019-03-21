import java.util.Scanner; 

public class Test { 

	public static void main (String [] args) { 

		char operateurs [] = {'+', '-', '/', '%', '*'}; 
		char calcul = '+'; 

		Scanner scan = new Scanner (System.in); 

		System.out.println ("Veuillez entrer un numéro s'il vous plaît"); 
		int numberNote = scan.nextInt (); 

		
		System.out.println ("Veuillez entrer un numéro s'il vous plaît"); 
		int numberNote2 = scan.nextInt (); 

		System.out.println ("Veuillez indiquez l'operateur a utiliser"); 
		char operateursS = scan.next () .charAt(0); 

		if (operateursS == operateurs [0]) { 
			System.out.println (numberNote + numberNote2); 
	} 
		else if (operateursS == operateurs [1]) { 
			System.out. println (numberNote-numberNote2); 
	}
		else if (operateursS == operateurs [2]) { 
			System.out.println (numberNote / numberNote2); 
	} 
		else if (operateursS == operateurs [3]) { 
			System.out.println (numberNote% numberNote2); 
		} 
		else if (operateursS == operateurs [4]) { 
			System.out.println (numberNote * numberNote2); 
		} 
	} 
}