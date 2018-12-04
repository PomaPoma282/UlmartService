package ru.itpark.domain;

public class Smartphone extends Product {
    private String model;
    private String color;

    public Smartphone(int id, String name, int price, String description, String category, String vercion, String color) {
        super(id, name, price, description, category);
        this.model = vercion;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
