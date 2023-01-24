import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class BallPanel extends JPanel{

    int x=100;
    int y=1;
    int xSpeed=3;
    int ySpeed=3;

    Ball[] balls= new Ball[1];
    Ball myball = new Ball(33, 33,33);

    DrawBall(g);
    public BallPanel(){
        setFocusable(True);
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            System.out.println(e.getKeyCode());
            int keyCode=e.getKeyCode();
            if (keyCode==)
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        setBackground(Color.orange);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(x, y, 20, 20);
        x+=xSpeed;
        y+=ySpeed;

        if(x>=480||x<=0){
            xSpeed*=-1;
            ySpeed*=-1;
        }

        try{
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint(); //This refreshes the screen
    }









}