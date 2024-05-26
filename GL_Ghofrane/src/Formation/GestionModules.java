package Formation;

import java.util.ArrayList;
import java.util.List;

public class GestionModules {
    private int idFormation;
    private List<Module> modules;
    
    public GestionModules(int idFormation) {
        this.idFormation = idFormation;
        this.modules = new ArrayList<>();
    }
    
    public void ajouterModule(Module module) {
        modules.add(module);
    }
    
    public void afficherModulesParFormation() {
        System.out.println("Modules de la formation (ID: " + idFormation + "):");
        for (Module module : modules) {
            System.out.println(module.getName());
        }
    }
}
