package model;

public abstract class Vanzare {

    protected int numarBilete;

    protected Bilet bilet;
    protected int nrVanzare = 0;


    public Vanzare(int numarBilete, Bilet bilet) {
        this.numarBilete = numarBilete;
        this.bilet = bilet;
        this.nrVanzare++;
    }

    public int getNumarBilete() {
        return numarBilete;
    }

    public void setNumarBilete(int numarBilete) {
        this.numarBilete = numarBilete;
    }

    public Bilet getBilet() {
        return bilet;
    }

    public void setBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    public int getNrVanzare() {
        return nrVanzare;
    }

    public void setNrVanzare(int nrVanzare) {
        this.nrVanzare = nrVanzare;
    }

    abstract public int vanzareBilete();
    abstract public void refund();

}
