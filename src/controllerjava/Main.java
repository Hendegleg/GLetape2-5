package controllerjava;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        // simulation d'un événement de cnx
        Map<String, String> loginData = new HashMap<>();
        loginData.put("email", "hendlegleg1@gmail.com");
        loginData.put("password", "hend");
        Event loginEvent = new Event("login", loginData);

        userController.handleEvent(loginEvent);
    }
}
