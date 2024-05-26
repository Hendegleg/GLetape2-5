package Leçon;

import java.util.ArrayList;
import java.util.List;

import Element.Element;

public class Leçon implements Element {
    private String nom;
    private String contenu;

    public Leçon(String nom, String contenu) {
        this.nom = nom;
        this.contenu = contenu;
    }

    public String getNom() {
        return nom;
    }

    public void ajouterElement(Element element) {
        // Ne fait rien car une leçon ne peut pas contenir d'autres éléments.
    }

    public List<Element> getElements() {
        return new ArrayList<>();
    }

    public String getContenu() {
        return contenu;
    }
}

