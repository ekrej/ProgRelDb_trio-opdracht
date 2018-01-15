package Interface;

import Overviews.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectListener implements ActionListener{
    private String selected;
    private int ID;
    private Container container;

    public SelectListener(String selected, int ID,Container container){
        this.selected = selected;
        this.ID = ID;
        this.container = container;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        AvgSerie AS = new AvgSerie(this.container);
        AvgAccount AV = new AvgAccount(this.container);
        HowMany HM = new HowMany(this.container);
        Watched W = new Watched(this.container);
        switch (selected){
            case "Sherlock":
                AS.;
                break;
            case "Breaking Bad":
                AS.;
                break;
            case "Fargo":
                AS.;
                break;
            case "Fam. van Raalte":
                switch(ID){
                    case 2:
                        AV.;
                        break;
                    case 3:
                        HM.;
                        break;
                }
                break;
            case "F. de Kat":
                switch(ID){
                    case 2:
                        AV.;
                        break;
                    case 3:
                        HM.;
                        break;
                }
                break;
            case "J. van Betlehem":
                switch(ID){
                    case 2:
                        AV.;
                        break;
                    case 3:
                        HM.;
                        break;
                }
                break;
            case "A Clockwork Orange":
                W.;
                break;
            case "Andy Warhol’s Dracula":
                W.;
                break;
            case "De helaasheid der dingen":
                W.;
                break;
            case "Der Untergang":
                W.;
                break;
            case "Ober":
                W.;
                break;
            case "Pruimebloesem":
                W.;
                break;
            case "Pulp Fiction":
                W.;
                break;

        }



    }
}
