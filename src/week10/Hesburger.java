package week10;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by ltrgit on 25/03/16.
 */
public class Hesburger {
    private ArrayList<String> menu;
    private int length;

    public Hesburger(){
        menu = new ArrayList<>();
        menu.add("KerrosAteria, 8€");
        menu.add("JuustoAteria, 5€");
        menu.add("Pelkät Ranet, 3€");
        menu.add("Soija Tortilla, 7€");
        menu.add("Falafel Hamburger, 6€");
        length = menu.size();
    }

    public Stream<String> createIt() {
        return menu.stream();
    }

    public HesburgerIterator createIterator() {
        return new HesburgerIterator(menu);
    }
}
