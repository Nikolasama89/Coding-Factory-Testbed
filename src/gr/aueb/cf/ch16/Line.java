package gr.aueb.cf.ch16;

import gr.aueb.cf.ch16.interfaces.ILine;

public class Line extends Shape implements ILine {
    private double length;

    public Line(){}

    public Line(double length) {
        this.length = length;
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


}
