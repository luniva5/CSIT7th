/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowExample extends JFrame{
    JTextField t1,t2;
    JLabel l1;
    public void setWindow(){
           t1 = new JTextField(20);
           t2 = new JTextField(20);
           l1 = new JLabel("Result");
           add(t1);
           add(t2);
           add(l1);
           t1.addFocusListener(new FocusListener(){
               @Override
               public void focusGained(FocusEvent e) {
                   l1.setText("focus gain on textfield");
                   //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }

               @Override
               public void focusLost(FocusEvent e) {
                   l1.setText("focus lost on textfield");
                   //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               }
           
           });
        //handling window
         addWindowListener(new WindowListener(){
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("window opened");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosing(WindowEvent arg0) {
                System.out.println("window Closing");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("window Closed");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("window minimized");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("window maximized");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("window activated");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("window deactivated");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
            
        });
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class WindowEventDemo {
    public static void main(String[] args) {
        WindowExample we = new WindowExample();
        we.setWindow();
    }
}
