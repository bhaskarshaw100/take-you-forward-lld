package pens;

import helper.Refill;

public class BallPen extends Pen {
    private Refill refill;

    public BallPen(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {

    }
}
