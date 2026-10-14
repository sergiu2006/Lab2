package model;

public class Masina implements Autovehicul {
    private String marca;
    private double costReparatie;

    public Masina(String marca, double costReparatie) {
        this.marca = marca;
        this.costReparatie = costReparatie;
    }

    @Override
    public double getCostReparatie() {
        return costReparatie;
    }

    @Override
    public String getDescriere() {
        return "Masina: " + marca + ", Cost reparatie: " + costReparatie + " RON";
    }
}