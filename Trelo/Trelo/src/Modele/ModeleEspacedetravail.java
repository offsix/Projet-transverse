package Modele;

public class ModeleEspacedetravail {

	private ModeleProjet[] project;
	private ModeleMembre proprietaire;
	
	public ModeleEspacedetravail(ModeleProjet[] project, ModeleMembre proprietaire) {
		this.project = project;
		this.proprietaire = proprietaire;
	}
	
	public final ModeleProjet[] getProject() {
		return project;
	}
	public final void setProject(ModeleProjet[] project) {
		this.project = project;
	}
	public final ModeleMembre getProprietaire() {
		return proprietaire;
	}
	public final void setProprietaire(ModeleMembre proprietaire) {
		this.proprietaire = proprietaire;
	}
	
	

}