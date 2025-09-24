package Behavioural.Observer.HomeExample;

import Behavioural.Observer.HomeExample.classes.Abanoub;
import Behavioural.Observer.HomeExample.classes.DoorBell;
import Behavioural.Observer.HomeExample.classes.Mariam;
import Behavioural.Observer.HomeExample.classes.David;

public class Home {
    public static void main(String[] args) {

        DoorBell doorBell = new DoorBell();

        Abanoub abanoub = new Abanoub(doorBell);

        Mariam mariam = new Mariam(doorBell);

        David david = new David();

        doorBell.ring();

    }
}
