package com.pong.nattpong.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contryId;
    private String contryName;
    private double area;
    private Integer population;
    private String flage;
    public Integer getContryId() {
        return contryId;
    }
    public void setContryId(Integer contryId) {
        this.contryId = contryId;
    }
    public String getContryName() {
        return contryName;
    }
    public void setContryName(String contryName) {
        this.contryName = contryName;
    }
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public Integer getPopulation() {
        return population;
    }
    public void setPopulation(Integer population) {
        this.population = population;
    }
    public String getFlage() {
        return flage;
    }
    public void setFlage(String flage) {
        this.flage = flage;
    }
    
}
