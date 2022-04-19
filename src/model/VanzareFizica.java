package model;

public class VanzareFizica extends Vanzare {

    private int totalPlata;

    public VanzareFizica(int numarBilete, Bilet bilet) {
        super(numarBilete, bilet);

    }

    public int vanzareBilete(){
        for(int i = 0; i <= numarBilete; i++)
            totalPlata =  (bilet.getFilm().getPretBilet() +  bilet.getFilm().getPretBilet()/10) * numarBilete;
        return totalPlata;
    }
    public void refund(){
        numarBilete = 0;
        totalPlata = 0;


    }
}
