import javax.swing.*;
import java.awt.*;

public class matchfield extends JFrame{
    //final Attributes for apperance of the Gui
    //width of Border arround the matchfield
    private final int BORDER_WIDTH = 3;
    //Nummber of colums on the board
    private final int MATCHFIELD_NUMOFCOLUMS = 12;
    private final int MATCHFIELD_NUMOFROWS = 24;






    public matchfield(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240,480);
        setResizable(false);
        setTitle("Graphice");
        init();
    }
    JPanel Spielfeld = new JPanel(new GridLayout(MATCHFIELD_NUMOFROWS,MATCHFIELD_NUMOFCOLUMS));
    public void init(){
        setLayout(new BorderLayout());
        Box[][] Boxes= new Box[MATCHFIELD_NUMOFCOLUMS][MATCHFIELD_NUMOFROWS];
        for(int j=0;j<=(MATCHFIELD_NUMOFROWS-1);j++){
            for(int i=0;i<=(MATCHFIELD_NUMOFCOLUMS-1);i++){
                if(j==0||i==(MATCHFIELD_NUMOFCOLUMS-1)||i==0){
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
