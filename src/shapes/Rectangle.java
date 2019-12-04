package shapes;

public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
//        adding this. is not a requirement but creates clearer code
    }

    public double getArea(){
        return this.length * this.width;
//        works with the line above or the one below, the one above is more descriptive
//        return length * width;
    }

}
