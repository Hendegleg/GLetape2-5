package Chapitre; 

import java.util.ArrayList;
import java.util.List;

import Element.Element;
import Leçon.Leçon;

public class Chapitre implements Element {
    private String nom;
    private List<Leçon> leçons;

    public Chapitre(String nom) {
        this.nom = nom;
        leçons = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterElement(Element element) {
        if (element instanceof Leçon) {
            leçons.add((Leçon) element);
        }
    }

    public List<Element> getElements() {
        return new ArrayList<>(leçons);
    }
}
