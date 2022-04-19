package model;



public class Client extends Profil {

    private static int nrClienti = 0;
    private int clientId;
    private static int maxId = 0;


    public Client(int clientId,String nume, String prenume, int varsta, String email, String telefon) {
        super(nume, prenume, varsta, email, telefon);
        this.clientId = clientId;
        nrClienti++;
        maxId = Math.max(maxId, clientId);
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public static int getNrClienti() {
        return nrClienti;
    }

    public static void setNrClienti(int nrClienti) {
        Client.nrClienti = nrClienti;
    }

    public static int getMaxId() {
        return maxId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
    }
}
