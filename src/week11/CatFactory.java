package week11;

/**
 * Created by ltrgit on 28/03/16.
 */

public class CatFactory implements PetFactory {
    @Override
    public Animal createAnimal(String kind) {
        switch (kind){
            case "tigger": return new Tigger();
            case "leopard": return new Leopard();
            default: throw new RuntimeException("No such cat");
        }
    }
}
