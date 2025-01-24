package gr.aueb.cf.ch16;

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
