
package Mapas;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author mario
 */
public class BancoMapas {
    
    private Image[] arreglo;
    
    public BancoMapas(){
    arreglo = new Image[20];
    arreglo[0]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-01.png"))).getImage();
    arreglo[1]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-02.png"))).getImage();
    arreglo[2]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-03.png"))).getImage();
    arreglo[3]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-04.png"))).getImage();
    arreglo[4]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-05.png"))).getImage();
    arreglo[5]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-06.png"))).getImage();
    arreglo[6]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-07.png"))).getImage();
    arreglo[7]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-08.png"))).getImage();
    arreglo[8]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-09.png"))).getImage();
    arreglo[9]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-10.png"))).getImage();
    arreglo[10]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-11.png"))).getImage();
    arreglo[11]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-12.png"))).getImage();
    arreglo[12]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-13.png"))).getImage();
    arreglo[13]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-14.png"))).getImage();
    arreglo[14]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-15.png"))).getImage();
    arreglo[15]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-16.png"))).getImage();
    arreglo[16]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-17.png"))).getImage();
    arreglo[17]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-18.png"))).getImage();
    arreglo[18]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-19.png"))).getImage();
    arreglo[19]=(new ImageIcon(getClass().getResource("/Mapas/Mapa Continente America-20.png"))).getImage();
    }
    
    public Image[] getImages(){
    return arreglo;
    }
    
}
