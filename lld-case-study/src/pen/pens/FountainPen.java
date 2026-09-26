package pen.pens;

import pen.helper.Ink;
import pen.helper.Nib;

public class FountainPen extends Pen{

    private Ink ink;
    private Nib nib;

    public FountainPen(Ink ink, Nib nib) {
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {

    }
}
