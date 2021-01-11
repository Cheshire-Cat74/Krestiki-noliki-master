package Model.Players;

import Model.Map;

public abstract class Player {
    String symb;
    String type;
    public static String turnP = "p1";
    int xout;
    int yout;

    public Player() {
    }

    public String getSymb() {
        return this.symb;
    }

    public String getType() {
        return this.type;
    }

    public int getXout() {
        return this.xout;
    }

    public int getYout() {
        return this.yout;
    }

    public abstract void turn(int var1, int var2,Map var3);
}

