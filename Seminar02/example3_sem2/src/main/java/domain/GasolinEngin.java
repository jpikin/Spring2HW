package domain;

import org.springframework.stereotype.Component;
import interfaces.iEngin;

@Component
public class GasolinEngin implements iEngin {
    @Override
    public void startEngine() {
        System.out.println("GasolineEngin");
    }
}
