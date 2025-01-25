package gr.aueb.cf.ch16;

import gr.aueb.cf.ch16.interfaces.ICircle;
import gr.aueb.cf.ch16.interfaces.ITwoDimensional;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends Shape implements ITwoDimensional, ICircle, Serializable, Cloneable {


    private double radius;

    public Circle(){}

    public Circle(double radius) {
        this.radius = radius;
    }

    // Copy Constructor
    public Circle(Circle circle) {
        this.radius = circle.radius;
    }


    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public long getCircumference() {
        return (long) (Math.PI * 2 * this.radius);
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Circle that)) return false;
        return Double.compare(getRadius(), that.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getRadius());
    }

    // Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
