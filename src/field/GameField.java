package field;

import entities.Alive;
import entities.Organism;
import entities.Plant;
import entities.carnivores.*;
import entities.factory.AliveFactory;
import entities.herbivores.*;
import entities.prefs.GamePreferences;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public static Cell[][] field = new Cell[GamePreferences.row][GamePreferences.col];

    //Инициализируем массив ячеек
    public void initialize() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new Cell(i, j);
            }
        }
    }

    //Заселяем массив животными и растениями.
    public void setLive(){
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[i].length; j++) {
//                {
//                    Organism[] setOfOrganisms = Organism.values(); //Преобразовываем набор значений енама к обычному массиву
//                    for (Organism organism : setOfOrganisms) { //Пробегаемся по массиву и создаем рандомное количество животных каждого вида
//                        int num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(organism).getMaxCount());
//                        Set<Alive> typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных
//
//                        for (int k = 0; k < num; k++) {
//                            Alive alive = AliveFactory.getInstance().getAlive(organism);
//                            typeSet.add(alive); //Заполняем его животными нужного вида
//                        }
//                        field[i][j].sets.put(organism, typeSet);
//                    }
//                }
//            }
//        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                //Создаем медведя
                int num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.BEAR).getMaxCount());
                Set<Alive> typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных
                for (int k = 0; k < num; k++) {
                    typeSet.add(new Bear(GamePreferences.getInstance().getMap().get(Organism.BEAR))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.BEAR, typeSet);

                //Создаем орла
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.EAGLE).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Eagle(GamePreferences.getInstance().getMap().get(Organism.EAGLE))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.EAGLE, typeSet);

                //Создаем лису
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.FOX).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Fox(GamePreferences.getInstance().getMap().get(Organism.FOX))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.FOX, typeSet);

                //Создаем змею
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.SNAKE).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Snake(GamePreferences.getInstance().getMap().get(Organism.SNAKE))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.SNAKE, typeSet);

                //Создаем волка
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.WOLF).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Wolf(GamePreferences.getInstance().getMap().get(Organism.WOLF))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.WOLF, typeSet);

                //Создаем гусеницу
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.CATERPILLAR).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Caterpillar(GamePreferences.getInstance().getMap().get(Organism.CATERPILLAR))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.CATERPILLAR, typeSet);

                //Создаем корову
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.COW).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Cow(GamePreferences.getInstance().getMap().get(Organism.COW))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.COW, typeSet);

                //Создаем оленя
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.DEER).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Deer(GamePreferences.getInstance().getMap().get(Organism.DEER))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.DEER, typeSet);

                //Создаем утка
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.DUCK).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Duck(GamePreferences.getInstance().getMap().get(Organism.DUCK))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.DUCK, typeSet);

                //Создаем хомяка
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.MOUSE).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Mouse(GamePreferences.getInstance().getMap().get(Organism.MOUSE))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.MOUSE, typeSet);

                //Создаем лошадь
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.HORSE).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Horse(GamePreferences.getInstance().getMap().get(Organism.HORSE))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.HORSE, typeSet);

                //Создаем кенгуру
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.RABBIT).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Rabbit(GamePreferences.getInstance().getMap().get(Organism.RABBIT))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.RABBIT, typeSet);

                //Создаем овцу
                num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.SHEEP).getMaxCount());
                typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                for (int k = 0; k < num; k++) {
                    typeSet.add(new Sheep(GamePreferences.getInstance().getMap().get(Organism.SHEEP))); //Заполняем его животными нужного вида
                }
                field[i][j].sets.put(Organism.SHEEP, typeSet);
            }
        }
    }

    //Выводим на экран порядковые номера ячеек.
    public void print() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public void printInfo(){
//        for (int i = 0; i < field.length; i++) {
//            for (int j = 0; j < field[i].length; j++) {
//                System.out.print(field[i][j] + "\t");
//                System.out.print(field[i][j].sets);
//                System.out.println();
//            }
//            System.out.println();
//        }
        int totalCount = 0;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                Map<Organism, Set<Alive>> map = field[i][j].sets;
                for (Set<Alive> value : map.values()) {
                    for (Alive alive : value) {
                        totalCount++;
                    }
                }
            }
        }

        System.out.println("Общее количество тварей на карте: " + totalCount);
    } //Выводим на экран состояние ячеек в текущий момент времени.

    public void makeStep(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j].calculate();
            }
        }
    }
}
