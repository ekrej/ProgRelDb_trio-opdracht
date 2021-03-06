package Interface;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

//Homepage laat 6 keuzes zien (overviews van de queries)

public class Homepage implements Runnable{

    private JFrame Frame;
    private JPanel Main;
    private JPanel Buttons;
    private JSplitPane SplitPane;
    private Color color_MainPanel = new Color(38, 38, 38);
    private Color color_ButtonPanel = new Color(77,77,77);
    private Color color_Buttons = new Color(95, 95, 95);
    private Border Border_Button = new LineBorder(color_ButtonPanel);

    private String[] AvgPercetage = {"Sherlock", "Breaking Bad", "Fargo"};
    private String[] AvgAccount = {"Fam. van Raalte", "F. de kat", "J. van Betlehem"};
    private String[] Watched = {"Fam. van Raalte", "F. de kat", "J. van Betlehem"};
    private String[] HowMany = {"A Clockwork Orange", "Andy Warhol’s Dracula", "De helaasheid der dingen", "Der Untergang", "Ober", "Pruimebloesem", "Pulp Fiction" };



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
           this.Main.setBackground(color_MainPanel);
           this.Buttons.setBackground(color_ButtonPanel);

           //setting to visible
           this.Main.setVisible(true);
           this.Buttons.setVisible(true);

           //adding navigation buttons
           createButtons(this.Buttons);

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


    public void createButtons(Container container) {

        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);



        //initializing buttons

        JButton overzicht_1 = new JButton("gemideld %/serie");
        JButton overzicht_2 = new JButton("gemideld %/serie+account");
        JButton overzicht_3 = new JButton("bekeken");
        JButton overzicht_4 = new JButton("langste film onder 16 jaar");
        JButton overzicht_5 = new JButton("accounts met 1 profiel");
        JButton overzicht_6 = new JButton("hoeveel bekeken");


        //Style settings
            //main colors
        overzicht_1.setBackground(color_Buttons);
        overzicht_2.setBackground(color_Buttons);
        overzicht_3.setBackground(color_Buttons);
        overzicht_4.setBackground(color_Buttons);
        overzicht_5.setBackground(color_Buttons);
        overzicht_6.setBackground(color_Buttons);
            //borders
        overzicht_1.setBorder(Border_Button);
        overzicht_2.setBorder(Border_Button);
        overzicht_3.setBorder(Border_Button);
        overzicht_4.setBorder(Border_Button);
        overzicht_5.setBorder(Border_Button);
        overzicht_6.setBorder(Border_Button);


        //actions for buttons
        ClickListener cl1 = new ClickListener(this.Main, AvgPercetage, overzicht_1, 1);
        overzicht_1.addActionListener(cl1);
        ClickListener cl2 = new ClickListener(this.Main, AvgAccount, overzicht_2,2);
        overzicht_2.addActionListener(cl2);
        ClickListener cl3 = new ClickListener(this.Main, Watched, overzicht_3,3);
        overzicht_3.addActionListener(cl3);
        ClickListener cl6 = new ClickListener(this.Main, HowMany, overzicht_6,6);
        overzicht_6.addActionListener(cl6);

        ClickListener cl4 = new ClickListener(this.Main, overzicht_4,4);
        overzicht_4.addActionListener(cl4);
        ClickListener cl5 = new ClickListener(this.Main, overzicht_5,5);
        overzicht_5.addActionListener(cl5);





        //adding buttons + blanks
        container.add(new JLabel(""));
        container.add(new JLabel(""));
        container.add(overzicht_1);
        container.add(new JLabel(""));
        container.add(overzicht_2);
        container.add(new JLabel(""));
        container.add(overzicht_3);
        container.add(new JLabel(""));
        container.add(overzicht_4);
        container.add(new JLabel(""));
        container.add(overzicht_5);
        container.add(new JLabel(""));
        container.add(overzicht_6);

    }

    public JFrame getFrame() {
        return this.Frame;
    }



}
