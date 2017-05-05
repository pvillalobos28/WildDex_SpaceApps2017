package WildDexPrincipal;

import Ballena.InfoBallena;
import Ballena.whale;
import Cardenalito.InfoCardenal;
import Jaguar.InfoJaguar;
import Mapas.BancoMapas;
import Murcielago.InfoMurcielago;
import java.awt.*;
import javax.swing.*;
 
public class Board extends JPanel {
    
            Frame daddy;
        boolean prueba=true,onetime=true,oneclick=true;
        public Image ImageFondo,ImageBoton,ImageWhale,ImageCardenal,ImageJaguar,ImageMurcielago,ImagenName;
        Timer time;
        whale w;
        Meses ListaMeses;
        int wx=0,wy=0,constanteVolver=1,conteoMapa=0;
        
        BancoMapas bm;
        Image arreglo[];
        
        ImageIcon IconFondo,IconBoton,IconWhale;
        
        public Board(Frame daddy) {
            
            this.daddy = daddy;
            addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
            
            addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
      
                IconBoton = (new ImageIcon(getClass().getResource("/Recursos/back_Button.png")));
                IconWhale = (new ImageIcon(getClass().getResource("/AnimalesImages/Whales/BallenaSpr01.png")));
                ImageCardenal = (new ImageIcon(getClass().getResource("/AnimalesImages/Cardenal/CardenalSpr01.png"))).getImage();
                ImageJaguar = (new ImageIcon(getClass().getResource("/AnimalesImages/Jaguar/Jaguarspr1.png"))).getImage();
                ImageMurcielago = (new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielagospr1.png"))).getImage();
                ImagenName = (new ImageIcon(getClass().getResource("/Recursos/NamesNull.png"))).getImage();
                
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
                   
              // pintarMovientoBallenaGris(g2d);
               
               }
               if(onetime)g2d.drawImage(ImageWhale, -5, 160, null);
               
                if(onetime)g2d.drawImage(ImageCardenal, 252, 447, null);
               
               if(onetime)g2d.drawImage(ImageJaguar, 215, 543, null);
               
               if(onetime)g2d.drawImage(ImageMurcielago, 141, 305, null);
               
                if(onetime)g2d.drawImage(ImagenName, 48, 30, null);
               
               
             g.drawImage(buffer, 0, 0, null);
        
      
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {}
        }

        
  private void formMouseClicked(java.awt.event.MouseEvent evt) {                                  

   
       if(evt.getY()>185 && evt.getY()<208 && evt.getX()>0 && evt.getX()<40){
         if(oneclick){
             oneclick=false;
           InfoBallena inf=new InfoBallena();
           inf.setVisible(true);
           daddy.setVisible(false);
         }
           
       }
       
       if(evt.getY()>447 && evt.getY()<485 && evt.getX()>252 && evt.getX()<287){
         if(oneclick){
             oneclick=false;
           InfoCardenal inf=new InfoCardenal();
           inf.setVisible(true);
           daddy.setVisible(false);
         }
           
       }
       
       if(evt.getY()>314 && evt.getY()<355 && evt.getX()>149 && evt.getX()<190){
         if(oneclick){
             oneclick=false;
           InfoMurcielago inf=new InfoMurcielago();
           inf.setVisible(true);
           daddy.setVisible(false);
         }
           
       }
       
       if(evt.getY()>554 && evt.getY()<600 && evt.getX()>225 && evt.getX()<267){
         if(oneclick){
             oneclick=false;
           InfoJaguar inf=new InfoJaguar();
           inf.setVisible(true);
           daddy.setVisible(false);
         }
           
       }

       
       
       
       
       
      
       
       
    }     

private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {                                  
      // System.out.println("("+evt.getX()+","+evt.getY()+")");
   
 
       
       if(evt.getY()>185 && evt.getY()<208 && evt.getX()>0 && evt.getX()<40){
        ImageWhale = (new ImageIcon(getClass().getResource("/AnimalesImages/Whales/BallenaSpr02.png"))).getImage();  
        ImagenName = (new ImageIcon(getClass().getResource("/Recursos/NamesGrayWhale.png"))).getImage();
       }
       else 
           if(evt.getY()>447 && evt.getY()<485 && evt.getX()>252 && evt.getX()<287){
        ImageCardenal = (new ImageIcon(getClass().getResource("/AnimalesImages/Cardenal/CardenalSpr02.png"))).getImage();  
        ImagenName = (new ImageIcon(getClass().getResource("/Recursos/NamesFlycatcher.png"))).getImage();
       }
           else 
           if(evt.getY()>554 && evt.getY()<600 && evt.getX()>225 && evt.getX()<267){
        ImageJaguar = (new ImageIcon(getClass().getResource("/AnimalesImages/Jaguar/Jaguarspr2.png"))).getImage();  
        ImagenName = (new ImageIcon(getClass().getResource("/Recursos/NamesJaguar.png"))).getImage();
       }
           else 
           if(evt.getY()>314 && evt.getY()<355 && evt.getX()>149 && evt.getX()<190){
        ImageMurcielago = (new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielagospr2.png"))).getImage();  
        ImagenName = (new ImageIcon(getClass().getResource("/Recursos/NamesBat.png"))).getImage();
       }
           
           else {
                ImageWhale = (new ImageIcon(getClass().getResource("/AnimalesImages/Whales/BallenaSpr01.png"))).getImage();
                ImageCardenal = (new ImageIcon(getClass().getResource("/AnimalesImages/Cardenal/CardenalSpr01.png"))).getImage();
                ImageJaguar = (new ImageIcon(getClass().getResource("/AnimalesImages/Jaguar/Jaguarspr1.png"))).getImage();  
                ImageMurcielago = (new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielagospr1.png"))).getImage();  
                ImagenName = (new ImageIcon(getClass().getResource("/Recursos/NamesNull.png"))).getImage();
           } 
       
    }     
        
  private void pintarRutaBallenaGris(Graphics2D g2d){
  
      
      
      for (int i = 0; i < (w.getCordeandasX()).length; i++) {
        g2d.setColor(new Color(124,0,0));
        g2d.fillOval((w.getCordeandasX())[i]-5, (w.getCordeandasY())[i]-5, 4,4);  
      }

  }
  
  private void pintarMovientoBallenaGris(Graphics2D g2d){
          pintarRutaBallenaGris(g2d);
  g2d.drawImage(ImageWhale, (w.getCordeandasX())[wx]-15, (w.getCordeandasY())[wy]-12, null);
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
              
  }
        
        
}