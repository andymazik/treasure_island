import field.GameField;

public class Runner {
    public static void main(String[] args) {
        GameField gameField = new GameField();

        gameField.initialize();
        gameField.print();
        System.out.println("*************");
        gameField.setLive();
        gameField.printInfo();

    }
}
