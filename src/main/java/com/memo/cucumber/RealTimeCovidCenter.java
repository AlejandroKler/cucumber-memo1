package com.memo.cucumber;

import java.util.HashMap;
import java.util.Map;

public class RealTimeCovidCenter {

    private Map<String, Country> countryMap = new HashMap<>();

    public void createCountry(String countryName, Integer hab) {
        countryMap.put(countryName, Country.builder()
                .name(countryName)
                .hab(hab)
                .cases(0)
                .build());
    }

    public void addCases(String countryName, Integer cases) {
        Country country = countryMap.get(countryName);
        country.setCases(country.getCases() + cases);
    }

    public void removeCases(String countryName, Integer cases) {
        addCases(countryName, - cases);
    }

    public int getCountryCases(String countryName) {
        return countryMap.get(countryName).getCases();
    }

    public double getCountryCasesPerHab(String countryName) {
        Country country = countryMap.get(countryName);
        return country.getCases().doubleValue() / country.getHab();
    }
}
