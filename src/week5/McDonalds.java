package week5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Stream;

/**
 * Created by ltrgit on 25/03/16.
 */
public class McDonalds {
    int length;
    private String[] menu;

    public McDonalds(){
        menu = new String[5];
        menu[0] = "BigMac, 5€";
        menu[1] = "HappyMeal, 6€";
        menu[2] = "ElMaco, 5€";
        menu[3] = "QuarterPounder, 5€";
        menu[4] = "CheesyBurger, 2€";
        length = 5;
    }

    public Stream<String> createIt(){
        return Arrays.stream(menu);
    }

    public McDonaldsIterator createIterator(){ return new McDonaldsIterator();}
}
