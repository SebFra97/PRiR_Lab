package ksiazkaTelefoniczna;

public class Osoba {

    public static int idLicznik;
    public int id;
    public String imie;
    public String nazwisko;
    public String nrTelefonu;

    public int getId() {
        return id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public Osoba(String imie, String nazwisko, String nrTelefonu) {

        idLicznik += 1;
        this.id = idLicznik;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrTelefonu = nrTelefonu;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "id=" + id +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", nrTelefonu='" + nrTelefonu + '\'' +
                '}';
    }
}
