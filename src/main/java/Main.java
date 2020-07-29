import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Color[] colors = Color.values();
        String[] listFigures = new String[]{"circle", "triangle", "square"};
        Figure[] figuresObj = new Figure[(int) (Math.random() * 30)];
        if (figuresObj.length != 0) {
            for (int i = 0; i < figuresObj.length; i++) {
                int math = random.nextInt(3);
                figuresObj[i] = creator(listFigures[math], colors, random);
            }
            for (Figure f : figuresObj) {
                f.draw();
                System.out.println("---><---");
                System.out.println(f.toString());
            }
        }
    }

    private static Figure creator(String figure, Color[] colors, Random random) {
        if (figure.equals("circle")) {
            return new Circle(colors[random.nextInt(colors.length)],
                    Math.random() * 100);
        }
        if (figure.equals("triangle")) {
            return new Triangle(colors[random.nextInt(colors.length)],
                    Math.random() * 100, Math.random() * 100);
        }
        if (figure.equals("square")) {
            return new Square(colors[random.nextInt(colors.length)],
                    Math.random() * 100);
        }
        return null;
    }
}
