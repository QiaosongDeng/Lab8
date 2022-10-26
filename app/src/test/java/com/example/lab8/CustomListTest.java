package com.example.lab8;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    @Test
    public void addCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }
//
    @Test
    public void hasCityTest(){
        list = new CustomList(null, new ArrayList<City>());
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertTrue(list.hasCity(city));
    }

//    @Test
//    public void deleteCityTest(){
//        list = new CustomList(null, new ArrayList<City>());
//        City city = new City("Estevan", "SK");
//        list.addCity(city);
//        assertTrue(list.hasCity(city));
//        list.deleteCity(city);
//        assertFalse(list.hasCity(city));
//    }

}
