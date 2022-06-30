import entities.prefs.GamePreferences;
import field.GameField;

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

//        while (true) {
//            int randomNum;
//            System.out.print(randomNum = ThreadLocalRandom.current().nextInt(10));
//            Thread.sleep(500);
//
//            if (randomNum < GamePreferences.getInstance().getProbabilities()[1][7]/10) {
//                System.out.println(" съел");
//            } else {
//                System.out.println(" убежал");
//            }
//        }

    }
}
