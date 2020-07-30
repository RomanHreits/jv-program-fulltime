public class RightTriangle extends Figure {
    private double cathetus_a;
    private double cathetus_b;

    public RightTriangle(Color color, double cathetus_a, double cathetus_b) {
        super(color);
        this.cathetus_a = cathetus_a;
        this.cathetus_b = cathetus_b;
    }

    public void draw() {
        System.out.println("The RightTriangle is drawn.\nRightTriangle, area: " + getArea() + " sq.units,"+
                " first cathetus length: " + cathetus_a + " units,\nsecond cathetus length: " + cathetus_b +
                " units, hypotenuse length: " + getHypotenuse() + " units, color: " + getColor());
    }

    public double getArea() {
        return 0.5 * cathetus_a * cathetus_b;
    }

    public Color getColor() {
        return color;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(cathetus_a, 2) + Math.pow(cathetus_b, 2));
    }
}
