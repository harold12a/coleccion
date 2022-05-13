package com.principal;

public class Propiedad {

    private String ubicacion;
    private String region;
    private double valor;
    private Integer area;

    public Propiedad(String ubicacion, String region, double valor, Integer area) {
        this.ubicacion = ubicacion;
        this.region = region;
        this.valor = valor;
        this.area = area;
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
