/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Move;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author YannickAdmin
 */
public class Frame extends JFrame {
    
    private Screen screen;
    
    float player_posx = 400;
    float player_posy = 400;
    private final int player_size = 50;
    
    
    
    
    private boolean key_up = false;
    private boolean key_down = false;
    private boolean key_left = false;
    private boolean key_right = false;
    
    public Frame() {
        
        super ("Move");
        screen = new Screen();
        screen.setBounds(0,0,800,600);
        add (screen);
        addKeyListener(new KeyHandler());
        
    }
    
    public boolean getUp(){
        return key_up;
}
     
    public boolean getDown(){
        return key_down;
}
     
    public boolean getRight(){
        return key_right;
}
     
    public boolean getLeft(){
        return key_left;
}
     
    
    public void repaintScreen() {
     screen.repaint();
}

    


    
    private class Screen extends JLabel {
        
        @Override
        protected void paintComponent (Graphics g) {
            
            super.paintComponent (g);
            g.setColor(Color.GREEN);
            g.fillRect((int)player_posx,(int)player_posy, player_size , player_size);
        }
    }
    
    private class KeyHandler implements KeyListener{

       
       
    
   
  
    @Override
    public void keyPressed (KeyEvent e){
        if (e.getKeyCode()== KeyEvent.VK_S)key_down = true;
        if (e.getKeyCode()== KeyEvent.VK_W)key_up = true;
        if (e.getKeyCode()== KeyEvent.VK_D)key_right = true;
        if (e.getKeyCode()== KeyEvent.VK_A)key_left = true;
        
        
    }
    
    
    @Override
    public void keyReleased (KeyEvent e){
        if (e.getKeyCode()== KeyEvent.VK_S)key_down = false;
        if (e.getKeyCode()== KeyEvent.VK_W)key_up = false;
        if (e.getKeyCode()== KeyEvent.VK_D)key_right = false;
        if (e.getKeyCode()== KeyEvent.VK_A)key_left = false;
        
        



    }

        @Override
        public void keyTyped(KeyEvent ke) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

       
    
    
    }
}
