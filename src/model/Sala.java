package model;

public class Sala {

    private int idSala;
    private int numarLocuri;
    private static int maxId = 0;

    public Sala(int numarLocuri) {
        this.numarLocuri = numarLocuri;
        this.idSala++;
        maxId = Math.max(maxId, idSala);
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getNumarLocuri() {
        return numarLocuri;
    }

    public void setNumarLocuri(int numarLocuri) {
        this.numarLocuri = numarLocuri;
    }

    public static int getMaxId() {
        return maxId;
    }
}
