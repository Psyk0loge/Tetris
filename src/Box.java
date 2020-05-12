import javax.swing.*;
import java.awt.*;

public class Box extends JPanel {
    int x=0;
    int y=0;
    boolean randblock;
    public Box(int x, int y,boolean randblock){
        this.x=x;
        this.y=y;
        this.randblock=randblock;
        repaint();
    }


    public void paint(Graphics g){
        if(randblock==true){
            g.setColor(Color.ORANGE);
        }else{
            g.setColor(Color.GRAY);
        }
        g.fillRect(0,0,20,20);
        g.setColor(Color.black);
        g.drawRect(0,0,20,20);

    }
}
