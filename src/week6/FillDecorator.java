package week6;

/**
 * Created by ltrgit on 27/03/16.
 */
public class FillDecorator extends ShapeDecorator {

    private String fill;

    public FillDecorator(Shape s, String f){
        super(s);
        fill = f;
    }

    @Override
    public void draw() {
        shape.draw();
        System.out.println("This shapes fill color is: " + fill);
    }
}
