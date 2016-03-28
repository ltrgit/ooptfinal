package week12;

/**
 * Created by ltrgit on 28/03/16.
 */
public class GarageDoorCommand implements Command {
    private GarageDoor door;

    public GarageDoorCommand (GarageDoor d) {
        door = d;
    }

    @Override
    public void execute() {
        door.open();
    }
}
