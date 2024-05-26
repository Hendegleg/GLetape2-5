package srpSolis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Commentaire commentaire1 = new Commentaire(1, "Contenu du commentaire 1", "image1.jpg", new Date());
        Commentaire commentaire2 = new Commentaire(2, "Contenu du commentaire 2", "image2.jpg", new Date());

        List<Commentaire> commentaires = new ArrayList<>();
        commentaires.add(commentaire1);
        commentaires.add(commentaire2);

        GestionCommentaire gestionnaire = new GestionCommentaire();
        PublicationCommentaire publicateur = new PublicationCommentaire(commentaires);

        gestionnaire.creerCommentaire("Nouveau commentaire", "image3.jpg");
        gestionnaire.parcourirCommentaires();
        gestionnaire.modifierCommentaire(2, "Nouveau contenu pour le commentaire 2");
        gestionnaire.supprimerCommentaire(1);
        gestionnaire.parcourirCommentaires();

        publicateur.publierCommentaire(1);
        publicateur.supprimerCommentaire(2);
    }
}