package controllerjava;

import java.util.HashMap;
import java.util.Map;

interface Controller {
    void handleEvent(Event event);
}

// Contrôleur pour la gestion des utilisateurs
public class UserController implements Controller {
    private Map<String, String> users;

    public UserController() {
        users = new HashMap<>();
        users.put("hendlegleg1@gmail.com", "hend");
        users.put("wechcriaghofrane", "ghof");
    }

    public void handleEvent(Event event) {
        if (event.getType().equals("login")) {
            String email = event.getData().get("email");
            String password = event.getData().get("password");
            if (users.containsKey(email) && users.get(email).equals(password)) {
                System.out.println("Authentification réussie pour l'utilisateur : " + email);
            } else {
                System.out.println("Échec de l'authentification pour l'utilisateur : " + email);
            }
        }
    }
}
