package lt.karolis.plotai;

public class Figure {
    private double area;
    private double side1;
    private double side2;

    public Figure(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public void countArea(){
        area = side1 * side2;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format(
                "Jusu figuros plotas yra: %.2f kv.cm",
                this.area
        );
    }
}
