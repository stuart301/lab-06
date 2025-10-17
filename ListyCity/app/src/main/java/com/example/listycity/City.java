package com.example.listycity;


/**
 *  This is a class that defines a City.
 */
public class City implements Comparable {


    /**
     * Compares cities based on name.
     * @param o the object to be compared.
     */
    @Override
    public int compareTo(Object o) {
        City city = (City) o; //Typecasting object o to a City type
        return this.city.compareTo(city.getCity());
    }

    private String city;
    private String province;

    /**
     * Constructor for a city object
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This is a getter function for a City object's city attribute
     * @returns this.city
     * the city attribute to return
     */
    String getCity() {
        return this.city;
    }

    /**
     * getter class for the City object's province attribute
     * @return this.province
     * the province attribute of the City object
     */

    String getProvince(){
        return this.province;

    }

    /**
     * sets the city attribute of the City object
     * @param city
     * the city name to set the object's city attribute value to.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This is the setter method for the province attribute of the city class
     * @param province
     * This is the name to set the city object's province attribute value to.
     */
    public void setProvince(String province) {
        this.province = province;
    }
}

