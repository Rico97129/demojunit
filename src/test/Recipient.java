package test;

public class Recipient {
	/**
	 * initialise un recipient de quantité quantite et de capacité capacité <br>
	 * requiert quantié >=0 quantité >= capacite ;
	 * 
	 * @param quantite
	 * @param capacite
	 */
	private int quantite, capacite;

	public Recipient(int quantite, int capacite) {
		this.quantite = quantite;
		this.capacite = capacite;
	}

	/**
	 * Nombre d'element dans le recipient <br>
	 * est >=o , est < getCapacité()
	 * 
	 * @return
	 */
	public int getQuantite() {
		// TODO Auto-generated method stub
		return this.quantite;
	}

	/**
	 * nombre maximal d'element que peut contenir le recipient <br>
	 * >=getQantité()
	 * 
	 * @return
	 */
	public int getCapacite() {
		// TODO Auto-generated method stub
		return this.capacite;
	}

	public void mettreUnDans(Recipient autre) {
		quantite--;
		autre.quantite++;
	}

	public void remplir(Recipient autre) {
		quantite -= autre.getEspaceLibre();
		autre.quantite = autre.capacite;
	}

	public void viderDans(Recipient autre) {
		autre.quantite += quantite;
		quantite = 0;
	}

	public boolean isPlein() {
		return this.capacite == this.quantite;
	}

	public boolean isVide() {
		return this.quantite == 0;
	}

	public int getEspaceLibre() {
		return this.capacite - this.quantite;
	}

	public boolean isInvariantOk() {
		assert getCapacite() == getQuantite() + getEspaceLibre();
		assert isPlein() == (getQuantite() == getCapacite());
		assert isVide() == (getQuantite() == 0);
		return true;
	}

}
