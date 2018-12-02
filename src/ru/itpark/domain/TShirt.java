package ru.itpark.domain;

public class TShirt extends Product {
    private String color;
    private String size;

    public TShirt(int id, String name, int price, String description, String category, String color, String size) {
        super(id, name, price, description, category);
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "TShirt{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
