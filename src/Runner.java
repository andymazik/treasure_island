import entities.Alive;
import entities.Organism;
import entities.prefs.GamePreferences;
import field.Cell;
import field.GameField;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        GameField gameField = new GameField();

        gameField.initialize();
        //gameField.print();
        System.out.println("*************");
        gameField.setLive();
        gameField.printInfo();

        while (true) {
            gameField.makeStep();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            gameField.printInfo();
        }

    }
}
