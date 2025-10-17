package com.example.listycity;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CityListTest {
    private CityList mockCityList() {
        CityList cityList = new CityList();
        cityList.add(mockCity());
        return cityList;
    }
    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @Test
    void testAdd() {
        CityList cityList = mockCityList();
        assertEquals(1, cityList.getCities().size());
        City city = new City("Regina", "Saskatchewan");
        cityList.add(city);
        assertEquals(2, cityList.getCities().size());
        assertTrue(cityList.getCities().contains(city));
    }


    @Test
    void testAddException() {
        CityList cityList = mockCityList();
        City city = new City("Yellowknife", "Northwest Territories");
        cityList.add(city);
        assertThrows(IllegalArgumentException.class, () -> {
            cityList.add(city);
        });
    }

    @Test
    void testGetCities() {
        CityList cityList = mockCityList();
        // This line checks if the first city in the cityList (retrieved by cityList.getCities().get(0))
        // is the same as the city returned by mockCity()
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(0)));
        // This pushes down the original city
        City city = new City("Charlottetown", "Prince Edward Island");
        cityList.add(city);
        // Now the original city should be at position 1
        assertEquals(0, city.compareTo(cityList.getCities().get(0)));
        assertEquals(0, mockCity().compareTo(cityList.getCities().get(1)));
    }

    @Test
    void testHasCity(){
        CityList cityList = mockCityList();
        City city = new City ("Calgary","Alberta");
        assertFalse(cityList.hasCity(city)); //should return false
        cityList.add(city); //add the city
        assertTrue(cityList.hasCity(city)); //should now return true after it has been deleted
    }

    @Test
    void testDelete(){
        CityList cityList = mockCityList();
        City city = new City ("Sydney","Nova Scotia");
        cityList.add(city);
        assertTrue(cityList.hasCity(city)); //should evaluate to true before deletion
        cityList.delete(city); //delete the city
        assertFalse(cityList.hasCity(city)); //now it should evaluate to false
    }

    @Test
    void testCountCities(){
        CityList cityList = mockCityList();
        assertEquals(1,cityList.countCities());
        City city = new City("Norman Wells", "Northwest Territories");
        cityList.add(city);
        assertEquals(2,cityList.countCities());
    }

}


