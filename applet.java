import java.applet.*;
import java.awt.*;
/* <applet code="applet.class" height="600" width="600"></applet> */
public class applet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello",100,100);
        setBackground(Color.RED);
        g.drawLine(50,50,100,100);
        g.drawRect(30,40,60,70);
        g.drawOval(25,25,40,40);
    }
}