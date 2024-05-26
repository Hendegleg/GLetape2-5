package Lecon;
import java.util.ArrayList;
import java.util.List;

class Leçon {
    private int id;
    private String titre;
    private String contenu;

    public Leçon(int id, String titre, String contenu) {
        this.id = id;
        this.titre = titre;
        this.contenu = contenu;
    }

    // Getters and setters
    // Ajouter d'autres méthodes selon les besoins
}

class Chapitre {
    private int id;
    private String titre;
    private String description;
    private List<Leçon> lecons;

    public Chapitre(int id, String titre, String description) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.lecons = new ArrayList<>();
    }

    // Ajouter une leçon au chapitre
    public void ajouterLeçon(Leçon leçon) {
        this.lecons.add(leçon);
    }

    
    public int recupererNombreLecons() {
        return this.lecons.size();
    }

 
}

public class Main {
    public static void main(String[] args) {
        // Création de leçons
        Leçon leçon1 = new Leçon(1, "Introduction", "Contenu de l'introduction");
        Leçon leçon2 = new Leçon(2, "Développement", "Contenu du développement");
        Leçon leçon3 = new Leçon(3, "Conclusion", "Contenu de la conclusion");

        // Création d'un chapitre
        Chapitre chapitre = new Chapitre(1, "Chapitre 1", "Description du chapitre 1");

        // Ajout des leçons au chapitre
        chapitre.ajouterLeçon(leçon1);
        chapitre.ajouterLeçon(leçon2);
        chapitre.ajouterLeçon(leçon3);

        // Test de la méthode récupérerNombreLecons()
        int nombreLecons = chapitre.recupererNombreLecons();
        System.out.println("Nombre de leçons dans le chapitre : " + nombreLecons);
    }
}
