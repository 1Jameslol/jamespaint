package main;

import java.awt.Image;
import java.awt.Taskbar;
import java.awt.Toolkit;
import java.net.URL;

public class setMacIconImage {
    public void setMacIconImage() {
        final Toolkit defaultToolkit = Toolkit.getDefaultToolkit();
        final URL imageResource = Main.class.getClassLoader().getResource("draw.png");
        Image image = defaultToolkit.getImage(imageResource);
        
        //this is new since JDK 9
        final Taskbar taskbar = Taskbar.getTaskbar();

        try {
            //set icon for mac os (and other systems which do support this method)
            taskbar.setIconImage(image);
        } catch (final UnsupportedOperationException e) {
            System.out.println("The os does not support: 'taskbar.setIconImage'");
        } catch (final SecurityException e) {
            System.out.println("There was a security exception for: 'taskbar.setIconImage'");
        }
    }
}
