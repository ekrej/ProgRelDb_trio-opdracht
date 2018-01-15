package Interface;

import javax.swing.*;
import java.awt.*;

public class Combobox {
    String[] AvgPercetage = {"Sherlock", "Breaking Bad", "Fargo"};


    public void AddBox(Container container, String[] strings){
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        JComboBox Avg_Percetage = new JComboBox(AvgPercetage);

        container.add(Avg_Percetage);


        //adding footer
        Footer footer = new Footer();
        footer.addFooter(container);
    }


}
