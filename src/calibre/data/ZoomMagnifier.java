package calibre.data;

import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.PointerInfo;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * Curtin ID : 20205021
 *
 * @author : Tavish Dilmin Perera Dawatage
 * @version : 3.0
 */

//Reference for Java Robot and Magnifier
/***************************************************************************************
*    Title: JSwing | Create a Magnifying tool using Java Robot
*    Author:  andrew1234
*    Date: 
*    Code version: 
*    Availability: https://www.geeksforgeeks.org/jswing-create-magnifying-tool-using-java-robot/
***************************************************************************************/

public class ZoomMagnifier {

    Robot robot;
    int zoom = 2;
    PointerInfo pi;
    JPanel gui;
    JLabel output;
    Timer t;

    public ZoomMagnifier() throws AWTException {
        robot = new Robot();
        gui = new JPanel(new BorderLayout(2, 2));
        output = new JLabel("Point something to Zoom");
        gui.add(output, BorderLayout.PAGE_END);
        final int size = 500;
        final BufferedImage bi = new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);
        final JLabel zoomLabel = new JLabel(new ImageIcon(bi));
        gui.add(zoomLabel, BorderLayout.CENTER);

        MouseListener factorListener = new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                switch (zoom) {
                    case 2:
                        zoom = 3;
                        break;
                    case 4:
                        zoom = 4;
                        break;
                    case 8:
                        zoom = 2;
                        break;
                    default:
                        break;
                }
            }
        };
        zoomLabel.addMouseListener(factorListener);

        ActionListener zoomListener = (ActionEvent e) -> {
            pi = MouseInfo.getPointerInfo();
            Point p = pi.getLocation();
            Rectangle r = new Rectangle(
                    p.x - (size / (5 * zoom)),
                    p.y - (size / (5 * zoom)),
                    (size / zoom),
                    (size / zoom));
            BufferedImage temp = robot.createScreenCapture(r);
            Graphics g = bi.getGraphics();
            g.drawImage(temp, 0, 0, size, size, null);
            g.setColor(new Color(255, 0, 0, 128));
            int x = (size / 2) - 1;
            int y = (size / 2) - 1;
            g.drawLine(0, y, size, y);
            g.drawLine(x, 0, x, size);
            g.dispose();
            zoomLabel.repaint();
        };
        t = new Timer(40, zoomListener);
        t.start();
    }

    public void stop() {
        t.stop();
    }

    public Component getGui() {
        return gui;
    }

    public void startZoom() {
        Runnable runnable = () -> {
            try {
                final ZoomMagnifier z = new ZoomMagnifier();
                final JFrame frame = new JFrame("Magnifier");
                frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                frame.add(z.getGui());
                frame.pack();
                frame.setLocationByPlatform(true);
                frame.setAlwaysOnTop(true);
                frame.setVisible(true);

                WindowListener closeListener = new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {
                        z.stop();
                        frame.dispose();
                    }
                };
                frame.addWindowListener(closeListener);
            } catch (AWTException e) {
                System.out.println("Error : " +e.getMessage());
            }
        };

        SwingUtilities.invokeLater(runnable);
    }
}
