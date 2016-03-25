package week8;


import java.util.ArrayList;

public class Application implements Subject {
    private String name;
    private String status;
    private ArrayList<Observer> observers;

    public Application(String n){
        name = n;
        status = "Initializing...";
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }


    @Override
    public void notifyObserver() {
        observers.forEach(e->e.update(this));
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void setStatus(String s){
        status= name + " Updates: " +s;
        notifyObserver();
    }

    public String getStatus() {
        return status;
    }
}
