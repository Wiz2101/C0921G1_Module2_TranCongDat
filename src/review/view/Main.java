package review.view;

import review.controllers.MenuController;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        menuController.displayMenu();
    }
}

