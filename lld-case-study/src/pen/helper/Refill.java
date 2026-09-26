package pen.helper;

public class Refill {
    private Ink ink;
    private Nib nib;
    private RefillType refillType;

    public Refill(Ink ink, Nib nib, RefillType refillType) {
        this.ink = ink;
        this.nib = nib;
        this.refillType = refillType;
    }
}
