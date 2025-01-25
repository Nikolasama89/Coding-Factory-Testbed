package gr.aueb.cf.ch16.interfaces;

public interface IRectangle extends IShape, ITwoDimensional{

    @Override
    double getArea();

    @Override
    long getId();
}
