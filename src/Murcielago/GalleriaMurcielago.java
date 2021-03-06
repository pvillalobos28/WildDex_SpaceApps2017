package Murcielago;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Shary
 */
public class GalleriaMurcielago extends javax.swing.JFrame {
    Image bReturn, bLeft, bRight, fondo;
    Image[] ballenas=new Image[6];
    Graphics g, k;
    int i=0, j=1;
    boolean onetime=true;
    boolean oneclick=true;

    /**
     * Creates new form GalleriaBallena
     */
    public GalleriaMurcielago() {
        initComponents();
        g=jPanel1.getGraphics();
        k=jPanel2.getGraphics();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("WildDex");
        this.setIconImage( Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Recursos/logo.png")) );
        this.setLocationRelativeTo(null);
        super.setSize(407,725);
    }
    
    @Override
        public void paint(Graphics g) {
            update(g);
            repaint();
             }
    
    @Override
        public void update(Graphics g){   
            
        if(onetime){cargarImagenes();
        onetime=false;
        }
        cargarBat();
        dibujar(i, j);
        }
    
    public void cargarImagenes(){
        bReturn=(new ImageIcon(getClass().getResource("/Recursos/ButtonsReturn.png"))).getImage();
        bLeft=(new ImageIcon(getClass().getResource("/Recursos/ButtonsLeft.png"))).getImage();
        bRight=(new ImageIcon(getClass().getResource("/Recursos/ButtonsRight.png"))).getImage();
        fondo=(new ImageIcon(getClass().getResource("/Recursos/Sky.png"))).getImage();
        
        g.drawImage(fondo, 0, 0, null);
        g.drawImage(bReturn, 15, 15, null);
        g.drawImage(bLeft, 5, 600, null);
        g.drawImage(bRight, 330, 600, null);
        
    }
    
    public void cargarBat(){
        ballenas[0]=(new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielago1.jpg"))).getImage();
        ballenas[1]=(new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielago2.jpg"))).getImage();
        ballenas[2]=(new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielago3.jpg"))).getImage();
        ballenas[3]=(new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielago4.jpg"))).getImage();
        ballenas[4]=(new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielago5.jpg"))).getImage();
        ballenas[5]=(new ImageIcon(getClass().getResource("/AnimalesImages/Murcielago/murcielago6.jpg"))).getImage();
    
    
    }
    
    public void dibujar(int i, int j){
        this.i=i;
        this.j=j;
        try{
            cargarImagenes();
            k.drawImage(ballenas[i], 0, 15, null);
            if(j!=5)k.drawImage(ballenas[j], 0, 300, null);
        }catch(Exception ex){
            System.out.println("Exception:"+ex);
        }
    }
            
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, "Card1");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        dibujar(i, j);
    }//GEN-LAST:event_formWindowActivated

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        if(evt.getY()>600 && evt.getY()<650 && evt.getX()> 5 && evt.getX()<55){
            if(i>0 && j>1){
                i-=2;
                j-=2;
                dibujar(i, j);
            }
        }

        if(evt.getY()>600 && evt.getY()<650 && evt.getX()> 330 && evt.getX()<380){
            if(i<4 && j<5){
                i+=2;
                j+=2;
                dibujar(i, j);
            }
        }

        if(evt.getY()>23 && evt.getY()<63 && evt.getX()>23 && evt.getX()<63){
            if(oneclick){
                oneclick=false;
            
            //System.out.println("Sali");
            InfoMurcielago m=new InfoMurcielago();
            m.setVisible(true);
            this.setVisible(false);
            }
        }
    }//GEN-LAST:event_jPanel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GalleriaMurcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GalleriaMurcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GalleriaMurcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GalleriaMurcielago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GalleriaMurcielago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
