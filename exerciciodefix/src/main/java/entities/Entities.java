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

    public String toString() {

        int menores = 0;
        double alturaTotal = 0 , alturaMedia, percentualMenores;
        for (int i = 0; i < getQuantity_request(); i++) {
            if (years_old < 16) {
                menores++;
            }
            alturaTotal = height + height;
        }
        alturaMedia = alturaTotal / quantity_request;
        percentualMenores = ((double) menores / quantity_request) * 100;
        
        
        return "\nAltura media ="+alturaMedia+"\nPessoas com menos de 16 anos:\n"+percentualMenores;
        
    }

}
