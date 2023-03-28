package systemproperties;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SystemScreenResolution {
    public static void main(String[] args) {
        Toolkit properties = Toolkit.getDefaultToolkit();
        Dimension dimension = properties.getScreenSize();
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight();

        System.out.println("Sua tela tem resolução de: " + width + " x " + height);
    }
}
