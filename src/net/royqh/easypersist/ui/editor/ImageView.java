package net.royqh.easypersist.ui.editor;

import javax.swing.*;
import java.awt.*;

public class ImageView extends JComponent {
    private Image image=null;
    private Dimension dimension=new Dimension();

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
        if (image==null) {
            dimension=new Dimension();
        } else {
            dimension = new Dimension(image.getWidth(null), image.getHeight(null));
        }
        repaint();
    }


    @Override
    protected void paintComponent(Graphics graphics) {
        Graphics g=getComponentGraphics(graphics);
        g.setColor(this.getBackground());
        g.fillRect(0,0,getWidth(),getHeight());
        if (image!=null){
            g.drawImage(image,0,0,null);
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return dimension;
    }

}
