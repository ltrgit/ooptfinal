package week11;

/**
 * Created by ltrgit on 28/03/16.
 */

public class DogFactory implements PetFactory {

    @Override
    public Animal createAnimal(String kind) {
        return createDog(kind);
    }

    public Animal createDog(String kind){
        switch (kind){
            case "snaku": return new Snaku();
            case "terrier": return new Terrier();
            default: throw new RuntimeException("No such doge");
        }
    }
}
