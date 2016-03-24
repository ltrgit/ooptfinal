package week9;

/**
 * Created by ltrgit on 24/03/16.
 * Composite pattern
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Jee Komposiitti muovia");

        ComplexShape s1 = new ComplexShape();
        ComplexShape s2 = new ComplexShape();
        ComplexShape s3 = new ComplexShape();

        s1.addShape(new Circle("Red"));
        s1.addShape(new Rectangle("Green"));
        s1.addShape(new Triangle("White"));

        s2.addShape(new Triangle("Pink"));
        s2.addShape(new Circle("Cyan"));

        s3.addShape(new Rectangle("Grey"));
        s3.addShape(new Circle("Black"));

        System.out.println("CiReTri");
        s1.draw();

        System.out.println("TriCi");
        s2.draw();

        System.out.println("ReCi");
        s3.draw();


    }
}


