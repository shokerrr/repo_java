package com.testwork.demo;

import com.testwork.demo.Controller.Controller;
import com.testwork.demo.DAO.Model;
import com.testwork.demo.View.View;

public class Main {
    public static void main(String[] args) {
        View dialog = new View();
        Model model = new Model();

        Controller controller = new Controller(model, dialog);

        dialog.pack();
        dialog.setVisible(true);


        System.exit(0);
    }
}
