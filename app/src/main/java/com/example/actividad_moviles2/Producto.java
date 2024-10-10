package com.example.actividad_moviles2;

public class Producto {
    private String name;
    private String price;
    private int imageResource;

    public Producto(String name, String price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }
}
