package week11;

/**
 * Created by ltrgit on 28/03/16.
 */
public class Main {
    public static void main(String[] args) {
        DogFactory dogef = new DogFactory();
        CatFactory catf = new CatFactory();

        Animal kappana = dogef.createAnimal("snaku");
        Animal tiger = catf.createAnimal("tigger");
    }
}
