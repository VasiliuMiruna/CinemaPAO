package model;
import java.util.Arrays;
import java.time.LocalTime;
import java.util.Comparator;

public class Film {

    private String denumire;
    private int durata;
    private Gen gen;
    private String regizor;
    private Actor[] actori = new Actor[0];
    private int pretBilet;
    private LocalTime oraInceput;


    public Film(String denumire, int durata, Gen gen, String regizor, int pretBilet, LocalTime oraInceput) {
        this.denumire = denumire;
        this.durata = durata;
        this.gen = gen;
        this.regizor = regizor;
        this.actori = new Actor[20];
        this.pretBilet = pretBilet;
        this.oraInceput = oraInceput;

    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public Gen getGen() {
        return gen;
    }

    public void setGen(Gen gen) {
        this.gen = gen;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }

    public int getPretBilet() {
        return pretBilet;
    }

    public void setPretBilet(int pretBilet) {
        this.pretBilet = pretBilet;
    }

    public LocalTime getOraInceput() {
        return oraInceput;
    }

    public void setOraInceput(LocalTime oraInceput) {
        this.oraInceput = oraInceput;
    }

    public String getRegizor() {
        return regizor;
    }

    public void setRegizor(String regizor) {
        this.regizor = regizor;
    }

    @Override
    public String toString() {
        return "Film{" +
                "denumire='" + denumire + '\'' +
                ", durata=" + durata +
                ", gen=" + gen +
                ", actori=" + Arrays.toString(actori) +
                ", ora inceput = " + oraInceput +

                '}';
    }
}

class FilmComparator implements Comparator<Film> {
    public int compare(Film f1, Film f2){
        return f1.getOraInceput().getHour() - f2.getOraInceput().getHour();

    }
}