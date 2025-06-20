/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prj_padrao_observer;

import java.util.ArrayList;

/**
 *
 * @author Alexssander
 */
public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    
    public WeatherData(){
        observers = new ArrayList();
    }

    
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        
        this.temperature=temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
        
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    
    
    
    
    
    
    
}
