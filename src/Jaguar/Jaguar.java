/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jaguar;

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
public class Jaguar extends Thread{
    volatile Graphics g;
    public Image ImageWhale;
        
        
        ImageIcon IconWhale;
    private int[] cordeandasX = { 234,233,232,228,228,228,227,227,227,227,227,227,226,226,226,226,226,226,226,226,226,226,229,228,228,229,229,229,230,231,233,234,236,237,237,238,238,238,235,234,231,227,225,223,220,219,218,217,216,214,214,214,214,214,214,215,216,217,217,218,218,218,218,218,219,219,217,216,214,212,204,199,192,190,189,188,179,177,174,172,170,168,167,164,164,163
    };
    private int[] cordeandasY = { 571,571,568,567,564,561,560,559,557,555,553,550,546,543,541,540,536,534,532,530,527,525,520,518,516,512,509,506,505,502,497,495,489,487,484,480,475,470,467,465,462,460,458,454,453,449,449,446,442,440,437,434,430,427,424,420,417,411,409,405,403,399,397,393,391,390,389,388,385,384,375,370,365,363,362,360,355,354,352,350,348,346,343,341,339,338
    };
    //23
    public Jaguar () {
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
