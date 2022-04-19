package model;

public class Bilet {


    private int id;
    private int idClient;
   // private String numeFilm;
    //private int loc;
    //private Sala sala;
    private Film f;
    private static int maxId = 0;

    public Bilet(int id, int idClient, Film f) {
        this.id = id;
        this.idClient = idClient;
        this.f  = f;
        //this.loc = loc;

        maxId = Math.max(maxId, id);

    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }



    public static void setMaxId(int maxId) {
        Bilet.maxId = maxId;
    }

    public Film getFilm() {
        return f;
    }

    public void setF(Film f) {
        this.f = f;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    //public int getLoc() {
//        return loc;
//    }
//
//    //public void setLoc(int loc) {
//        this.loc = loc;
//    }



    public static int getMaxId() {
        return maxId;
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "id=" + id +
                ", idClient=" + idClient +
                ", numeFilm='" + f.getDenumire() + '\'' +
                //", loc=" + loc +

                '}';
    }



}

