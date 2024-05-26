package observer;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(Formation formation);
}

class Formation {
    private String nom;
    private List<Observer> observateurs = new ArrayList<>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
        // Notifier les observateurs lorsqu'il y a un changement
        notifyObservers();
    }

    public void addObserver(Observer observateur) {
        observateurs.add(observateur);
    }

    public void removeObserver(Observer observateur) {
        observateurs.remove(observateur);
    }

    private void notifyObservers() {
        for (Observer observateur : observateurs) {
            observateur.update(this);
        }
    }
}

// Observateur (utilisateur)
class Utilisateur implements Observer {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    @Override
    public void update(Formation formation) {
        System.out.println("Utilisateur " + nom + " : La formation " + formation.getNom() + " a été mise à jour.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Instance de Formation
        Formation formation = new Formation();

        // Création des observateurs
        Utilisateur utilisateur1 = new Utilisateur("Hend");
        Utilisateur utilisateur2 = new Utilisateur("Wejden");

        formation.addObserver(utilisateur1);
        formation.addObserver(utilisateur2);

        // Modification du nom de la formation
        formation.setNom("formation Java ");
    }
}
