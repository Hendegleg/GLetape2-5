package App;

import Chapitre.Chapitre;
import Element.Element;
import Formation.Formation;
import Formation.FormationService;
import Formation.FormationServiceImpl;
import Leçon.Leçon;
import Module.Module;



public class App {
    public static void main(String[] args) {
        // Création d'une instance de Formation
        Formation formation = new Formation("Formation Java");

        // Création d'une instance de FormationServiceImpl
        FormationService formationService = new FormationServiceImpl(formation);

        // Appel des méthodes de FormationService pour tester
        formationService.afficherModulesParFormation(123);
        int nombreParticipants = formationService.recupererNombreParticipants(456);
        System.out.println("Nombre de participants : " + nombreParticipants);
    }
}

