package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double length, double width) {
        super(length, width);
    }

    @Override
    double setLength() {
        return length;
    }

    @Override
    double setWidth() {
        return width;
    }

    @Override
    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    @Override
    public double getArea() {
        return length * width;
    }


//    protected double length;
//    protected double width;
//
//    public Rectangle(double width, double length) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
////        adding this. is not a requirement but creates clearer code
//    }
//
//    public double getArea(){
//        return this.length * this.width;
////        works with the line above or the one below, the one above is more descriptive
////        return length * width;
//    }

}
