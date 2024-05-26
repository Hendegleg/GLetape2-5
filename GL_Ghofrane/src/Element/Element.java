package Element;

import java.util.*;

public interface Element {
    String getNom();
    void ajouterElement(Element element);
    List<Element> getElements();
}