package srpSolis;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Commentaire {
    private int id;
    private String contenu;
    private String image;
    private Date datePublication;

    public Commentaire(int id, String contenu, String image, Date datePublication) {
        this.id = id;
        this.contenu = contenu;
        this.image = image;
        this.datePublication = datePublication;
    }

    public int getId() {
        return id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Commentaire{" +
                "id=" + id +
                ", contenu='" + contenu + '\'' +
                ", image='" + image + '\'' +
                ", datePublication=" + datePublication +
                '}';
    }
}
