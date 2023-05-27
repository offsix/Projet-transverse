package Modele;

public class ModeleEtiquette {

	private ModeleMembre[] Membre_du_projet;
	private String[] role;
	
	public final ModeleMembre[] getMembre_du_projet() {
		return Membre_du_projet;
	}
	public final void setMembre_du_projet(ModeleMembre[] membre_du_projet) {
		Membre_du_projet = membre_du_projet;
	}
	public final String[] getRole() {
		return role;
	}
	public final void setRole(String[] role) {
		this.role = role;
	}
}