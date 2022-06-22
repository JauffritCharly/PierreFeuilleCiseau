import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Jeu jeu = new Jeu();
		Choix utilisateurChoix = null;

		do {

			System.out.println("Saisir le chiffre correspondant : 0 - Ciseau, 1 - FEUILLE, 2 - PIERRE");
			int saisie = sc.nextInt();

			if (saisie == 0) {
				utilisateurChoix = Choix.CISEAU;
			}
			if (saisie == 1) {
				utilisateurChoix = Choix.FEUILLE;
			}
			if (saisie == 2) {
				utilisateurChoix = Choix.PIERRE;
			}

			Choix choixIA = jeu.choixOrdinateur();
			jeu.choix(utilisateurChoix, choixIA);

			System.out.println("Choix utilisateur : " + utilisateurChoix);
			System.out.println("Choix IA : " + choixIA);

			
			jeu.score();

			
			
		} while (jeu.getScoreOrdinateur() != 3  && jeu.getScoreUtilisateur() != 3);
		
		if (jeu.getScoreOrdinateur() == 3) {
			System.out.println("l'ordi a gagné !!!");
		}else System.out.println("J'ai gagné !!");
		
		
		sc.close();

	}

}
