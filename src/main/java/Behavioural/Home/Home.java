package Behavioural.Home;

import Behavioural.Home.classes.Abanoub;
import Behavioural.Home.classes.DoorBell;
import Behavioural.Home.classes.Mariam;
import Behavioural.Home.classes.David;

public class Home {
    public static void main(String[] args) {

        DoorBell doorBell = new DoorBell();

        Abanoub abanoub = new Abanoub(doorBell);

        Mariam mariam = new Mariam(doorBell);

        David david = new David();

        doorBell.ring();

    }
}
