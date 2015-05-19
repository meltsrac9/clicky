import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.applet.*;

/**
 * Class Coffee - write a description of the class here
 * 
 * @Rachel Meltser
 * @5/14/2015
 */
public class Coffee extends JApplet implements MouseListener, ActionListener
{
    private Image coffeeCup;
    private int score, multiplier=1;
    public Button b1,b2,b3;
    public void init(){
        //instantiates coffee cup
        coffeeCup=getImage(getDocumentBase(), "cup-of-black-coffee1.jpg");
        //creates buttons
        Button b1 = new Button("2X Multiplier");
        Button b2 = new Button("3X Multiplier");
        Button b3 = new Button("5X Multiplier");
        this.add(b1);//makes the entire applet a button -->need to change its size
        b1.addActionListener(this);//makes it button-y
        
    }
    public void paint(Graphics g)
    {
        super.paint(g);    
        int x = 0;
        int y = 0;
        int width = 500;
        int height = 450;
        //draws coffee cup
        g.drawImage(coffeeCup, x, y, width, height, this);
        g.drawString("Score: "+score,25,25);        
    }
    public void mouseClicked(MouseEvent me){
        score+=multiplier;        
        repaint();
    } 
    public void mouseEntered(MouseEvent me){
        
    } 
    public void mousePressed(MouseEvent me){
        
    } 
    public void mouseReleased(MouseEvent me){
        
    } 
    public void mouseExited(MouseEvent me){
        
    } 
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            if(score>=100){
                score-=100;
                multiplier*=2;
            }
        }
        if(e.getSource()==b2){
            if(score>=500){
                score-=500;
                multiplier*=3;
            }
        }
        if(e.getSource()==b3){
            if(score>=1000){
                score-=1000;
                multiplier*=5;
            }
        }
    }
}