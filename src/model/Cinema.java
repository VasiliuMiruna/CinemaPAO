package model;

public class Cinema {


    private static Cinema cinema;
    private String numeCinema;
    private int nrSali;
    private Sala[] sali;

    public Cinema() {
        numeCinema = "Cityplex";
        nrSali = 4;

    }

    public static Cinema getInstance() {
        if(cinema == null)
            cinema = new Cinema();
            return cinema;
    }

    public String getNumeCinema() {
        return numeCinema;
    }

    public void setNumeCinema(String numeCinema) {
        this.numeCinema = numeCinema;
    }

    public int getNrSali() {
        return nrSali;
    }

    public void setNrSali(int nrSali) {
        this.nrSali = nrSali;
    }

    public Sala[] getSali() {
        return sali;
    }

    public void setSali(Sala[] sali) {
        this.sali = sali;
    }
}
