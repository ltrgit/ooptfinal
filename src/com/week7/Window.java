package com.week7;

/**
 * Created by ironman on 23/03/16.
 */
public class Window {
    private static Window instance = null;
    private Button btn;
    private Label label;

    private Window(){}

    public static Window getInstance() {
        if (instance == null)
            instance = new Window();
        return instance;
    }

    protected void setLabel(Label lbl) {
        instance.label = lbl;
    }
    protected void setBtn(Button but){
        instance.btn = but;
    }

    protected void printInfo(){
        System.out.println("Button: " + this.btn + " Label: " + this.label);
    }
}
