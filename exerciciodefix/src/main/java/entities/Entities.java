/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.List;

/**
 *
 * @author marcos
 */
public class Entities {

    private String name;
    private int years_old;
    private int quantity_request;
    private double height;

    public Entities() {
    }

    public Entities(String name, int years_old, int quantity_request, double height) {
        this.name = name;
        this.years_old = years_old;
        this.height = height;
        this.quantity_request = quantity_request;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears_old() {
        return years_old;
    }

    public void setYears_old(int years_old) {
        this.years_old = years_old;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getQuantity_request() {
        return quantity_request;
    }

    public void setQuantity_request(int quantity_request) {
        this.quantity_request = quantity_request;
    }
    public int yearsMin(int porcent) {

        return yearsMin(porcent);
    }

    public double avarege_Height(double avarege_height) {

        return avarege_Height(avarege_height);
    }

    public String toString() {
        return "names:" +getName()+"\nidade: "+getYears_old();
    }

}
