/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.GestionFormation.controller.tests;

/**
 *
 * @author Ayoub
 */
public class Car
{
    public String model;
    public String make;

    public Car(String model, String make)
    {
        this.model = model;
        this.make = make;
    }

    public Car()
    {
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getMake()
    {
        return make;
    }

    public void setMake(String make)
    {
        this.make = make;
    }

    @Override
    public String toString()
    {
        return "car{" + "model=" + model + ", make=" + make + '}';
    }
    
}
