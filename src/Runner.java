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

//        Cell cell = GameField.field[0][0];
//        Map<Organism, Set<Alive>> map = cell.sets;
//        System.out.println(map);
//
//        System.out.println("values: " + map.values());
//        for (Set<Alive> value : map.values()) {
//            System.out.println("current value: " + value);
//            for (Alive alive : value) {
//                System.out.print("current animal: " + alive + " // ");
//                //System.out.print(" " + Organism.valueOf(alive.getClass().getSimpleName().toUpperCase()).ordinal());
//                System.out.println(" " + alive.getClass().getSimpleName());
//                int currentProbability = GamePreferences.getInstance().getProbabilities()[Organism.valueOf(alive.getClass().getSimpleName().toUpperCase()).ordinal()][Organism.valueOf("SHEEP").ordinal()];
//                //System.out.println(alive.getClass().getSimpleName() + " cъедает овцу с вероятносью " + currentProbability);
//            }
//        }



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
