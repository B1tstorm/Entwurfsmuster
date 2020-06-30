package Observer.observer;

import Observer.models.Formular;

public class BusinessKunde implements Kunde {

    @Override
    public void update(Formular formular) {
        System.out.println("Schicke Formular " + formular.getName() + " zu BusinessKunden");
    }
}
