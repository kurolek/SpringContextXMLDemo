package implementations;

import interfaces.IPerson;

public class Horseman implements IPerson {
    public void goTo(int _x, int _y) {

        System.out.printf("Ride on horse to %d; %d\n", _x, _y);
    }
}
