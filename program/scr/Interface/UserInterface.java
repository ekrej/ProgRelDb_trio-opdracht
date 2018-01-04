package Interface;


import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;


    @Override
    public void run() {
        this.frame = new JFrame("NetflixStatistix");
        this.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //changes background to dark grey
        Color color = new Color(38, 38, 38);
        this.frame.getContentPane().setBackground(color);

        this.frame.setPreferredSize(new Dimension(1024, 600));
        createComponents(this.frame.getContentPane());

        this.frame.pack();
        this.frame.setLocationRelativeTo(null);
        this.frame.setVisible(true);
    }



    private void createComponents(Container container) {


    }

    public JFrame getFrame() {
        return frame;
    }
}