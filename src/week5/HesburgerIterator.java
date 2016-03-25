package week5;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * Created by ltrgit on 25/03/16.
 */
public class HesburgerIterator implements Iterator{
    ArrayList<String> menu;
    int pos;

    public HesburgerIterator(ArrayList l){
        menu = new ArrayList<>();
        menu = l;
        pos = 0;
    }


    @Override
    public boolean hasNext() {
        if( menu.size() == pos)
            return false;

        else
            return true;
    }

    @Override
    public Object next() {
        return menu.get(pos++);
    }
}
