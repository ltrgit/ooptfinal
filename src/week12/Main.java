package week12;

/**
 * Created by ltrgit on 28/03/16.
 */
public class Main {
    public static void main(String[] args) {
        Remote remote = new Remote();

        Light light = new Light();
        GarageDoor door = new GarageDoor();
        Cat cat = new Cat();

        remote.setCommands(new CatCommand(cat),
                new GarageDoorCommand(door), new LightOnCommand(light));

        remote.pushButtons();
        remote.setCommand1("com1", new LightOnCommand(light));
        remote.pushButtons();
    }
}
