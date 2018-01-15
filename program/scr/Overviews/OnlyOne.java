package Overviews;


import javax.swing.*;
import java.awt.*;

public class OnlyOne {
    private Container container;
    private String email;

    public OnlyOne(Container container) {
        this.container = container;
        this.email = email;
    }

    public void onlyOneLabels() {
        //setting layout
        GridLayout layout = new GridLayout(20, 1);
        container.setLayout(layout);

        JLabel accountLabel = new JLabel(email);
        container.add(accountLabel);
    }

}
