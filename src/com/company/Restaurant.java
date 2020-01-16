package com.company;

public class Restaurant {
    public static void main(String[] args) {
        // create several instances of MenuItem
        MenuItem pork = new MenuItem(4.99, "Pork", "Main Course");
        MenuItem chicken = new MenuItem(2.99, "Chicken", "Main Course");
        MenuItem iceCream = new MenuItem(1.49, "Ice Cream", "Dessert");
        MenuItem chips = new MenuItem(4.55, "Unlimited Chips", "Appetizer");

        // create menu and add items to it
        Menu theMenu = new Menu();
        theMenu.addMenuItem(pork);
        theMenu.addMenuItem(chicken);
        theMenu.addMenuItem(iceCream);
        theMenu.addMenuItem(chips);

        // print menu
        theMenu.printMenu();

        // print individual item
        iceCream.toString();

        // make an item not new, remove an item, then reprint menu
        theMenu.menuItemNoLongerNew(pork);
        theMenu.removeMenuItem(chicken);
        theMenu.printMenu();
    }
}
