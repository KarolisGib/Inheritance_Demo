package lt.karolis.plotai;

public class Round extends Figure{
    public Round(double side) {
        super(side, side);
        super.countArea();
        super.setArea(getArea()*(Math.PI));
    }
}
