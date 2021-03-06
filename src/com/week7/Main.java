package com.week7;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Represents the main window of the application
        Window mainwindow = Window.getInstance();

        // Add button and Label
        mainwindow.setBtn(new Button("Quit"));
        mainwindow.setLabel(new Label("Best Program"));

        System.out.println(mainwindow);
        mainwindow.printInfo();

        // Let us fail miserably...
        System.out.println("Creating a new window...");
        Window secondWindow = Window.getInstance();
        secondWindow.setBtn(new Button("Fail"));
        System.out.println("Printing info from odl window...");
        mainwindow.printInfo();


    }
}
