package pens;

import helper.Refill;

public class SketchPen extends Pen {
    private Refill refill;

    public SketchPen(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {

    }
}
