package week10;


import java.util.Enumeration;

/**
 * Created by ltrgit on 27/03/16.
 */
public class IteratorAdapter implements Iterator{

    private ScanBurger scanb;

    IteratorAdapter(ScanBurger sc){
        scanb = sc;
    }

    @Override
    public boolean hasNext() {
        return scanb.menu.hasMoreElements();
    }

    @Override
    public Object next() {
        return scanb.menu.nextElement();
    }
}

