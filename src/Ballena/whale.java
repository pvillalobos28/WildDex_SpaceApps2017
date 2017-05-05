/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ballena;

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
public class whale extends Thread{
    volatile Graphics g;
    public Image ImageWhale;
        
        
        ImageIcon IconWhale;
    private int[] cordeandasX = { 6,7,10,12,14,15,18,20,21,24,26,27,29,31,33,36,40,45,48,53,57,61,71,77,81,84,86,90,96,98,94,94,92,91,93,97,102,105,112,116,119,123,125,128,133,137,146,149,149,153,153,150,148,146,142,142,141,140
    };
    private int[] cordeandasY = {255,255,255,256,257,258,258,258,258,258,258,258,258,258,257,256,256,255,255,253,253,255,256,262,265,270,277,286,292,297,304,308,312,320,325,329,333,337,342,344,348,354,356,360,362,364,368,368,364,361,355,351,347,342,340,338,336,336
    };
    //23
    public whale () {
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
