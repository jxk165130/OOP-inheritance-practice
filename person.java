package com.example.lib;

public class person extends car {

    @Override
    public int getYear() {
        return super.getYear() + 1000;
    }

    @Override
    public String getMake() {
        return super.getMake() + " Japan";
    }
    
    //example of using toString
    @Override
    public String toString() {
        return this.getYear() + ", " +  this.getMake();

    }
}
