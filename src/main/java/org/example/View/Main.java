package org.example.View;

import org.example.Controller.ServiceController;
import org.example.Model.*;
import org.example.Repository.InMemoryRepository;
import org.example.Repository.IRepository;

public class Main {
    public static void main(String[] args) {

        IRepository repo = new InMemoryRepository(10);
        ServiceController controller = new ServiceController(repo);


        controller.adaugaAutovehicul(new Masina("Audi", 1500));
        controller.adaugaAutovehicul(new Camion("Volvo", 4500));
        controller.adaugaAutovehicul(new Motocicleta("Yamaha", 800));
        controller.adaugaAutovehicul(new Masina("Dacia", 450));

        System.out.println("Toate autovehiculele din service");
        for (Autovehicul a : repo.getToate()) {
            System.out.println(a.getDescriere());
        }

        System.out.println("\n Autovehicule cu costul de reparatie > 1000 RON ");
        Autovehicul[] scumpe = controller.filtreazaCostMaiMareDe1000();
        for (Autovehicul a : scumpe) {
            System.out.println(a.getDescriere());
        }
    }
}
