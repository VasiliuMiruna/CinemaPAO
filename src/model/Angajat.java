package model;

public class Angajat extends Profil{

    private static int nrAngajati = 0;
    private int angajatId;

    public Angajat(String nume, String prenume, int varsta, String email, String telefon, int angajatId) {
        super(nume, prenume, varsta, email, telefon);
        this.angajatId = angajatId;
        nrAngajati++;
    }

    public static int getNrAngajati() {
        return nrAngajati;
    }

    public static void setNrAngajati(int nrAngajati) {
        Angajat.nrAngajati = nrAngajati;
    }

    public int getAngajatId() {
        return angajatId;
    }

    public void setAngajatId(int angajatId) {
        this.angajatId = angajatId;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "angajatId=" + angajatId +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
