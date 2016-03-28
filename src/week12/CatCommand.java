package week12;

/**
 * Created by ltrgit on 28/03/16.
 */
public class CatCommand implements Command {
    private Cat cat;
    public CatCommand(Cat c){
        cat = c;
    }
    @Override
    public void execute() {
        cat.activate();
    }
}
