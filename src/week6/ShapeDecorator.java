package week6;

/**
 * Created by ltrgit on 27/03/16.
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape shape;

    public ShapeDecorator(Shape s){
        shape = s;
    }

    @Override
    public void draw() {
        shape.draw();
    }
}
