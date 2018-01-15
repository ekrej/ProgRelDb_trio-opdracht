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
                AS.labelsSherlock();
                break;
            case "Breaking Bad":
                AS.labelsBreakingBad();
                break;
            case "Fargo":
                AS.labelsFargo();
                break;
            case "Fam. van Raalte":
                switch(ID){
                    case 2:
                        AV.labelsSherlock();
                        AV.labelsBreakingBad();
                        AV.labelsFargo();
                        break;
                    case 3:
                        HM.filmLabels();
                        break;
                }
                break;
            case "F. de Kat":
                switch(ID){
                    case 2:
                        AV.labelsSherlock();
                        AV.labelsBreakingBad();
                        AV.labelsFargo();
                        break;
                    case 3:
                        HM.filmLabels();
                        break;
                }
                break;
            case "J. van Betlehem":
                switch(ID){
                    case 2:
                        AV.labelsSherlock();
                        AV.labelsBreakingBad();
                        AV.labelsFargo();
                        break;
                    case 3:
                        HM.filmLabels();
                        break;
                }
                break;
            case "A Clockwork Orange":
                W.watchedLabels();
                break;
            case "Andy Warhol’s Dracula":
                W.watchedLabels();
                break;
            case "De helaasheid der dingen":
                W.watchedLabels();
                break;
            case "Der Untergang":
                W.watchedLabels();
                break;
            case "Ober":
                W.watchedLabels();
                break;
            case "Pruimebloesem":
                W.watchedLabels();
                break;
            case "Pulp Fiction":
                W.watchedLabels();
                break;

        }


        container.revalidate();
        container.repaint();



    }
}
