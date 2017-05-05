package Ballena;


import java.awt.Toolkit;
import javax.swing.*;
 
public class MapaBallena {
 
        public MapaBallena(){
                JFrame frame = new JFrame();
                frame.add(new BoardBallena(frame));
                frame.setTitle("WildDex");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400,700);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setIconImage( Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/logo.png")) );
                frame.setResizable(false);
        }
        public static void main(String[] args){
                new MapaBallena();
        }
        
        
}