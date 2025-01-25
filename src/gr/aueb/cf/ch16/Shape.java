package gr.aueb.cf.ch16;

import gr.aueb.cf.ch16.interfaces.IShape;

public abstract class Shape implements IShape {
    private long id;

    public Shape(){}

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public long getId() {
        return this.id;
    }
}
