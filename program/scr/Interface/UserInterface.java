package Interface;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;


    @Override
    public void run() {
        this.frame = new JFrame("NetflixStatistix");
        this.frame.setPreferredSize(new Dimension(1024, 600));
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setVisible(true);
    }

    private void createComponents(Container container) {


    }

    public JFrame getFrame() {
        return frame;
    }
}