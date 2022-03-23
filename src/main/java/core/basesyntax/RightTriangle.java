package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return Math.pow(firstLeg, secondLeg) / 2;
    }

    @Override
    public String draw() {
        return "RightTriangle: area: " + getArea() + " sq.units, " + "firstLeg: "
                + firstLeg + " units, " + "secondLeg: " + secondLeg
                + " units, " + "color: " + getColor();
    }

    @Override
    public String toString() {
        return draw();
    }
}
