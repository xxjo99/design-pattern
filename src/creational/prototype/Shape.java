package creational.prototype;

// Prototype
// Cloneable의 구현을 통해 복제 가능한 객체로 만듦
public abstract class Shape implements Cloneable {
    private String id;
    protected String type;

    public String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void draw();

    @Override
    public Object clone() {
        Object clone = null;

        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return clone;
    }
}