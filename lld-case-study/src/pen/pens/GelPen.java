package pen.pens;

import pen.helper.Refill;

public class GelPen extends Pen {
    private Refill refill;

    public GelPen(Refill refill) {
        this.refill = refill;
    }

    @Override
    public void write() {

    }
}
