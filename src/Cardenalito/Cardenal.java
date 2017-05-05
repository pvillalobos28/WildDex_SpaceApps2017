/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cardenalito;

import Ballena.*;
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
public class Cardenal extends Thread{
    volatile Graphics g;
    public Image ImageWhale;
        
        
        ImageIcon IconWhale;
    private int[] cordeandasX1 = { 287,286,284,281,278,277,274,274,273,271,270,269,266,265,265,265,264,264,264,264,264,262,262,260,259,258,257,256,253,252,251,250,249,246,245,244,242,241,239,237,236,234,229,228,225,224,224,222
 };
    private int[] cordeandasY1 = { 485,485,484,481,480,479,477,474,472,472,468,467,466,464,461,460,458,456,453,451,447,444,440,438,435,431,428,425,422,418,416,415,414,411,410,408,407,404,403,402,401,401,397,397,396,395,393,392
 };
    
    private int[] cordeandasX2 = { 171,166,157,157,136,132,132,133,135,137
 };
    private int[] cordeandasY2 = { 351,348,339,326,295,287,282,280,279,277
 };
    //23
    public Cardenal () {
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

    public int[] getCordeandasX1() {
        return cordeandasX1;
    }

    public void setCordeandasX1(int[] cordeandasX1) {
        this.cordeandasX1 = cordeandasX1;
    }

    public int[] getCordeandasY1() {
        return cordeandasY1;
    }

    public void setCordeandasY1(int[] cordeandasY1) {
        this.cordeandasY1 = cordeandasY1;
    }

    public int[] getCordeandasX2() {
        return cordeandasX2;
    }

    public void setCordeandasX2(int[] cordeandasX2) {
        this.cordeandasX2 = cordeandasX2;
    }

    public int[] getCordeandasY2() {
        return cordeandasY2;
    }

    public void setCordeandasY2(int[] cordeandasY2) {
        this.cordeandasY2 = cordeandasY2;
    }

 
    
    
    
    public void setGraphics(Graphics g){this.g=g;}
}
