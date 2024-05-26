package srpSolis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class GestionCommentaire {
    private List<Commentaire> commentaires;

    public GestionCommentaire() {
        this.commentaires = new ArrayList<>();
    }

    public void creerCommentaire(String contenu, String image) {
        int id = commentaires.size() + 1;
        Commentaire commentaire = new Commentaire(id, contenu, image, new Date());
        commentaires.add(commentaire);
        System.out.println("Commentaire créé avec succès.");
    }

    public void modifierCommentaire(int id, String nouveauContenu) {
        for (Commentaire commentaire : commentaires) {
            if (commentaire.getId() == id) {
                commentaire.setContenu(nouveauContenu);
                System.out.println("Commentaire modifié avec succès.");
                return;
            }
        }
        System.out.println("Le commentaire avec l'ID " + id + " n'existe pas.");
    }

    public void supprimerCommentaire(int id) {
        for (int i = 0; i < commentaires.size(); i++) {
            if (commentaires.get(i).getId() == id) {
                commentaires.remove(i);
                System.out.println("Commentaire supprimé avec succès.");
                return;
            }
        }
        System.out.println("Le commentaire avec l'ID " + id + " n'existe pas.");
    }

    public void parcourirCommentaires() {
        for (Commentaire commentaire : commentaires) {
            System.out.println(commentaire);
        }
    }
}
