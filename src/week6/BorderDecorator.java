package week6;

/**
 * Created by ltrgit on 27/03/16.
 */
public class BorderDecorator extends ShapeDecorator {
    private String color;

    public BorderDecorator(Shape s, String clr){
        super(s);
        color = clr;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("This shape has " + color + "Border");
    }
}
