package org.example.Model;

public class Motocicleta implements Autovehicul {
    private String marca;
    private double costReparatie;

    public Motocicleta(String marca, double costReparatie) {
        this.marca = marca;
        this.costReparatie = costReparatie;
    }

    @Override
    public double getCostReparatie() {
        return costReparatie;
    }

    @Override
    public String getDescriere() {
        return "Motocicleta: " + marca + ", Cost reparatie: " + costReparatie + " RON";
    }
}
