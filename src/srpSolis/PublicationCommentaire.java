package srpSolis;

import java.util.List;

class PublicationCommentaire {
    private List<Commentaire> commentaires;

    public PublicationCommentaire(List<Commentaire> commentaires) {
        this.commentaires = commentaires;
    }

    public void publierCommentaire(int id) {
        for (Commentaire commentaire : commentaires) {
            if (commentaire.getId() == id) {
                System.out.println("Le commentaire \"" + commentaire.getContenu() + "\" a été publié.");
                return;
            }
        }
        System.out.println("Le commentaire avec l'ID " + id + " n'existe pas.");
    }

    public void supprimerCommentaire(int id) {
        for (int i = 0; i < commentaires.size(); i++) {
            if (commentaires.get(i).getId() == id) {
                commentaires.remove(i);
                System.out.println("Le commentaire avec l'ID " + id + " a été supprimé.");
                return;
            }
        }
        System.out.println("Le commentaire avec l'ID " + id + " n'existe pas.");
    }
}
