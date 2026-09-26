package pen.pens;

import pen.helper.PenCap;
import pen.strategy.WriteStrategy;

public abstract class Pen {
    private WriteStrategy writeStrategy;
    private PenCap cap;
    private String name;
    private String brand;
    private String length;

    public WriteStrategy getWriteStrategy() {
        return writeStrategy;
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
    }

    public PenCap getCap() {
        return cap;
    }

    public void setCap(PenCap cap) {
        this.cap = cap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public abstract void write();
}
