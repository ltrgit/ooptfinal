package week12;

/**
 * Created by ltrgit on 28/03/16.
 */

public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light l){
        light = l;
    }
    @Override
    public void execute() {
        light.on();
    }
}
