package ru.itpark.domain;

public class Smartphone extends Product {
    private String vercion;
    private String color;

    public Smartphone(int id, String name, int price, String description, String category, String vercion, String color) {
        super(id, name, price, description, category);
        this.vercion = vercion;
        this.color = color;
    }

    public String getVercion() {
        return vercion;
    }

    public void setVercion(String vercion) {
        this.vercion = vercion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
