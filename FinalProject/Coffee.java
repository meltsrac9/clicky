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
public class Coffee extends JApplet implements MouseListener
{
    private Image coffeeCup;
    private int score;
    public void init(){
        coffeeCup=getImage(getDocumentBase(), "cup-of-black-coffee1.jpg");
    }
    public void paint(Graphics g)
    {
        super.paint(g);    
        int x = 0;
        int y = 0;
        int width = 500;
        int height = 450;        
        g.drawImage(coffeeCup, x, y, width, height, this);
        g.drawString("Score: "+score,25,25);
    }
    public void mouseClicked(MouseEvent me){
        score++;
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
}