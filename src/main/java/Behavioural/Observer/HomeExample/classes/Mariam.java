package Behavioural.Observer.HomeExample.classes;

import Behavioural.Observer.HomeExample.interfaces.Observer;
import Behavioural.Observer.HomeExample.interfaces.Subject;

public class Mariam implements Observer {

    Subject subject;

    public Mariam(Subject subject){
        System.out.println("Mariam has been created and registered herself as an observer");
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Mariam has heard the bell ring");
    }
}
