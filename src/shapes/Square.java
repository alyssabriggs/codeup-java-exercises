package shapes;

public class Square extends Rectangle {

    public Square(double side){
        super(side, side);
    }

    @Override
    public double getPerimeter(){
        return 4 * this.length;
    }

    public double getArea(){
        return Math.pow(this.length, 2);
    }
}