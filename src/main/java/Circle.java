public class Circle extends Figure {
    private double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("The circle is drawn");
    }

    public double getArea() {
        return 3.14*Math.pow(radius, 2);
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: круг, площадь: " + getArea() + " кв. ед., " +
                "радиус: " + radius + " ед., цвет: " + color;
    }
}
