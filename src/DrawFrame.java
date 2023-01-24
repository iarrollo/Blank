import javax.swing.*;
import java.awt.*;

public class DrawFrame
{
    public static void main(String[] args)
    {

        JFrame myFrame = new JFrame();
        myFrame.setSize(500,300);
        MyDrawPanel myPanel= new MyDrawPanel();
        BallPanel myBPanel= new BallPanel();

        myFrame.add(myBPanel);
        myFrame.setVisible(true);

    }



}
