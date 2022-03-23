package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements FigureArea, Draw {
    private final int firstBase;
    private final int secondBase;
    private final int height;


    public IsoscelesTrapezoid(String color, int firstBase, int secondBase, int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (firstBase + secondBase) / 2 * height;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getDraw() {
        return "IsoscelesTrapezoid: area: " + getArea() + " sq.units, " + "topBase: " + firstBase + " units, " + "bottomBase: " + secondBase + " units, " + "height: " + height + " units, " + "color: " + getColor();
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
