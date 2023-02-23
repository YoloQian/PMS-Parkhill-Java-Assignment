/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;

public class Unit {
    private String unitID;
    private int floorNumber;
    private int numberOfRooms;
    private int squareFeet;
    private String unitType;
    private Property property;
    private String residentID;

    public Unit(String unitID, int floorNumber, int numberOfRooms, int squareFeet, String unitType, Property property, String residentID) {
        this.unitID = unitID;
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.squareFeet = squareFeet;
        this.unitType = unitType;
        this.property = property;
        this.residentID = residentID;
    }

    public String getUnitID() {
        return unitID;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public String getUnitType() {
        return unitType;
    }

    public Property getProperty() {
        return property;
    }

    public String getResidentID() {
        return residentID;
    }
    
    public void setResidentID(String residentId) {
        this.residentID = residentId;
    }

    public void manageUnit() {
        // code to manage the unit
    }

    public void viewUnit() {
        // code to view the unit
    }
}

