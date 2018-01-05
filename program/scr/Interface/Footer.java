package Interface;

import javax.swing.*;
import java.awt.*;

public class Footer {

    private Color color_Buttons = new Color(95, 95, 95);
    private Color color_text = new Color(128, 0, 0);

    public void  addFooter(Container container){
        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        JTextArea footer = new JTextArea(" Netflix Statistix,                    " +
                "   Informatica 1,  Klas B," +
                "   Niek Dooper, Kim van Gageldonk, Jerke Godeke");
        footer.setBackground(color_Buttons);
        footer.setForeground(color_text);
        footer.setEditable(false);
        container.add(footer);



    }
}
