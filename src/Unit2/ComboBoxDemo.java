/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
class ListCombo extends JFrame{
    JComboBox j1;
    JList j2;
    JLabel l1,l2;
    JTable tb1;
    public void setList(){
        String country[]={"Nepal","India","Australia","Japan"};
        String courses[]={"CSIT","BIT","BCA","BIM","BHM","BBA","BBS","BE","BSC","BDS","MBBS"};
        //for table header
        String [] header={"id","name","gender","faculty","grade"};
        String [][]data={
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
                {"1","Ram","Male","CSIT","A+"},
        };
        j1 = new JComboBox(country);
        j2 = new JList(courses);
        l1 = new JLabel("result for combo box");
        l2 = new JLabel("result for list");
        tb1 = new JTable(data,header);
        tb1.setPreferredScrollableViewportSize(new Dimension (250,100));
        //for scroll bar
        JScrollPane sc = new JScrollPane(j2);
        JScrollPane sc1 = new JScrollPane(tb1);
        add(sc1);
        add(j1);
        add(sc);
        add(l1);
        add(l2);
        
        //SELECTION MODE 0single, 2 multiple, 1 single with interval
        j2.setSelectionMode(2);
        //combo throws two event: action and itemevent
        j1.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                String country = (String)j1.getSelectedItem();
                l1.setText("Your country is "+country);
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        //event handling for JList
        //listselectionevent
        j2.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String str="";
                ArrayList <String> st = (ArrayList)j2.getSelectedValuesList();
                for(String var:st){
                    str+=var;
                    
                }
                l2.setText("Your courses are "+str+",");
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        });
        
        setVisible(true);
        setLayout(new FlowLayout());
        setSize(400,400);
        setDefaultCloseOperation(3);
    }
}
public class ComboBoxDemo {
    public static void main(String[] args) {
           ListCombo lc = new ListCombo();
           lc.setList();
    }
}
