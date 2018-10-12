package com.testwork.demo;

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
