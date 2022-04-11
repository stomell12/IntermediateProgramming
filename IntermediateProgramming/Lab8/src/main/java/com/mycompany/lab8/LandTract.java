/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab8;

/**
 *
 * @author sam13
 */
public class LandTract {
    private double length;
    private double width;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public LandTract(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;

    }

    public String toString(){

        return "The area of the land tract is " + getArea() + " square units.";
    }

    
    public boolean equals(LandTract obj){
        if (length * width == obj.getArea()){
            return true;
        } else {
            return false;
        }
    }
}