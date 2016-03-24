package week9;

import java.util.ArrayList;

/**
 * Created by ltrgit on 24/03/16.
 */
public class ComplexShape implements Shape {

    private ArrayList<Shape> shapes;

   public ComplexShape(){
        shapes = new ArrayList<>();
    }

    public void addShape(Shape s) {
        shapes.add(s);
    }

    @Override
    public void draw() {
        System.out.println("I consist of the following shapes:");
        shapes.stream().forEach(e-> e.draw());

    }
}
