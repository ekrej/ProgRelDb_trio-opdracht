package Interface;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener{
    private Container container;
    private String[] strings;
    private JButton button;
    private int ID ;



    public ClickListener(Container container, String[] combobox, JButton jButton, int ID ){
        this.container = container;
        this.strings = combobox;
        this.button = jButton;
        this.ID = ID;
    }

    public ClickListener(Container container,  JButton jButton, int ID ){
        this.container = container;
        this.button = jButton;
        this.ID = ID;
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        container.removeAll();
            if(this.ID == 1){
                Combobox cb = new Combobox();
                cb.AddBox(this.container, this.strings);
            }else if(this.ID == 2){
                Combobox cb = new Combobox();
                cb.AddBox(this.container, this.strings);
            }else if(this.ID == 3){
                Combobox cb = new Combobox();
                cb.AddBox(this.container, this.strings);
            }else if(this.ID == 4){

            }else if(this.ID == 5){

            }else if(this.ID == 6){
                Combobox cb = new Combobox();
                cb.AddBox(this.container, this.strings);
            }







    }
}
