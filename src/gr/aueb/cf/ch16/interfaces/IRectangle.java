package gr.aueb.cf.ch16.interfaces;

public interface IRectangle extends IShape, ITwoDimensional{

    @Override
    long getId();

    @Override
    double getArea();

    @Override
    long getCircumference();
}
