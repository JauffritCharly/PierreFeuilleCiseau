import java.util.Random;

public class Jeu {

	private int scoreUtilisateur = 0;
	private int scoreOrdinateur = 0;
	
	
	
	public int getScoreUtilisateur() {
		return scoreUtilisateur;
	}

	public int getScoreOrdinateur() {
		return scoreOrdinateur;
	}
	

	public void choix(Choix choixUtilisateur, Choix choixOrdinateur) {

		
		
		if (choixUtilisateur.equals(choixOrdinateur)) {

		}

		if (choixUtilisateur == choixUtilisateur.CISEAU) {
			if (choixOrdinateur == choixOrdinateur.PIERRE) {

				this.scoreOrdinateur++;
			}
		}

		if (choixUtilisateur == choixUtilisateur.CISEAU) {
			if (choixOrdinateur == choixOrdinateur.FEUILLE) {

				this.scoreUtilisateur++;
			}
		}

		if (choixUtilisateur == choixUtilisateur.PIERRE) {
			if (choixOrdinateur == choixOrdinateur.FEUILLE) {

				this.scoreOrdinateur++;
			}
		}
		if (choixUtilisateur == choixUtilisateur.PIERRE) {
			if (choixOrdinateur == choixOrdinateur.CISEAU) {

				this.scoreUtilisateur++;
			}
		}

		if (choixUtilisateur == choixOrdinateur.FEUILLE) {
			if (choixOrdinateur == choixOrdinateur.CISEAU) {

				this.scoreOrdinateur++;
			}
		}

		if (choixUtilisateur == choixUtilisateur.FEUILLE) {
			if (choixOrdinateur == choixOrdinateur.PIERRE) {

				this.scoreUtilisateur++;
			}
		}

	}

	public Choix choixOrdinateur() {

		Random random = new Random();
		int nb;
		nb = random.nextInt(3);
		Choix choixOrdinateur = null;
		
		if (nb == 0) {
			choixOrdinateur = Choix.CISEAU;
		}
		if (nb == 1) {
			choixOrdinateur = Choix.FEUILLE;
		}
		if (nb == 2) {
			choixOrdinateur = Choix.PIERRE;
		}
	
		return choixOrdinateur;
		
	}
	
	public void score() {
		
		System.out.println("Score ordinateur = " + this.scoreOrdinateur + " Score utilisateur = " + this.scoreUtilisateur);
		
		
	}
	

}
