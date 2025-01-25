package gr.aueb.cf.ch16;

import gr.aueb.cf.ch16.interfaces.ILine;

import java.io.Serializable;
import java.util.Objects;

public class Line extends Shape implements ILine, Serializable {
    private double length;

    public Line(){}

    public Line(double length) {
        this.length = length;
    }

    public Line(Line line) {
        this.length = line.length;
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "length=" + length +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Line that)) return false;
        return Double.compare(getLength(), that.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getLength());
    }
}
