package com.testwork.demo.Controller;


import com.testwork.demo.DAO.Model;
import com.testwork.demo.View.View;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.swing.event.ActionEvent;

public class Controller {
    private Model model;
    private View view;


    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.buttonAdd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                onClick();
            }
        });
    }


    private void onClick() {

        String text = view.textArea1.getText();


        if(text.isEmpty()){
            //System.out.println("Empty");

        }
        else{
            //передаем данные
            //System.out.println("Woo!");

            model.setName(text);

            view.list1.setListData(model.createVector());

        }
    }
}
