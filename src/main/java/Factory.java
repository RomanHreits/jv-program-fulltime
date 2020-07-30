import java.util.Random;

public class Factory {

    private static final Random RANDOM = new Random();

    private Figure creator(String figure) {
        if (figure.equals("circle")) {
            return new Circle(randomColor(),
                    getRandomSides());
        }
        if (figure.equals("rightTriangle")) {
            return new RightTriangle(randomColor(),
                    getRandomSides(), getRandomSides());
        }
        if (figure.equals("square")) {
            return new Square(randomColor(),
                    getRandomSides());
        }
        throw new IllegalArgumentException("Wrong parameters!");
    }

    private Color randomColor() {
        Color[] colors = Color.values();
        return colors[RANDOM.nextInt(colors.length)];
    }

    private double getRandomSides() {
        return Math.random() * 100;
    }

    public Figure[] fillingTheArrayOfFigures(String[] names, Figure[] figures) {
        for (int i = 0; i < figures.length; i++) {
            int math = RANDOM.nextInt(3);
            figures[i] = creator(names[math]);
        }
        return figures;
    }
}
