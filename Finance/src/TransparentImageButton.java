import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class TransparentImageButton extends JComponent implements MouseListener {

    private BufferedImage image = null;
    private File imageFile;
    private List<ActionListener> listeners;

    public TransparentImageButton(File imageFile) throws IOException {
        this.imageFile = imageFile;
        this.image = ImageIO.read(imageFile);
        this.addMouseListener(this);
        this.listeners = new ArrayList<ActionListener>();
    }

    public void addActionListener(ActionListener listener) {
        listeners.add(listener);
    }

    @Override
    protected void paintComponent(Graphics g) { 
        super.paintComponent(g);
        Rectangle r = getImageBounds();
        g.drawImage(image, r.x, r.y, r.width, r.height, this);
    }


    private Rectangle getImageBounds() {
        // TODO Add in proper handling if component size < image size.
        return new Rectangle((int)((getBounds().width-image.getWidth())/2), (int)((getBounds().height-image.getHeight())/2), image.getWidth(), image.getHeight());
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Add more action events?
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Rectangle bounds = getImageBounds();
        if(bounds.contains(e.getPoint())) {
            int ix = e.getX()-bounds.x;
            int iy = e.getY()-bounds.y;
            int [] arr = image.getData().getPixel(ix, iy, new int[4]);
            // get the alpha for the current pixel
            if(arr[3] != 0) {
                // not transparent
                ActionEvent newActionEvent = new ActionEvent(this, ActionEvent.ACTION_PERFORMED, imageFile.getName(), e.getWhen(), e.getModifiers());
                for(ActionListener listener : listeners) {
                    listener.actionPerformed(newActionEvent);
                }
            }
        } else {
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Add more action events?
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Add more action events?
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Add more action events?
    }
} 