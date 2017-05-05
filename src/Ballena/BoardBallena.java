package Ballena;

import Mapas.BancoMapas;
import WildDexPrincipal.Meses;
import java.awt.*;
import javax.swing.*;
 
public class BoardBallena extends JPanel {
    
        Frame daddy;
        boolean prueba=true,onetime=false,stop=false;
        public Image ImageFondo,ImageBoton,ImageWhale;
        Timer time;
        whale w;
        Meses ListaMeses;
        int wx=0,wy=0,constanteVolver=1,guardado=0,conteoMapa=0;
        boolean oneclick=true;
        BancoMapas bm;
        Image arreglo[];
        ImageIcon IconFondo,IconBoton,IconWhale;
        public BoardBallena(Frame daddy) {
            this.daddy = daddy;
            addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
      
           
                
                IconBoton = (new ImageIcon(getClass().getResource("/Recursos/back_Button.png")));
                IconWhale = (new ImageIcon(getClass().getResource("/AnimalesImages/Whales/BallenaSpr01.png")));
                
                ImageBoton = IconBoton.getImage();
                ImageWhale = IconWhale.getImage();
               
                w = new whale();
                ListaMeses = new Meses();
                
                bm = new BancoMapas();
                arreglo = bm.getImages();
        }
 
        
 
        @Override
        public void paint(Graphics g) {
            update(g);
            repaint();
             }
 
        @Override
        public void update(Graphics g){        
                       super.paint(g);
                Image buffer = createImage(getWidth(), getHeight());
                       Graphics2D g2d = (Graphics2D) buffer.getGraphics();
                       

               ImageFondo = arreglo[conteoMapa++];
               if(conteoMapa==20) conteoMapa=0;
                       
                       g2d.drawImage(ImageFondo, 0, 0, null);
                if(!prueba) g2d.drawImage(ImageBoton, 271, 592, null);
                
               
               if(!onetime)
               {
                   
                   //pintarRutaBallenaGris(g2d);
               pintarMovientoBallenaGris(g2d);
               
               }
               if(onetime)g2d.drawImage(ImageWhale, -5, 160, null);
               
               g2d.drawImage((new ImageIcon(getClass().getResource("/Recursos/ButtonsReturn.png"))).getImage(), 15, 15, null);
        
               g2d.drawImage((new ImageIcon(getClass().getResource("/Recursos/ButtonsStop.png"))).getImage(), 300, 590, null);
        
             g.drawImage(buffer, 0, 0, null);
        
      
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {}
        }

        
  private void formMouseClicked(java.awt.event.MouseEvent evt) {                                  
       //System.out.println("("+evt.getX()+","+evt.getY()+")");
   
       if(evt.getY()>600 && evt.getY()<693 && evt.getX()>310 && evt.getX()<351){
           if(!stop){stop=true;
           guardado = wx;
           wx=200;
           wy=200;
           }
           else if(stop){
               stop=false;
            wx = guardado;
            wy = guardado;
           }
           
       
          // System.out.println("Entre a stop");
       }

       if(evt.getY()>163 && evt.getY()<185 && evt.getX()>0 && evt.getX()<25){
       }
       
       if(evt.getY()>23 && evt.getY()<63 && evt.getX()>23 && evt.getX()<63){
           if(oneclick){
                oneclick=false;
           InfoBallena ifb = new InfoBallena();
           ifb.setVisible(true);
           daddy.setVisible(false);
           }
       }
       

       
       
       
      
       
       
    }       
        
  private void pintarRutaBallenaGris(Graphics2D g2d){
  
      
      
      for (int i = 0; i < (w.getCordeandasX()).length; i++) {
        g2d.setColor(new Color(124,0,0));
        g2d.fillOval((w.getCordeandasX())[i]-5, (w.getCordeandasY())[i]-5, 4,4);  
      }
      
       for (int i = 0; i < (w.getCordeandasX()).length; i++) {
        g2d.setColor(new Color(124,0,0));
        g2d.fillOval((w.getCordeandasX())[i]-5, (w.getCordeandasY())[i]-5, 4,4);  
      }



  }
  
  private void pintarMovientoBallenaGris(Graphics2D g2d){
          pintarRutaBallenaGris(g2d);
          if(stop){
       wx=guardado;
         wy=guardado;
  }
  g2d.drawImage(ImageWhale, (w.getCordeandasX())[wx]-30, (w.getCordeandasY())[wy]-30, null);
  wx=wx+constanteVolver;
              wy=wy+constanteVolver;
              if(wx==(w.getCordeandasX()).length){
              constanteVolver=constanteVolver*-1;
              wx=(w.getCordeandasX()).length-1;
              wy=(w.getCordeandasX()).length-1;
              }
              
              if(wx==0){
              constanteVolver=constanteVolver*-1;
              wx=0;
              wy=0;
              }
              if(constanteVolver==1){
                if(wx>(int)((w.getCordeandasX()).length/4)-5 && wx<(int)((w.getCordeandasX()).length/4)*2-5) g2d.drawImage(ListaMeses.getImageSeptiembre(),33,590,null);
             if(wx>(int)((w.getCordeandasX()).length/4)*2 && wx<(int)((w.getCordeandasX()).length/4)*3) g2d.drawImage(ListaMeses.getImageOctubre(),33,590,null);
             if(wx>(int)((w.getCordeandasX()).length/4)*3+6 && wx<(int)((w.getCordeandasX()).length/4)*4+6) g2d.drawImage(ListaMeses.getImageNoviembre(),33,590,null);
             if(wx>(int)((w.getCordeandasX()).length/4)*4 && wx<(int)((w.getCordeandasX()).length)) g2d.drawImage(ListaMeses.getImageDiciembre(),33,590,null);
             
  }          
              
              if(constanteVolver==-1){
                  if(wx>(int)((w.getCordeandasX()).length/4)*4-5 && wx<(int)((w.getCordeandasX()).length/4)) g2d.drawImage(ListaMeses.getImageEnero(),33,590,null);
             if(wx>(int)((w.getCordeandasX()).length/4)*3 && wx<(int)((w.getCordeandasX()).length/4)*4-5) g2d.drawImage(ListaMeses.getImageFebrero(),33,590,null);
             if(wx>(int)((w.getCordeandasX()).length/4)*2 && wx<(int)((w.getCordeandasX()).length/4)*3) g2d.drawImage(ListaMeses.getImageMarzo(),33,590,null);
             if(wx>(int)((w.getCordeandasX()).length/4)-5 && wx<(int)((w.getCordeandasX()).length/4)*2-5) g2d.drawImage(ListaMeses.getImageAbril(),33,590,null);
             }
              
       //   }
  }
            
        
}