package Interface;


import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable{

        private JFrame Frame;
        private JPanel Main;
        private JPanel Buttons;
        private JSplitPane SplitPane;
        private Color color1 = new Color(38, 38, 38);
        private Color color2 = new Color(77,77,77);



    @Override
    public void run() {

           // initializing panels
           this.Frame = new JFrame();
           this.Main = new JPanel();
           this.Buttons = new JPanel();
           this.SplitPane= new JSplitPane();

           this.Frame.setSize(1024,600);
           this.Frame.setVisible(true);
           this.Frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

           //settin size of pannels
           this.Main.setSize(850, 600);
           this.Buttons.setSize(174, 600);

           //setting color of panels
           this.Main.setBackground(color1);
           this.Buttons.setBackground(color2);

           //setting to visible
           this.Main.setVisible(true);
           this.Buttons.setVisible(true);

            //splitpane settings
            this.SplitPane.setSize(1024,600);
            this.SplitPane.setDividerSize(0);
            this.SplitPane.setDividerLocation(150);
            this.SplitPane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
            this.SplitPane.setLeftComponent(this.Buttons);
            this.SplitPane.setRightComponent( this.Main);

            //adding to ui
            this.Frame.add(this.SplitPane);
            }
}
