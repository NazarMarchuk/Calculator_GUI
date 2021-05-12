package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;


public class CalcGUI extends JFrame {
    private JButton button = new JButton("Result");
    private JTextField x_str = new JTextField("", 1);
    private JTextField y_str = new JTextField("", 1);
    private JLabel label_x = new JLabel ("Input x:");
    private JLabel label_y = new JLabel ("Input y:");
    private JCheckBox pls = new JCheckBox ("+");
    private JCheckBox mns = new JCheckBox ("-");
    private JCheckBox mlt = new JCheckBox ("*");
    private JCheckBox dev = new JCheckBox ("/");


    public CalcGUI (){
        super("Calculator");
        this.setBounds(100, 100, 500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(10, 5, 5, 10));
        container.add(label_x);
        container.add(x_str);

        container.add(pls);
        container.add(mns);
        container.add(mlt);
        container.add(dev);

        container.add(label_y);
        container.add(y_str);

        button.addActionListener(new ButtonEventListener());

        container.add(button);

    }

    class ButtonEventListener implements ActionListener {
        public void actionPerformed (ActionEvent e){
            float x, y, res;
            String message = "";
            x = Integer.parseInt(x_str.getText());
            y = Integer.parseInt(y_str.getText());
            if (pls.isSelected()) {
                res = x + y;
                message += res;
            }
            else if (mns.isSelected()){
                res = x + y;
                message += res;
            }
            else if (mlt.isSelected()){
                res = x * y;
                message += res;
            }
            else if (dev.isSelected()){
                res = x / y;
                message += res;
            }
            else{
                message = "Chose the operation" ;
            }


            JOptionPane.showMessageDialog(null, message, "Result", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
