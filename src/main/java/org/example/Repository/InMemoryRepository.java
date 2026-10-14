package org.example.Repository;

import org.example.Model.Autovehicul;
import org.example.Exceptions.RepositoryException;

public class InMemoryRepository implements IRepository {
    private final Autovehicul[] elemente;
    private int dimensiune;

    public InMemoryRepository(int capacitateMaxima) {
        elemente = new Autovehicul[capacitateMaxima];
        dimensiune = 0;
    }

    @Override
    public void adauga(Autovehicul autovehicul) {
        if (dimensiune >= elemente.length) {
            throw new RepositoryException("Repository-ul este plin! Nu se mai pot adauga elemente.");
        }
        elemente[dimensiune++] = autovehicul;
    }

    @Override
    public void sterge(int index) {
        if (index < 0 || index >= dimensiune) {
            throw new RepositoryException("Index invalid pentru stergere!");
        }
        for (int i = index; i < dimensiune - 1; i++) {
            elemente[i] = elemente[i + 1];
        }
        elemente[--dimensiune] = null;
    }

    @Override
    public Autovehicul[] getToate() {
        Autovehicul[] rezultate = new Autovehicul[dimensiune];
        System.arraycopy(elemente, 0, rezultate, 0, dimensiune);
        return rezultate;
    }

    @Override
    public int getDimensiune() {
        return dimensiune;
    }
}