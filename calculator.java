import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="calculator.class" height="600" width="700"></applet> */
public class calculator extends Applet implements ActionListener{
    Button b1 = new Button("ADD");
    Button b2 = new Button("SUB");
    Button b3 = new Button("MUL");
    Button b4 = new Button("DIV");
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    TextField t3 = new TextField(10);
    Label l1 = new Label("Number 1");
    Label l2 = new Label("Number 2");
    Label l3 = new Label("Result");
    public void init(){
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" "+(n1+n2));
        }
        if(ae.getSource()==b2){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" "+(n1-n2));
        }
        if(ae.getSource()==b3){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" "+(n1*n2));
        }
        if(ae.getSource()==b4){
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            t3.setText(" "+(n1/n2));
        }
    }
}