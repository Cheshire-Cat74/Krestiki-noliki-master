package Model;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class Map {
    private Button[][] mapArr = (Button[][])null;
    private final int SIZE;
    private final int DOT_TO_WIN;
    private final String empty = " ";

    int getSIZE() {
        return this.SIZE;
    }

    Button[][] getMapArr() {
        return this.mapArr;
    }

    int getDOT_TO_WIN() {
        return this.DOT_TO_WIN;
    }

    String getEmpty() {
        return " ";
    }

    Map(int SIZE, int DOT_TO_WIN) {
        this.SIZE = SIZE;
        this.DOT_TO_WIN = DOT_TO_WIN;
    }

    void init(GridPane obj) {
        this.mapArr = new Button[this.SIZE][this.SIZE];

        int i;
        int j;
        for(i = 0; i < this.SIZE; ++i) {
            for(j = 0; j < this.SIZE; ++j) {
                this.mapArr[j][i] = new Button(" ");
                this.mapArr[j][i].setFont(new Font(30.0D));
            }
        }

        for(i = 0; i < this.SIZE; ++i) {
            for(j = 0; j < this.SIZE; ++j) {
                this.mapArr[j][i].setMinWidth(70.0D);
                this.mapArr[j][i].setMinHeight(70.0D);
                this.mapArr[j][i].setOnAction(Game::action);
                obj.add(this.mapArr[j][i], j, i);
            }
        }

        obj.setHgap(5.0D);
        obj.setVgap(5.0D);
    }
}
