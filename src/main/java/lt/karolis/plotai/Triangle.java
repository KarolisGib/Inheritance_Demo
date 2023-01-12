package lt.karolis.plotai;

public class Triangle extends Figure{

    public Triangle(double side1, double side2) {
        super(side1, side2);
        super.countArea();
        super.setArea(getArea()/2);
    }


}
