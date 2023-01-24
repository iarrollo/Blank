import javax.swing.*;
import java.awt.*;
public class MyDrawPanel extends JPanel
{
    //variables constructors methods
    public MyDrawPanel()
    {
        setBackground(Color.GREEN);
    }

    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLUE);
        g.setColor(Color.RED);
        g.fillOval(100, 200, 100,100);
        g.drawOval(100,200,20,20);
    }
}