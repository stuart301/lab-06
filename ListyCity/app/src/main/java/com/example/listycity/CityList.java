package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks if a city is in the list and deletes it if so.
     * @param city
     * this is the city to check for.
     */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This checks if a city is in the list
     * @param city
     * this is the city to check for
     * @return Boolean
     * This is the true or false value of whether the city is in the list
     */
    public Boolean hasCity (City city){
        if (cities.contains(city)) {
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    /**
     * retrieves the length of the city list
     * @return len
     * this is the length of the city list
     */
    public int countCities(){
        int len;
        len = cities.toArray().length;
        return len;
    };
}
