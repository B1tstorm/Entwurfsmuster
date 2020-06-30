package Observer.services;

import Observer.models.Formular;
import Observer.services.Versicherung;

public class HagelschlagVersicherung extends Versicherung {
    private Formular formular;

    public Formular getFormular() {
        return formular;
    }

    public void setFormular(Formular formular) {
        this.formular = formular;
        notify(formular);
    }
}
