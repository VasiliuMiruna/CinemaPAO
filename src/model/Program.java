package model;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

    private ArrayList<Film>[] program = new ArrayList[8];

    public Program() {
        for(int i = 1; i <= 7; i++)
            program[i] = new ArrayList<Film>();
    }

    public ArrayList<Film>[] getProgram() {
        return program;
    }

    public void sorteazaProgramSaptamana(){
        for (int i = 1 ; i < 8 ; i ++){
            Collections.sort(program[i], new FilmComparator());
        }
    }

    public void sorteazaProgramZilnic(int ziua){
        Collections.sort(program[ziua], new FilmComparator());
    }

    public void AfiseazaProgramSaptamana() {
        for(int i = 1; i <= 7; i++) {
            //System.out.println("Ziua: " +  i);
            if(i == 1)
                System.out.println("Luni: ");
            else if(i == 2)
                System.out.println("Marti: ");
            else if(i == 3)
                System.out.println("Miercuri: ");
            else if(i == 4)
                System.out.println("Joi: ");
            else if(i == 5)
                System.out.println("Vineri: ");
            else if(i == 6)
                System.out.println("Sambata: ");
            else System.out.println("Duminica: ");
            for (int j = 0; j < program[i].size(); j++) {
                System.out.println(program[i].get(j).getDenumire() + "\n");

            }
            System.out.println("-------------------------------------------");
        }

    }

    public void AfiseazaFilmeleZi(int zi) {

            for(int j = 0; j < program[zi].size(); j++) {
                System.out.println(program[zi].get(j).getDenumire() + "\n");
            }


    }
    //afisez zilele in care se difuzeaza un film
    public void AfisareZileFilm(String denumire) {
        for(int i = 1; i <= 7; i++) {
            for (int j = 0; j < program[i].size(); j++)
                if (program[i].get(j).getDenumire().equalsIgnoreCase(denumire))
                   // System.out.println(i);
                    if(i == 1)
                        System.out.println("Luni");
                    else if(i == 2)
                        System.out.println("Marti");
                    else if(i == 3)
                        System.out.println("Miercuri");
                    else if(i == 4)
                        System.out.println("Joi");
                    else if(i == 5)
                        System.out.println("Vineri");
                    else if(i == 6)
                        System.out.println("Sambata");
                    else System.out.println("Duminica");
            //System.out.println("\n");
        }
    }
}
