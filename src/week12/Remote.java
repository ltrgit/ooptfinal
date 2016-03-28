package week12;

/**
 * Created by ltrgit on 28/03/16.
 */
public class Remote {
    Command com1;
    Command com2;
    Command com3;

    public void setCommands(Command com1, Command com2, Command com3){
        this.com1 = com1;
        this.com2 = com2;
        this.com3 = com3;
    }
    public void setCommand1(String button, Command c){
        switch (button){
            case "com1": com1 = c; break;
            case "com2": com2 = c; break;
            case "com3": com3 = c; break;
        }
    }

    public void pushButtons(){
        com1.execute();
        buttonWasPressed(com1);
        com2.execute();
        buttonWasPressed(com2);
        com3.execute();
        buttonWasPressed(com3);
    }

    public void buttonWasPressed(Command c){
        System.out.println("Button: " + c + " was pressed");
    }
}
