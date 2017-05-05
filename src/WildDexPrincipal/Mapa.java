package WildDexPrincipal;


import WildDexPrincipal.Board;
import java.awt.Toolkit;
import javax.swing.*;
 
public class Mapa {
 
        public Mapa(){
                JFrame frame = new JFrame();
                frame.add(new Board(frame));
                frame.setTitle("WildDex");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400,700);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
                frame.setResizable(false); 
                frame.setTitle("WildDex");
                frame.setIconImage( Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/logo.png")) );
    
        }
        public static void main(String[] args){
                new Mapa();
        }
        
        
}