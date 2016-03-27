package week6;


/**
 * Created by ironman on 27/03/16.
 */
public class Main {

    public static void main(String[] args) {

        Shape c = new Circle();
        Shape cR = new BorderDecorator(new Circle(), "Green");
        Shape rR = new BorderDecorator(new Rectangle(), "Red");

        c.draw();
        cR.draw();
        rR.draw();

        /* Add pink fill to rR-rectangle with red colors */
        Shape rRpF = new FillDecorator(rR, "Pink");
        rRpF.draw();

    }
}
