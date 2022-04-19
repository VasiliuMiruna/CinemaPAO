package model;

public class Actor {

    private String nume;
    private String prenume;
    private int varsta;
    private String rol;

    public Actor(String nume, String prenume, int varsta, String rol) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.rol = rol;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
