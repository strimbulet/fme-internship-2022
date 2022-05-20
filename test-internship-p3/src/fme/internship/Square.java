package fme.internship;

public class Square extends Shape{

    private Integer length;

    public Square(Integer length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return 4 * length;
    }

    @Override
    public double area() {
        return length * length;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }
}
