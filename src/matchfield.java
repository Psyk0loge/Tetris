import javax.swing.*;
import java.awt.*;

public class matchfield extends JFrame{
    Box s;
    public matchfield(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240,480);
        setResizable(false);
        setTitle("Graphice");
        init();
    }
    JPanel Spielfeld = new JPanel(new GridLayout(24,12));
    public void init(){
        setLayout(new BorderLayout());
        Box[][] Boxes= new Box[12][24];
        for(int j=0;j<=23;j++){
            for(int i=0;i<=11;i++){
                if(j==0||i==11||i==0){
                    Boxes[i][j]= new Box(i,j,true);
                    Spielfeld.add(Boxes[i][j]);
                }else {
                    Boxes[i][j] = new Box(i,j, false);
                    Spielfeld.add(Boxes[i][j]);
                }
            }

        }
        add(Spielfeld,BorderLayout.CENTER);
        JLabel a = new JLabel("Hallo");
        add(a,BorderLayout.EAST);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args){
        new matchfield();
    }
}
