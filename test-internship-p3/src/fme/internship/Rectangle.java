package fme.internship;

public class Rectangle extends Shape{

    private Integer length;
    private Integer with;

    public Rectangle(Integer length, Integer with) {
        this.length = length;
        this.with = with;
    }

    @Override
    public double perimeter() {
        return 2 * (length + with);
    }

    @Override
    public double area() {
        return length * with;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
