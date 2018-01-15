package Interface;

import Overviews.Longest;
import Overviews.OnlyOne;

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
            Combobox cb = new Combobox();
            if(this.ID == 1){

                cb.AddBox(this.container, this.strings, this.ID);
            }else if(this.ID == 2){

                cb.AddBox(this.container, this.strings, this.ID);
            }else if(this.ID == 3){

                cb.AddBox(this.container, this.strings, this.ID);
            }else if(this.ID == 4){
                Longest L =new Longest(container);
                L.longestLabels();
                Footer footer = new Footer();
                footer.addFooter(container);

                container.revalidate();
                container.repaint();
            }else if(this.ID == 5){
                OnlyOne OO =new OnlyOne(container);
                OO.onlyOneLabels();
                Footer footer = new Footer();
                footer.addFooter(container);

                container.revalidate();
                container.repaint();
            }else if(this.ID == 6){

                cb.AddBox(this.container, this.strings, this.ID);
            }







    }
}
