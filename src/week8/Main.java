package week8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by ironman on 23/03/16.
 * Week 8, Observe!
 */
public class Main {


    public static void main(String[] args) {

        Application weatherApp = new Application("WeatherApp");
        Application bestGame = new Application("Game");
        Application angrybirds = new Application("AngryBirds");

        Observer iphone = new Iphone();
        Observer jolla = new Jolla();
        Observer android = new Android();

        weatherApp.registerObserver(iphone);
        weatherApp.registerObserver(jolla);

        weatherApp.setStatus("Too hot");
        //weatherApp.notifyObserver();

        bestGame.registerObserver(iphone);
        bestGame.registerObserver(android);
        bestGame.setStatus("Three new levels added!");

        angrybirds.registerObserver(jolla);
        angrybirds.setStatus("Check your new, even angrier birds, just for Jolla!");

        System.out.println("File reading...\n");
        updateStuff(weatherApp, "weather.txt");
        updateStuff(angrybirds, "birds.txt");


    }

    private static void updateStuff(Application s, String file) {

        String p = System.getProperty("user.dir");

        file = p + "/src/week8/" +file;

        try (Stream<String> stream = Files.lines(Paths.get(file))){
            stream.forEach(e -> s.setStatus(e));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
