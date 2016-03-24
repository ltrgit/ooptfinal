package week9;

/**
 * Created by ltrgit on 24/03/16.
 */
public class Rectangle implements Shape{
    String color;

    public Rectangle(String c){
        color = c;
    }
    @Override
    public void draw() {
        System.out.println(color + " Rectangle");
    }
}
