/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment.assignment;
import java.util.ArrayList;

public class GeneralInfo {
    private String address;
    private int numberOfFloors;
    private int numberOfUnits;
    private ArrayList<String> facilities;

    public GeneralInfo(String location, int numberOfFloors, int numberOfUnits, ArrayList<String> facilities) {
        this.address = location;
        this.numberOfFloors = numberOfFloors;
        this.numberOfUnits = numberOfUnits;
        this.facilities = facilities;
    }

    public String getLocation() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public ArrayList<String> getFacilities() {
        return facilities;
    }

    public void setLocation(String address) {
        this.address = address;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    public void setFacilities(ArrayList<String> facilities) {
        this.facilities = facilities;
    }

    public void viewGeneralInfo() {
        System.out.println("Location: " + address);
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Units: " + numberOfUnits);
        System.out.println("Facilities: " + facilities);
    }
}
