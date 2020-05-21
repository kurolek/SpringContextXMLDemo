package implementations;

import interfaces.IPerson;
import org.springframework.beans.factory.InitializingBean;

public class Cavalry implements IPerson, InitializingBean {

    public void goTo(int _x, int _y) {

        System.out.printf("Ride on horse to %d; %d\n", _x, _y);
    }

    public void afterPropertiesSet() throws Exception {

    }
}
