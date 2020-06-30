package Observer.services;

import Observer.observer.Kunde;
import Observer.models.Formular;

import java.util.ArrayList;
import java.util.List;

public abstract class Versicherung {
    private final List<Kunde> kundenListe = new ArrayList<>();

    public void attach(Kunde kunde) {
        kundenListe.add(kunde);
    }

    public void remove(Kunde kunde) {
        kundenListe.remove(kunde);
    }

    protected void notify(Formular formular) {
        for (Kunde kunde : kundenListe) {
            kunde.update(formular);
        }
    }
}
