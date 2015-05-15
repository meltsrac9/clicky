import javax.swing.*;
import java.awt.*; 
import javax.imageio.*;
import java.awt.image.*;
import java.applet.*;

/**
 * Class Coffee - write a description of the class here
 * 
 * @Rachel Meltser
 * @5/14/2015
 */
public class Coffee extends JApplet
{
    private Image coffeeCup;
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
    }
}