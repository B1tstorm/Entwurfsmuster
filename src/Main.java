import Observer.models.Formular;
import Observer.observer.BusinessKunde;
import Observer.observer.Kunde;
import Observer.observer.PrivatKunde;
import Observer.services.HagelschlagVersicherung;


public class Main {

    public static void main(String[] args) {
        // Observerpattern test
        HagelschlagVersicherung kiel = new HagelschlagVersicherung();
        Kunde peter = new BusinessKunde();
        Kunde fritz = new PrivatKunde();

        kiel.attach(peter);
        kiel.attach(fritz);

        Formular neuesFormular = new Formular("Hagelschaden");
        // Schicke gleiches Formular an Privat und Geschäftskunden, da es für beide gilt (beide angemeldet)
        kiel.setFormular(neuesFormular);

    }
}
