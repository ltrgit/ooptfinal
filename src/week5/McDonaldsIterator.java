package week5;

/**
 * Created by ltrgit on 25/03/16.
 */
public class McDonaldsIterator implements Iterator{
    private int pos;
    private String[] menu;
    public McDonaldsIterator(){
        menu = new String[5];
        menu[0] = "BigMac, 5€";
        menu[1] = "HappyMeal, 6€";
        menu[2] = "ElMaco, 5€";
        menu[3] = "QuarterPounder, 5€";
        menu[4] = "CheesyBurger, 2€";
        pos = 0;
    }


    @Override
    public boolean hasNext() {
        return pos != menu.length;
    }

    @Override
    public Object next() {
        return menu[pos++];
    }
}
