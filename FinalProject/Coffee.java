import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*; 
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.applet.*;
import java.net.URL;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
/**
 * Class Coffee - write a description of the class here
 * 
 * @Rachel Meltser
 * @5/14/2015
 */
public class Coffee extends JApplet implements MouseListener, ActionListener
{
    private ImageIcon cup, cup2;
    public int score=1000, multiplier=1;
    public JButton b1,b2,b3;
    Container c;
    public void init(){
        //instantiates coffee cup
        try{
            URL imageURL = new URL(getDocumentBase(), "cup-of-black-coffee1.jpg");

            Image coffeeCup=getImage(imageURL);
            cup = new ImageIcon(coffeeCup);
        }
        catch(Exception e){}
        //creates buttons
        JButton b1 = new JButton("2X Multiplier");
        JButton b2 = new JButton("3X Multiplier");
        JButton b3 = new JButton("5X Multiplier");
        
        c = getContentPane();
        c.setLayout(new FlowLayout());
        //inserts image
        c.add(new JLabel(cup));
        
        //inserts buttons
        c.add(b1);
        c.add(b2);
        c.add(b3);
        
        //makes buttons clickable
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        addMouseListener(new MouseAdapter() {
                //supposed to make the picture clickable
                @Override
                public void mouseClicked(MouseEvent e) {

                    //trying to see if it at least works
                    try{
                        URL imageURL2 = new URL(getDocumentBase(), "cup-of-black-coffee2.jpg");

                        Image coffeeCup2=getImage(imageURL2);
                        cup2 = new ImageIcon(coffeeCup2);
                    }
                    catch(Exception m){}
                }

            });

    }

    public void paint(Graphics g)
    {
        super.paint(g); //only works with the call --?   
        g.drawString("Score: "+score,25,25);//score doesn't update (assuming the buttons work)        
    }

    public void mouseClicked(MouseEvent me){
        score+=multiplier;        
        //repaint();
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
        //without diagnostics, method works; can display picture so long as window is resized
        if(e.getSource()==b1){//Problem with getSource()
            try{
                URL imageURL2 = new URL(getDocumentBase(), "cup-of-black-coffee2.jpg");

                Image coffeeCup2=getImage(imageURL2);
                cup2 = new ImageIcon(coffeeCup2);
                c = getContentPane();
                c.add(new JLabel (cup2));
                repaint();                
            }
            catch(Exception m){}//this definitely should work
            if(score>=100){
                score-=100;
                multiplier*=2;
                repaint();

            }
        }
        if(e.getSource()==b2){
            if(score>=500){
                score-=500;
                multiplier*=3;
                repaint();
            }
        }
        if(e.getSource()==b3){
            if(score>=1000){
                score-=1000;
                multiplier*=5;
                repaint();
            }
        }
    }
}