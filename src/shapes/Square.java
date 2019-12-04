package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

//    protected double length;
//    protected double width;

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
        return (2 * length) + (2 * width) ;
    }

    @Override
    public double getArea() {
        return length * width;
    }


//    public Square(double side){
//        super(side, side);
//    }
//
//    @Override
//    public double getPerimeter(){
//        return 4 * super.length;
//    }
//
//    public double getArea(){
////        return Math.pow(super.length, 2);
//        return super.length * super.width;
//    }
}
