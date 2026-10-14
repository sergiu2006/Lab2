package org.example.Model;

public class Camion implements Autovehicul {
    private String marca;
    private double costReparatie;
    public Camion(String marca, double costReparatie) {
        this.marca = marca;
        this.costReparatie = costReparatie;
    }
    @Override
    public double getCostReparatie() {
        return costReparatie;
    }
    @Override
    public String getDescriere() {
        return "Camion: " + marca + ", Cost reparatie: " + costReparatie + " RON";
    }
}