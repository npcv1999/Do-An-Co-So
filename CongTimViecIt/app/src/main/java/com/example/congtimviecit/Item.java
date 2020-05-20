package com.example.congtimviecit;

public class Item {

    private String countryName;

    // Image name (Without extension)
    private String flagName;
    private String population;
    private String luongView;

    public Item(String countryName, String luongView,String flagName, String population) {
        this.countryName= countryName;
        this.flagName= flagName;
        this.population= population;
        this.luongView= luongView;

    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName;
    }

    public String getLuong() {
        return luongView;
    }

    public void setLuong(String luongView) {
        this.luongView = luongView;
    }

    @Override
    public String toString()  {
        return this.countryName+"\nMức lương: "+ this.luongView+" \nVị trí: "+ this.population+"";
    }
}