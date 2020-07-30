
public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        String[] listFigureNames = new String[]{"circle", "rightTriangle", "square"};
        Figure[] figuresObj = new Figure[(int) (Math.random() * 30)];
        if (figuresObj.length != 0) {
            factory.fillingTheArrayOfFigures(listFigureNames, figuresObj);
            info(figuresObj);
        }
    }

    private static void info(Figure[] figures) {
        for (Figure figure : figures) {
            System.out.println("---><---");
            figure.draw();
        }
    }
}

