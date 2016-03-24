package week9;

/**
 * Created by ltrgit on 24/03/16.
 */
public class Circle implements Shape{
    String color;

    public Circle(String c){
        color = c;
    }
    @Override
    public void draw() {
        System.out.println(color + " Circle");
    }
}
