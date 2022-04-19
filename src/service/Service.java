package service;

import model.Client;
import model.Film;
import model.Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {

    Scanner scanner = new Scanner(System.in);

    public void CreareCont() {

        //conectare cont

        System.out.println("Creare profil");
        System.out.println("Introdu numele:");
        String nume = scanner.nextLine();
        System.out.println("Introdu prenumele:");
        String prenume = scanner.nextLine();
        System.out.println("Introdu varsta:");
        int varsta = Integer.parseInt(scanner.nextLine());
        System.out.println("Introdu adresa de email:");
        String email = scanner.nextLine();
        System.out.println("Introdu numar de telefon:");
        String telefon = scanner.nextLine();


        Client client = new Client(Client.getMaxId()+1, nume, prenume, varsta, email, telefon);
        int ID = client.getClientId();
        System.out.println("Cont realizat cu succer, ID client:" + ID);

    }

    public void AdaugaFilmZi(int zi,Program p, Film f){
        ArrayList<Film>[] program = p.getProgram();
        program[zi].add(f);
        p.sorteazaProgramZilnic(zi);
    }




}
