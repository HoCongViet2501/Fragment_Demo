package com.example.fragment_demo.entity;

public class Shoes {
    private String name;
    private String action;
    private int img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public Shoes(String name, String action, int img) {
        this.name = name;
        this.action = action;
        this.img = img;
    }
}
