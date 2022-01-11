import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="mouse.class" height="800" width="800"></applet> */

public class mouse extends Applet implements MouseListener,MouseMotionListener{
    String msg = "";
    int x=0,y=0;
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void mouseMoved(MouseEvent me){
        showStatus("Mouse moved at :"+me.getX()+me.getY());
        repaint();
    }
    public void mouseDragged(MouseEvent me){
        showStatus("Mouse Dragged at :"+me.getX()+me.getY());
        repaint();
    }
    public void mouseEntered(MouseEvent me){
        showStatus("Mouse Entered at :"+me.getX()+me.getY());
        repaint();
    }
    public void mouseExited(MouseEvent me){
        showStatus("Mouse Exited at :"+me.getX()+me.getY());
        repaint();
    }
    public void mousePressed(MouseEvent me){
        showStatus("Mouse Pressed at :"+me.getX()+me.getY());
        repaint();
    }
    public void mouseReleased(MouseEvent me){
        showStatus("Mouse Released at :"+me.getX()+me.getY());
        repaint();
    }
    public void mouseClicked(MouseEvent me){
        showStatus("Mouse Clicked at :"+me.getX()+me.getY());
        repaint();
    }

    public void paint(Graphics g){
        g.drawString(msg,x,y);
    }
}