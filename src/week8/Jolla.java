package week8;

/**
 * Created by ltrgit on 25/03/16.
 */
public class Jolla implements Observer{
    @Override
    public void update(Subject s) {
        Application app = (Application) s;
        System.out.println("Jolla " + app.getStatus());

    }
}
