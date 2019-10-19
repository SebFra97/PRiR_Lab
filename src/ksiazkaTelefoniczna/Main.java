package ksiazkaTelefoniczna;


public class Main {
    public static void main(String[] args){

        KsiazkaTelefoniczna ksiazka = new KsiazkaTelefoniczna();

        Osoba o1 = new Osoba("Sebastian","Franc","546987213");
        Osoba o2 = new Osoba("Patryk","Franc","8217362910");
        Osoba o3 = new Osoba("Anna","Piechowska","258631479");
        Osoba o4 = new Osoba("Jakub","Calik","123852467");
        Osoba o5 = new Osoba("Anna","Rubik","6600698413");

        ksiazka.DodajOsobe(o1);
        ksiazka.DodajOsobe(o2);
        ksiazka.DodajOsobe(o3);
        ksiazka.DodajOsobe(o4);
        ksiazka.DodajOsobe(o5);

        System.out.println(ksiazka.getByImie("Anna"));
        System.out.println(ksiazka.getByNazwisko("Franc"));


    }
}
