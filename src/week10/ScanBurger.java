package week10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by ltrgit on 27/03/16.
 */
public class ScanBurger {
    protected List men;
    protected Enumeration<String> menu;

    public ScanBurger(){
        men = new ArrayList<>();
        men.add("ScanB burger");
        men.add("Bad fries");

        menu = Collections.enumeration(men);
    }


    public Iterator createIterator() {return new IteratorAdapter(this);}



}
