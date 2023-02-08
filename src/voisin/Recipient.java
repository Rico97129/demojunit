package voisin;

import java.util.function.BooleanSupplier;

public class Recipient {
	
	private int espaceLibre, quantite;
	
	/**
	 * Initialise un rÃ©cipient de quantitÃ© quantite et de capacitÃ© capacite.
	 * <br>Requiert quantite >= 0; quantite &lt;= capacite; 
	 * @param quantite quantitÃ©. Doit Ãªtre >= 0
	 * @param capacite capacitÃ©. Doit Ãªtre >= quantite
	 */
	public Recipient(int quantite, int capacite) {
		this.espaceLibre = capacite - quantite;
		this.quantite = quantite;
	}
	
	/**
	 * Nombre d'Ã©lÃ©ments dans le rÃ©cipient.
	 * <br>est >= 0; est &lt;< getCapacite()
	 * @return
	 */
	public int getQuantite() {
		return quantite;
	}

	/**
	 * Nombre maximal d'Ã©lÃ©ments que peut contenir le rÃ©cipient
	 * <br>est >= getQuantite()
	 * @return
	 */
	public int getCapacite() {
		return quantite + espaceLibre;
	}

	/**
	 * Nombre d'emplacements pas occupÃ©s dans le rÃ©cipient
	 * (capacitÃ© - quantitÃ©)
	 * @return
	 */
	public int getEspaceLibre() {
		return espaceLibre;
	}
	
	
	public boolean isPlein() {
		return espaceLibre == 0;
	}

	public boolean isVide() {
		return quantite == 0;
	}

	/**
	 * DÃ©place un Ã©lÃ©ment du rÃ©cipient dans autre.
	 * <br>Requiert !isVide(); !autre.isPlein()
	 * <br>Garantit getQuantite() == old getQuantite() -1;
	 * autre.getQuantite() == old autre.getQuantite() + 1
	 * @param autre rÃ©cipient cible
	 */
	public void mettreUnDans(Recipient autre) {
		quantite--;
		autre.quantite++;
		espaceLibre++;
		autre.espaceLibre--;
	}

	/** Remplit autre.
	 * <br>Requiert getQuantite() >= autre.getEspaceLibre()
	 * <br>Garantit autre.isPlein(); 
	 * getQuantite() == old getQuantite() - old autre.getEspaceLibre(); 
	 * @param autre
	 */
	public void remplir(Recipient autre) {
		//throw new UnsupportedOperationException("not yet implemented");
		quantite--;
		autre.quantite++;
		espaceLibre++;
		autre.espaceLibre--;
		
	}

	/**
	 * Vider dans autre
	 * <br>Requiert getQuantite() &lt;= autre.getEspaceLibre()
	 * <br>Garantit isVide();
	 * autre.getQuantite() == old autre.getQuantite() + old espaceLibre()
	 * @param autre
	 */
	public void viderDans(Recipient autre) {
		autre.espaceLibre -= quantite;
		autre.quantite += quantite;
		espaceLibre += quantite;
		quantite = 0;
	}

	public boolean isInvariantOk() {
		// TODO Auto-generated method stub
		return true;
	}
}
