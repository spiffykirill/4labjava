package Lab4;

import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class JImageDisplay extends JComponent {

    private BufferedImage image;
    JImageDisplay(int shir, int visota){
        image= new BufferedImage( shir, visota, BufferedImage.TYPE_INT_RGB);
        Dimension imageDimension=new Dimension(shir, visota);
        super.setPreferredSize(imageDimension);
    }
    @Override
    public void  paintComponent (Graphics g){
        super.paintComponent (g);
        g.drawImage(image, 0, 0, image.getWidth(), image.getHeight(), null);
    }
    public  void clearImage (){
        int[] blank=new int[getWidth()*getHeight()];
        image.setRGB(0, 0, getWidth(), getHeight(), blank, 0, 1);

    }
    public  void drawPixel (int x, int y, int rgbColor){
        image.setRGB(x,y , rgbColor);
   }
}
