package org.example.Controller;

import org.example.Model.Autovehicul;
import org.example.Repository.IRepository;

public class ServiceController {
    private final IRepository repository;

    public ServiceController(IRepository repository) {
        this.repository = repository;
    }

    public void adaugaAutovehicul(Autovehicul a) {
        repository.adauga(a);
    }

    public void stergeAutovehicul(int index) {
        repository.sterge(index);
    }

    // Funcționalitatea cerută: afișarea autovehiculelor cu costul de reparație mai mare de 1000 RON
    public Autovehicul[] filtreazaCostMaiMareDe1000() {
        Autovehicul[] toate = repository.getToate();
        int numarMatch = 0;

        for (Autovehicul a : toate) {
            if (a.getCostReparatie() > 1000) {
                numarMatch++;
            }
        }

        Autovehicul[] filtrate = new Autovehicul[numarMatch];
        int k = 0;
        for (Autovehicul a : toate) {
            if (a.getCostReparatie() > 1000) {
                filtrate[k++] = a;
            }
        }

        return filtrate;
    }
}
