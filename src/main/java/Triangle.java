public class Triangle extends Figure {
    private double side1;
    private double side2;

    public Triangle(Color color, double side1, double side2) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
    }

    public void draw() {
        System.out.println("The Triangle is drawn");
    }

    public double getArea() {
        return 0.5 * side1 * side2;
    }

    public Color getColor() {
        return color;
    }

    public double getHypotenuse() {
        return Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    @Override
    public String toString() {
        return "Фигура: Triangle, площадь: " + getArea() + " кв. ед., " +
                "длинна сторон: " + side1 + " ед., и " + side2 + " ед., гипотенуза: "
                + getHypotenuse() + " ед., цвет: " + color;
    }
}
