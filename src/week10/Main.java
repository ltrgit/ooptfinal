package week10;

import java.util.stream.Stream;

/**
 * Created by ironman on 23/03/16.
 */
public class Main {
    public static void main(String[] args){

        McDonalds mc = new McDonalds();
        Hesburger hes = new Hesburger();
        ScanBurger sc = new ScanBurger();

        print(mc.createIt());
        print(hes.createIt());

        System.out.println("\n\nStreams above and classical Iterators below this line\n\n");

        Iterator iter = mc.createIterator();
        printIter(iter);

        iter = hes.createIterator();
        printIter(iter);

        System.out.println("En ossoo näitä adaptereita nytten");
        iter = sc.createIterator();
        printIter(iter);



    }

    private static void print(Stream s){
        s.forEach(System.out::println);
    }

    private static void printIter(Iterator i){
        while(i.hasNext())
            System.out.println(i.next());
    }
}
