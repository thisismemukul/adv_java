import java.awt.*;
import java.applet.*;
/*<applet code="banner.class" height="700" width="800"></applet> */
public class banner extends Applet implements Runnable{
    String msg ="This is me Mukul ";
    char ch;
    int x1=150,y1=150,r1=60,r2=60;
    boolean flag = true;
    Thread t = null;
    public void start(){
        t= new Thread(this);
        flag = false;
        t.start();
    }
    public void run(){
        for(;;){
            try {
                repaint();
                Thread.sleep(1000);
                ch = msg.charAt(0);
                msg = msg.substring(1,msg.length());
                msg = msg + ch;
                x1=x1+10;
                if(flag){
                    break;
                }
            } catch (Exception e) {
                System.out.println("Error "+e);
            }
        }
    }
    public void paint(Graphics g){
        g.drawString(msg,100,100);
        g.setColor(Color.GREEN);
        g.fillOval(x1,y1,r1,r2);
    }
}