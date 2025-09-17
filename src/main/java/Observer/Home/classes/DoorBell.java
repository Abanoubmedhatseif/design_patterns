package Observer.Home.classes;

import Observer.Home.interfaces.Observer;
import Observer.Home.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class DoorBell implements Subject {


    private List<Observer> observers;

    public DoorBell(){
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update();
        }
    }

    public void ring(){
        System.out.println("Someone is at the door");
        notifyObservers();
    }
}
