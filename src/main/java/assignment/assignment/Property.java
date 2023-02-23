/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

import java.util.ArrayList;

public class Property {
    private String propertyID;
    private String address;
    private int numberOfUnits;
    private int numberOfFloors;
    private ArrayList<String> facilities;

    public Property(String propertyID, String address, int numberOfUnits, int numberOfFloors, ArrayList<String> facilities) {
        this.propertyID = propertyID;
        this.address = address;
        this.numberOfUnits = numberOfUnits;
        this.numberOfFloors = numberOfFloors;
        this.facilities = facilities;
    }

    public String getPropertyID() {
        return propertyID;
    }

    public void setPropertyID(String propertyID) {
        this.propertyID = propertyID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public ArrayList<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }
}
