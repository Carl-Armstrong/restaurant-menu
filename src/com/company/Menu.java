package com.company;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private static LocalDate lastUpdated;
    private ArrayList<MenuItem> menuArray;

    public Menu () {
        this.lastUpdated = java.time.LocalDate.now();
        this.menuArray = new ArrayList<MenuItem>();
    }

    //getters
    public LocalDate getLastUpdated() {
        return lastUpdated;
    }
    public ArrayList<MenuItem> getMenuArray() {
        return menuArray;
    }

    //setters
    public void updateLastUpdated() {
        this.lastUpdated = java.time.LocalDate.now();
    }
    public void addMenuItem(MenuItem newMenuItem) {
        this.menuArray.add(newMenuItem);
        this.updateLastUpdated(); // automatically changes lastUpdated to date item was added
    }

    public void removeMenuItem(MenuItem lameMenuItem) {
        this.menuArray.remove(menuArray.indexOf(lameMenuItem));
    }

    public void menuItemNoLongerNew(MenuItem existingMenuItem) {
        existingMenuItem.setIsNew(false);
    }

    public void printMenu() {
        System.out.println("\n*** MENU *** (Updated: " + this.getLastUpdated() + ")");
        for (MenuItem item: this.menuArray) {
            System.out.println(item.toString());
        }
    }
}
