import model.*;
import service.Service;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import  model.Gen;

public class Main {

    public static void main(String[] args) {

            Service service = new Service();
            HashMap<Integer, Client> clienti;
            Cinema cinema = Cinema.getInstance();


            //adaugarea de angajati

            Angajat a1 = new Angajat("Popescu", "Ion", 25, "ionp@yahoo.ro", "0723432134", 1);
            Angajat a2 = new Angajat("Barbu", "Mariana", 22, "mary@yahoo.ro", "0723333894", 2);
            Angajat a3 = new Angajat("Constantin", "Ana", 23, "ana@yahoo.ro", "0723433334", 3);
            Angajat a4 = new Angajat("Frunza", "Cosmin", 25, "cosminp@yahoo.ro", "0723542134", 4);
            Angajat a5 = new Angajat("Andries", "Vlad", 27, "vlad@yahoo.ro", "0723432145", 5);
//            System.out.println(a1);
//            System.out.println(a2);
//            System.out.println(a3);
//            System.out.println(a4);
//            System.out.println(a5);

            Program p = new Program();
            //film: Pulp Fiction

            Actor actor1 = new Actor("John", "Travolta", 68, "Vincent Vega");
            Actor actor2 = new Actor("Uma", "Thurman", 51, "Mia Wallace");
            Actor actor3 = new Actor("Samuel L.", "Jackson", 73, "Jules Winnfield");
            Actor actor4 = new Actor("Quentin", "Tarantino", 59, "Jimmie Dimmick");

//            Actor[] actori1 = new Actor[0];
//            actori1[0].add(actor1);
//            actori1[1] = actor2;
//            actori1[2] = actor3;
//            actori1[3] = actor4;

            Film f1 = new Film("Pulp Fiction", 240, Gen.COMEDIE, "Quentin Tarantino", 30, LocalTime.of(20, 30));

            service.AdaugaFilmZi(1, p, f1);
            service.AdaugaFilmZi(2, p, f1);
            service.AdaugaFilmZi(3, p, f1);
            service.AdaugaFilmZi(4, p, f1);
            service.AdaugaFilmZi(5, p, f1);
            //film: Saving Private Ryan

            Actor actor5 = new Actor("Tom", "Hanks", 65, "John H. Miller");
            Actor actor6 = new Actor("Van", "Diesel", 54, "Private Adrian Capazo");
            Actor actor7 = new Actor("Matt", "Damon", 73, "Soldat Richard Reiben");

            Film f2 = new Film("Saving Private Ryan", 130, Gen.RAZBOI, "Steven Spielberg", 20, LocalTime.of(16, 15));

            service.AdaugaFilmZi(1, p, f2);
            service.AdaugaFilmZi(2, p, f2);
            service.AdaugaFilmZi(4, p, f2);
            service.AdaugaFilmZi(6, p, f2);
            service.AdaugaFilmZi(7, p, f2);
            //film: Trainspotting

            Actor actor8 = new Actor("Ewan", "McGregor", 51, "Mark Renton");
            Actor actor9 = new Actor("Jonny Lee", "Miller", 49, "Sick Boy");
            Actor actor10 = new Actor("Ewen", "Bremner", 50, "Spud");


            Film f3 = new Film("Trainspotting", 130, Gen.AVANGARDIST, "Danny Boyle", 15, LocalTime.of(18, 15));

            service.AdaugaFilmZi(1, p, f3);
            service.AdaugaFilmZi(2, p, f3);
            service.AdaugaFilmZi(4, p, f3);
            service.AdaugaFilmZi(6, p, f3);
            service.AdaugaFilmZi(7, p, f3);

            //p.AfiseazaProgramSaptamana();

            p.sorteazaProgramSaptamana();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Bine ai venit pe site-ul Cityplex!");
            System.out.println("[1] Vizualizeaza programul de pe o zi din saptamna asta:");
            System.out.println("[2] Vizualizeaza programul de saptamana asta");
            System.out.println("[3] Vreau sa vad cand se difuzeaza un film anume");
            System.out.println("[4] Vreau sa imi creez cont");
            System.out.println("[5] Vreau sa cumpar bilet la un film");
            System.out.println("[6] Iesi");
           // String raspuns = scanner.nextLine();

            while (true) {

                    String option = scanner.nextLine();
                    if(option.equalsIgnoreCase("0")) {
                            break;
                    }

                    switch (option) {
                            case "1": {
                                    System.out.println("Alege ziua: [L/M/Mi/J/V/S/D]");
                                    String zi = scanner.nextLine();
                                    if(zi.equals("L")) {
                                            p.sorteazaProgramZilnic(1);
                                            p.AfiseazaFilmeleZi(1);
                                    }
                                    else if(zi.equals("M")) {
                                            p.sorteazaProgramZilnic(2);
                                            p.AfiseazaFilmeleZi(2);
                                    }
                                    else if(zi.equals("Mi")){
                                            p.sorteazaProgramZilnic(3);
                                            p.AfiseazaFilmeleZi(3);
                                    }
                                    else if(zi.equals("J")) {
                                            p.sorteazaProgramZilnic(4);
                                            p.AfiseazaFilmeleZi(4);
                                    }
                                    else if(zi.equals("V")) {
                                            p.sorteazaProgramZilnic(5);
                                            p.AfiseazaFilmeleZi(5);
                                    }
                                    else if(zi.equals("S")) {
                                            p.sorteazaProgramZilnic(6);
                                            p.AfiseazaFilmeleZi(6);
                                    }
                                    else if(zi.equals("D")) {
                                            p.sorteazaProgramZilnic(7);
                                            p.AfiseazaFilmeleZi(7);
                                    }


                                     break;
                            }
                            case "2":{
                                    p.sorteazaProgramSaptamana();
                                    p.AfiseazaProgramSaptamana();
                                    break;
                            }
                            case "3": {
                                    System.out.println("Introdu nume film: ");
                                    String film = scanner.nextLine();
                                    p.AfisareZileFilm(film);
                                    break;
                            }

                            case "4": {

                                    service.CreareCont();
                                    break;
                            }
                            case "5":{

                                    Film f;
                                    System.out.println("Selecteaza film: ");
                                    String numeFilm = scanner.nextLine();
                                    System.out.println("Selecteaza ziua:[L/M/Mi/J/V/S/D]");
                                    String zi = scanner.nextLine();
                                    if(zi.equals("L")) {
                                           for(int i = 0; i < p.getProgram()[1].size();i++)
                                                   if(numeFilm.equals(p.getProgram()[1].get(i).getDenumire()))
                                                   {
                                                           System.out.println("Introdu numarul de bilete: ");
                                                           Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                           System.out.println("Id client:");
                                                           Integer id = Integer.valueOf(scanner.nextLine());

                                                           int idBilet = Bilet.getMaxId()+1;

                                                           Bilet bilet = new Bilet(idBilet, id, p.getProgram()[1].get(i));

                                                           System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                           String raspuns = scanner.nextLine();
                                                           if(raspuns.equals("y"))
                                                           {
                                                                   VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                   System.out.println("Pret total:");
                                                                   System.out.println(v.vanzareBilete());
                                                                   System.out.println("Vizionare placuta!");

                                                           }

                                                           break;

                                                   }

                                        break;
                                    }
                                    else if(zi.equals("M")) {
                                            for(int i = 0; i < p.getProgram()[2].size();i++)
                                                    if(numeFilm.equals(p.getProgram()[2].get(i).getDenumire()))
                                                    {
                                                            System.out.println("Introdu numarul de bilete: ");
                                                            Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                            System.out.println("Id client:");
                                                            Integer id = Integer.valueOf(scanner.nextLine());

                                                            int idBilet = Bilet.getMaxId()+1;

                                                            Bilet bilet = new Bilet(idBilet, id, p.getProgram()[2].get(i));

                                                            System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                            String raspuns = scanner.nextLine();
                                                            if(raspuns.equals("y"))
                                                            {
                                                                    VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                    System.out.println("Pret total:");
                                                                    System.out.println(v.vanzareBilete());
                                                                    System.out.println("Vizionare placuta!");

                                                            }

                                                            break;

                                                    }

                                            break;

                                    }
                                    else if(zi.equals("Mi")) {
                                            for(int i = 0; i < p.getProgram()[3].size();i++)
                                                    if(numeFilm.equals(p.getProgram()[3].get(i).getDenumire()))
                                                    {
                                                            System.out.println("Introdu numarul de bilete: ");
                                                            Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                            System.out.println("Id client:");
                                                            Integer id = Integer.valueOf(scanner.nextLine());

                                                            int idBilet = Bilet.getMaxId()+1;

                                                            Bilet bilet = new Bilet(idBilet, id, p.getProgram()[3].get(i));

                                                            System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                            String raspuns = scanner.nextLine();
                                                            if(raspuns.equals("y"))
                                                            {
                                                                    VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                    System.out.println("Pret total:");
                                                                    System.out.println(v.vanzareBilete());
                                                                    System.out.println("Vizionare placuta!");

                                                            }

                                                            break;

                                                    }

                                        break;
                                    }
                                    else if(zi.equals("J")) {
                                            for(int i = 0; i < p.getProgram()[4].size();i++)
                                                    if(numeFilm.equals(p.getProgram()[4].get(i).getDenumire()))
                                                    {
                                                            System.out.println("Introdu numarul de bilete: ");
                                                            Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                            System.out.println("Id client:");
                                                            Integer id = Integer.valueOf(scanner.nextLine());

                                                            int idBilet = Bilet.getMaxId()+1;

                                                            Bilet bilet = new Bilet(idBilet, id, p.getProgram()[4].get(i));

                                                            System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                            String raspuns = scanner.nextLine();
                                                            if(raspuns.equals("y"))
                                                            {
                                                                    VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                    System.out.println("Pret total:");
                                                                    System.out.println(v.vanzareBilete());
                                                                    System.out.println("Vizionare placuta!");

                                                            }

                                                            break;

                                                    }

                                        break;
                                    }
                                    else if(zi.equals("V")) {
                                            for(int i = 0; i < p.getProgram()[5].size();i++)
                                                    if(numeFilm.equals(p.getProgram()[5].get(i).getDenumire()))
                                                    {
                                                            System.out.println("Introdu numarul de bilete: ");
                                                            Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                            System.out.println("Id client:");
                                                            Integer id = Integer.valueOf(scanner.nextLine());

                                                            int idBilet = Bilet.getMaxId()+1;

                                                            Bilet bilet = new Bilet(idBilet, id, p.getProgram()[5].get(i));

                                                            System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                            String raspuns = scanner.nextLine();
                                                            if(raspuns.equals("y"))
                                                            {
                                                                    VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                    System.out.println("Pret total:");
                                                                    System.out.println(v.vanzareBilete());
                                                                    System.out.println("Vizionare placuta!");

                                                            }

                                                            break;

                                                    }

                                        break;
                                    }
                                    else if(zi.equals("S")) {
                                            for(int i = 0; i < p.getProgram()[6].size();i++)
                                                    if(numeFilm.equals(p.getProgram()[6].get(i).getDenumire()))
                                                    {
                                                            System.out.println("Introdu numarul de bilete: ");
                                                            Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                            System.out.println("Id client:");
                                                            Integer id = Integer.valueOf(scanner.nextLine());

                                                            int idBilet = Bilet.getMaxId()+1;

                                                            Bilet bilet = new Bilet(idBilet, id, p.getProgram()[6].get(i));

                                                            System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                            String raspuns = scanner.nextLine();
                                                            if(raspuns.equals("y"))
                                                            {
                                                                    VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                    System.out.println("Pret total:");
                                                                    System.out.println(v.vanzareBilete());
                                                                    System.out.println("Vizionare placuta!");

                                                            }

                                                            break;

                                                    }


                                            break;
                                    }
                                    else if(zi.equals("D")) {
                                            for(int i = 0; i < p.getProgram()[7].size();i++)
                                                    if(numeFilm.equals(p.getProgram()[7].get(i).getDenumire()))
                                                    {
                                                            System.out.println("Introdu numarul de bilete: ");
                                                            Integer nrbilete = Integer.valueOf(scanner.nextLine());

                                                            System.out.println("Id client:");
                                                            Integer id = Integer.valueOf(scanner.nextLine());

                                                            int idBilet = Bilet.getMaxId()+1;

                                                            Bilet bilet = new Bilet(idBilet, id, p.getProgram()[7].get(i));

                                                            System.out.println("Sunteti sigur ca doriti sa continuati?[y/n]");
                                                            String raspuns = scanner.nextLine();
                                                            if(raspuns.equals("y"))
                                                            {
                                                                    VanzareOnline v = new VanzareOnline(nrbilete, bilet);
                                                                    System.out.println("Pret total:");
                                                                    System.out.println(v.vanzareBilete());
                                                                    System.out.println("Vizionare placuta!");

                                                            }

                                                            break;

                                                    }

                                    break;
                                    }






                            }

                            case "6": {
                                    break;
                            }

                            default:
                                    System.out.println("Optiune invalida");
                    }
                    System.out.println("Adauga alta optiune");
            }







    }
}
