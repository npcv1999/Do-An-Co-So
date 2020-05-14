package com.example.congtimviecit;

public class Country {

    private String countryName;

    // Image name (Without extension)
    private String flagName;
    private String population;

    public Country(String countryName, String flagName, String population) {
        this.countryName= countryName;
        this.flagName= flagName;
        this.population= population;
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

    @Override
    public String toString()  {
        return this.countryName+" \nVị trí: "+ this.population+"";
    }
}