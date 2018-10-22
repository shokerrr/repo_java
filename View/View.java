package com.testwork.demo.View;

import javax.swing.*;

public class View extends JDialog {
    public JPanel contentPane;
    public JButton buttonAdd;
    public JTextArea textArea1;
    public JList list1;
    //SWING уже не используют


    public View() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonAdd);
    }

}
