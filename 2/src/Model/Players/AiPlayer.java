package Model.Players;

import Model.Game;
import Model.Map;

public class AiPlayer extends Player {
    public AiPlayer(String symb, String type) {
        this.symb = symb;
        this.type = type;
    }

    public void turn(int x, int y, Map map) {
        if (Game.cellEmpty(x, y)) {
            Game.setXO(x, y, this.symb);
            this.xout = x;
            this.yout = y;
            turnP = "p1";
        }

    }
}
