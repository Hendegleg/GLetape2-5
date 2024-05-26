package Formation;

import java.util.Date;
import java.util.List;

public class GestionFormation {
    private String nom;
    private String description;
    private Date dateDebut;
    private Date dateFin;
    private String lieu;
    private String formateur;
    private List<Module> modules;
    
    public void modifierFormation(String info) {
        String[] infos = info.split(",");
        
        if (infos.length == 0) {
            System.out.println("Aucune information fournie pour la modification de la formation.");
            return;
        }
        
        for (String information : infos) {
            String[] keyValue = information.split(":");
            if (keyValue.length != 2) {
                System.out.println("Format d'information invalide : " + information);
                continue;
            }
            
            String key = keyValue[0].trim();
            String value = keyValue[1].trim();
            
            switch (key) {
                case "nom":
                    this.setNom(value);
                    break;
                case "description":
                    this.setDescription(value);
                    break;
                case "dateDebut":
                    // Implémenter la conversion de la chaîne en objet Date si nécessaire
                    break;
                case "dateFin":
                    // Implémenter la conversion de la chaîne en objet Date si nécessaire
                    break;
                case "lieu":
                    // Implémenter la mise à jour du lieu
                    break;
                case "formateur":
                    // Implémenter la mise à jour du formateur
                    break;
                default:
                    System.out.println("Clé d'information invalide : " + key);
                    break;
            }
        }
        
        System.out.println("La formation a été modifiée avec succès.");
    }
    
    public void supprimerFormation(int id) {
        // Supprimer la formation ayant l'ID spécifié de la liste des formations
    }
    
    public void parcourirFormations() {
        // Parcourir la liste des formations et effectuer une action sur chacune d'elles
    }
    
    public void consulterFormation(int id) {
        // Afficher les détails de la formation ayant l'ID spécifié
    }
    
    public List<Module> getModules() {
        return modules;
    }

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getFormateur() {
		return formateur;
	}

	public void setFormateur(String formateur) {
		this.formateur = formateur;
	}
}

