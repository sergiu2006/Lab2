package org.example.Repository;

import org.example.Model.Autovehicul;
import org.example.Exceptions.RepositoryException;

public interface IRepository {
    void adauga(Autovehicul autovehicul) throws RepositoryException;
    void sterge(int index) throws RepositoryException;
    Autovehicul[] getToate();
    int getDimensiune();
}