package com.example.demo.model;

public class Car {
    private int id;
    private String name;
    private String color;
    private String firm;
    private int price;

    public Car() {
    }

    public Car(int id, String name, String color, String firm, int price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.firm = firm;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
