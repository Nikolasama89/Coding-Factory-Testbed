package gr.aueb.cf.ch16;

import gr.aueb.cf.ch16.interfaces.IRectangle;

import java.io.Serializable;
import java.util.Objects;


public class Rectangle extends Shape implements IRectangle, Serializable, Cloneable {
    private double width;
    private double height;

    public Rectangle(){}

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //Copy Constructor
    public Rectangle(Rectangle rectangle) {
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    @Override
    public long getCircumference() {
        return (long) (2 * (this.width + this.height));
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle that)) return false;
        return Double.compare(getWidth(), that.getWidth()) == 0 && Double.compare(getHeight(), that.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    //Cloneable
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
