/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class GridDemo extends JFrame{
    JButton b1,b2,b3,b4,b5,b6;
    public void setBorder(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        b3 = new JButton("button3");
        b4 = new JButton("button4");
        b5 = new JButton("button5");
        b6 = new JButton("button6");
        setVisible(true);
        setSize(400,400);
        setLayout(new GridLayout(2,3));
        setDefaultCloseOperation(3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
    }
}
public class GridLayoutDemo {
    public static void main(String[] args) {
        GridDemo gd = new GridDemo();
        gd.setBorder();
    }
}
