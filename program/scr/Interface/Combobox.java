package Interface;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Combobox{
    private Color color_Box = new Color(95, 95, 95);
    private Border Border_Box = new LineBorder(new Color(77,77,77));


    public void AddBox(Container container, String[] strings, int ID){
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        JComboBox cb = new JComboBox(strings);
        cb.setBackground(color_Box);
        cb.setBorder(Border_Box);

        String s = (String) cb.getSelectedItem();
        SelectListener sl = new SelectListener(s, ID, container);
        
        cb.addActionListener(sl);
        container.add(cb);


        //adding footer
        Footer footer = new Footer();
        footer.addFooter(container);

        container.revalidate();
        container.repaint();
    }


}
