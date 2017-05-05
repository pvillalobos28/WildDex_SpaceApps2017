/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Murcielago;

import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author mario
 */
public class murcielago extends Thread{
    volatile Graphics g;
    public Image ImageWhale;
        
        
        ImageIcon IconWhale;
    private int[] cordeandasX = { 157,154,154,154,154,154,154,154,154,154,154,155,155,155,156,159,160,162,163,165,166,168,169,170,172,173,174,175,176,177,181,181,182,184,186,187,189
    };
    private int[] cordeandasY = { 316,319,320,321,323,326,327,329,331,334,336,337,338,341,343,345,348,349,349,349,350,350,351,351,352,354,354,355,356,357,359,362,363,363,363,363,363 };
    //23
    public murcielago () {
//    start();
//    this.g=g;
//    IconWhale = (new ImageIcon(getClass().getResource("/Recursos/whale.png")));
//    ImageWhale = IconWhale.getImage();
    }
    
//    public void run(){
//    while(true){
//    
//        for (int i = 0; i < 23; i++) {
//            g.drawImage(ImageWhale,cordeandasX[i]-15,cordeandasY[i]-12,null);
//            try {
//                this.sleep(200);
//            } catch (InterruptedException ex) {}
//        }
//        for (int i = 22; i < -1; i--) {
//            g.drawImage(ImageWhale,cordeandasX[i]-15,cordeandasY[i]-12,null);
//            try {
//                this.sleep(200);
//            } catch (InterruptedException ex) {}
//        }
//        
//    }
//    
//    }
//    

    public int[] getCordeandasX() {
        return cordeandasX;
    }

    public void setCordeandasX(int[] cordeandasX) {
        this.cordeandasX = cordeandasX;
    }

    public int[] getCordeandasY() {
        return cordeandasY;
    }

    public void setCordeandasY(int[] cordeandasY) {
        this.cordeandasY = cordeandasY;
    }
    
    
    
    
    public void setGraphics(Graphics g){this.g=g;}
}
