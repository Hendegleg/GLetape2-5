package Module;

import java.util.ArrayList;
import java.util.List;

import Chapitre.Chapitre;
import Element.Element;

public class Module implements Element {
    private String nom;
    private List<Chapitre> chapitres;

    public Module(String nom) {
        this.nom = nom;
        chapitres = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterElement(Element element) {
        if (element instanceof Chapitre) {
            chapitres.add((Chapitre) element);
        }
    }

    public List<Element> getElements() {
        return new ArrayList<>(chapitres);
    }
}
