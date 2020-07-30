public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("The circle is drawn.\nCircle, area: " + getArea() + " sq.units, " +
                "radius: " + radius + " units, color: " + getColor());
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public Color getColor() {
        return color;
    }
}
