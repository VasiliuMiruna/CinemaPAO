package model;

public class VanzareOnline extends Vanzare{

    private int totalPlata;


    public VanzareOnline(int numarBilete, Bilet bilet) {
        super(numarBilete, bilet);


    }

    public int vanzareBilete(){
        for(int i = 0; i <= numarBilete; i++)
            totalPlata+=  bilet.getFilm().getPretBilet();
        return totalPlata;


    }
    public void refund(){
        numarBilete = 0;
        totalPlata = 0;


    }
}
