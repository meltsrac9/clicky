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
public class Coffee extends JApplet 
{
    private ImageIcon cup, cup2;
    public int score=0, multiplier=1;
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
        JButton b1 = new JButton("2X Multiplier (requires 500 points)");
        //         JButton b2 = new JButton("3X Multiplier (requires 500 points)");
        //         JButton b3 = new JButton("5X Multiplier (requires 1000 points)");

        c = getContentPane();
        c.setLayout(new FlowLayout());
        //inserts image
        c.add(new JLabel(cup));

        //inserts buttons
        c.add(b1);
        //         c.add(b2);
        //         c.add(b3);

        //makes buttons clickable
        b1.addActionListener(new MyButtonListener());
        //         b2.addActionListener(new MyButtonListener());
        //         b3.addActionListener(new MyButtonListener());

        addMouseListener(new MouseAdapter() {
                //sHE LIVES!!!!!
                @Override
                public void mouseClicked(MouseEvent e) {

                    //trying to see if it at least works
                    score+=multiplier;
                    repaint();
                }

            });

    }

    public void paint(Graphics g)
    {
        super.paint(g); //only works with the call --?
        g.drawString("Coffee Clicker: Java Edition",25,20);
        g.drawString("Score: "+score,25,35);//score doesn't update (assuming the buttons work)
        g.drawString("Click the cup to raise your score!",25,50);
        g.drawString("Get as high a score until you get bored!",25,65);
    }

    private class MyButtonListener implements ActionListener{
        
        //make constructors for 1,2,3 etc
        public void actionPerformed(ActionEvent e){

            if(score>=500){
                score-=500;
                multiplier*=2;
                repaint();
            }
            //             if(e.getSource()==b1){//Problem with getSource()
            //                 if(score>=100){
            //                     score-=100;
            //                     multiplier*=2;
            //                     repaint();
            // 
            //                 }
            //             }
            //             if(e.getSource()==b2){
            //                 if(score>=500){
            //                     score-=500;
            //                     multiplier*=3;
            //                     repaint();
            //                 }
            //             }
            //             if(e.getSource()==b3){
            //                 if(score>=1000){
            //                     score-=1000;
            //                     multiplier*=5;
            //                     repaint();
            //                 }
            //             }
        }
    }
}