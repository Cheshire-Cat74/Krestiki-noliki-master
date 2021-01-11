package Controller;

import Model.Game;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Controller {
    @FXML
    private Button tri;
    @FXML
    private Button pyat;
    @FXML
    private Button vosem;
    @FXML
    private Button sem;
    @FXML
    private Button human;
    @FXML
    private Button AI;
    @FXML
    private GridPane game_pole;
    private String opponents = "H-AI";

    @FXML
    public void choiceOpponent(ActionEvent actionEvent ) {
        if ( actionEvent.getSource().equals(this.human)) {
             this.human = human;
        }
        else if (actionEvent.getSource().equals(this.AI)) {
            this.AI = AI;
        }

    }



        @FXML
        public void clickOnExit (ActionEvent actionEvent){
            System.exit(0);
        }

        @FXML
        public void gameStart (ActionEvent actionEvent){
            if (actionEvent.getSource().equals(this.tri)) {
                this.clear();
                Game.createMap(3, 3, this.game_pole);
            } else if (actionEvent.getSource().equals(this.pyat)) {
                this.clear();
                Game.createMap(5, 4, this.game_pole);
            } else if (actionEvent.getSource().equals(this.sem)) {
                this.clear();
                Game.createMap(7, 5, this.game_pole);
            } else if (actionEvent.getSource().equals(this.vosem)) {
                this.clear();
                Game.createMap(8, 8, this.game_pole);
            }
        }

        public void clear () {
            this.game_pole.getChildren().clear();
        }


}
