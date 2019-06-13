package com.example.lib;

public class car {

    private String model;
    private String make;
    private int year;

    public car(){

    };

    public car(String model, int year, String make) {
        this.model = model;
        this.year = year;
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
