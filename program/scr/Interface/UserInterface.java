package Interface;


import java.awt.*;
import javax.swing.*;

public class UserInterface extends JFrame {


        private JPanel Main;
        private JPanel Buttons;
        JSplitPane SplitPane;
        private Color color1 = new Color(38, 38, 38);
        private Color color2 = new Color(77,77,77);

        public UserInterface() {
            this.setSize(1024,600);
            this.setVisible(true);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


            // initializing panels
            this.Main = new JPanel();
            this.Buttons = new JPanel();
            this.SplitPane= new JSplitPane();

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
            this.add(this.SplitPane);
        }
    }
