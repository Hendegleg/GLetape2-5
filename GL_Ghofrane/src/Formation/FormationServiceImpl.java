package Formation;

public class FormationServiceImpl implements FormationService {

	
    private Formation formation;

    public FormationServiceImpl(Formation formation) {
        this.formation = formation;
    }

  
    @Override
    public int recupererNombreParticipants(int id) {
        return 0;
    }

    @Override
	public void afficherModulesParFormation(int id) {
		// 
		
	}
}
