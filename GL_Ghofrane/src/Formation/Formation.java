package Formation;

import java.util.ArrayList;
import java.util.List;

import Element.Element;
import Module.Module;

public class Formation implements Element {
    private String nom;
    private List<Module> modules;

    public Formation(String nom) {
        this.nom = nom;
        modules = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public void ajouterElement(Element element) {
        if (element instanceof Module) {
            modules.add((Module) element);
        } else {
            System.err.println("Erreur lors de l'ajout");
        }
    }


    public List<Element> getElements() {
        return new ArrayList<>(modules);
    }
}
