public class Square extends Figure {
    private double side;

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public void draw() {
        System.out.println("The square is drawn.\nSquare, area: " + getArea() + " sq.units, " +
                "side length: " + side + " units, color: " + getColor());
    }

    public double getArea() {
        return side * side;
    }

    public Color getColor() {
        return color;
    }
}
