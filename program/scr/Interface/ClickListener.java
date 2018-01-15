package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{
    private Container container;
    private String[] strings;


    public ClickListener(Container container, String[] combobox){
        this.container = container;
        this.strings = combobox;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        Combobox cb = new Combobox();
        cb.AddBox(this.container, this.strings);
    }
}
