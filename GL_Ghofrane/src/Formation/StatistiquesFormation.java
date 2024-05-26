package Formation;

import java.util.List;

public class StatistiquesFormation {
    private List<Formation> formations;
    
    public StatistiquesFormation(List<Formation> formations) {
        this.formations = formations;
    }
    
    public int recupererNombreFormations() {
        return formations.size();
    }
}
