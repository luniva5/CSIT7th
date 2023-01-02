/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MenuExample extends JFrame{
    JMenuBar mb;//to create menubar
    JMenu file,edit,view;//to create item in menubar
    JMenuItem f1, f2,f3;//item list for file menu
    JMenuItem e1, e2,e3;//item list for edit menu
    JMenuItem v1, v2,v3;//item list for view menu
    public void setMenu(){
        mb = new JMenuBar();
        file = new JMenu("file");
        edit = new JMenu("edit");
        view = new JMenu("view");
        f1 = new JMenuItem("new");
        f2 = new JMenuItem("new window");
        f3 = new JMenuItem("open");
        e1 = new JMenuItem("copy");
        e2 = new JMenuItem("cut");
        e3 = new JMenuItem("paste");
        v1 = new JMenuItem("zoom");
        v2 = new JMenuItem("status");
        v3 = new JMenuItem("cancel");
        //adding menu item into menu
        file.add(f1);file.add(f2);file.add(f3);
        edit.add(e1);edit.add(e2);edit.add(e3);
        view.add(v1);view.add(v2);view.add(v3);
        //adding menubar into JFrame
        mb.add(file);
        mb.add(edit);
        mb.add(view);
        add(mb);
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setDefaultCloseOperation(3);
    }
}
public class MenuDemo {
    public static void main(String[] args) {
        MenuExample me = new MenuExample();
        me.setMenu();
    }
}
