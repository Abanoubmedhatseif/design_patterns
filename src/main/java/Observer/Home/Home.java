package Observer.Home;

import Observer.Home.classes.Abanoub;
import Observer.Home.classes.DoorBell;
import Observer.Home.classes.Mariam;
import Observer.Home.classes.Michael;

public class Home {
    public static void main(String[] args) {

        DoorBell doorBell = new DoorBell();

        Abanoub abanoub = new Abanoub(doorBell);

        Mariam mariam = new Mariam(doorBell);

        Michael michael = new Michael();

        doorBell.ring();

    }
}
