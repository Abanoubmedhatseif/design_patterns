package Observer.Home.classes;

import Observer.Home.interfaces.Observer;
import Observer.Home.interfaces.Subject;

public class Abanoub implements Observer {
    Subject subject;

    public Abanoub(Subject subject){
        System.out.println("Abanoub has been created and registered himself as an observer");
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println("Abanoub heard the bell ring");
        System.out.println("Abanoub will take an action");
    }

}
