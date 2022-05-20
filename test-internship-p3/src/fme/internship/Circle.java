package fme.internship;

public class Circle extends Shape{

    private Integer r; // raza

    public Circle(Integer r) {
        this.r = r;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * r;
    }

    @Override
    public double area() {
        return 3.14 * r * r;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }
}
