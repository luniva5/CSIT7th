/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class KeyExample extends JFrame {
    JTextField t1;
    JLabel l1;
    public void setKey(){
        t1 = new JTextField(20);
        l1 = new JLabel("Result");
        add(t1);
        add(l1);
        t1.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
                l1.setText("Key Typed");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                l1.setText("Key Pressed is "+e.getKeyChar());
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
                l1.setText("Key Released is "+e.getKeyChar());
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
}
public class KeyEventDemo{
    public static void main(String[] args) {
        KeyExample ke = new KeyExample();
        ke.setKey();
    }
}