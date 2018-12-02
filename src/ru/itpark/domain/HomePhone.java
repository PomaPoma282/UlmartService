package ru.itpark.domain;

public class HomePhone extends Product {
    private String type;

    public HomePhone(int id, String name, int price, String description, String category, String type) {
        super(id, name, price, description, category);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
