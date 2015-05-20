import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import javax.imageio.*;
import java.awt.image.*;
import java.applet.*;
import java.net.URL;
/**
 * Class Coffee - write a description of the class here
 * 
 * @Rachel Meltser
 * @5/14/2015
 */
public class Coffee extends JApplet implements MouseListener, ActionListener
{
    private ImageIcon cup;
    private int score, multiplier=1;
    public JButton b1,b2,b3;
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
        Container c = getContentPane();

        c.setLayout(new FlowLayout());
        c.add(new JLabel(cup));
        

        c.add(b1);
        c.add(b2);
        c.add(b3);
        b1.addActionListener(this);//makes it button-y
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    public void paint(Graphics g)
    {
        super.paint(g);    
        int x = 0;
        int y = 0;
        int width = 500;
        int height = 450;
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