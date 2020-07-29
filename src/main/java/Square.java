public class Square extends Figure {
    private double side1;

    public Square(Color color, double side1) {
        super(color);
        this.side1 = side1;
    }

    public void draw() {
        System.out.println("The square is drawn");
    }

    public double getArea() {
        return side1*side1;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: квадрат, площадь: " + getArea() + " кв. ед., " +
                "длинна стороны: " + side1 + " ед., цвет: " + color;
    }
}
