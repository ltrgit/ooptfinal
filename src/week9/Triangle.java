package week9;

/**
 * Created by ltrgit on 24/03/16.
 */
public class Triangle implements Shape {
    String color;

    public Triangle(String c){
        color = c;
    }
    @Override
    public void draw() {
        System.out.println(color + " Triangle");
    }
}
