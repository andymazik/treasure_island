package field;

import entities.Animal;
import entities.Organism;
import entities.carnivores.*;
import entities.herbivores.*;
import entities.prefs.GamePreferences;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class GameField {
    public static Cell[][] field = new Cell[30][30];


    public void initialize() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = new Cell(i, j);
            }
        }
    } //Инициализируем массив ячеек

    public void setLive(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                {
                /*
                    Organism[] setOfOrganisms = Organism.values(); //Преобразовываем набор значений енама к обычному массиву
                    for (Organism organism : setOfOrganisms) { //Пробегаемся по массиву и создаем рандомное количество животных каждого вида
                        int num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(organism).getMaxCount());
                        Set<Animal> typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                        for (int k = 0; k < num; k++) {
                            //typeSet.add() //Заполняем его животными нужного вида
                        }
                        field[i][j].sets.put(organism, new HashSet<>());
                    }
                 */
                }

                {
                    //Создаем медведя
                    int num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.BEAR).getMaxCount());
                    Set<Animal> typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных
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
                    num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.HAMSTER).getMaxCount());
                    typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                    for (int k = 0; k < num; k++) {
                        typeSet.add(new Hamster(GamePreferences.getInstance().getMap().get(Organism.HAMSTER))); //Заполняем его животными нужного вида
                    }
                    field[i][j].sets.put(Organism.HAMSTER, typeSet);

                    //Создаем лошадь
                    num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.HORSE).getMaxCount());
                    typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                    for (int k = 0; k < num; k++) {
                        typeSet.add(new Horse(GamePreferences.getInstance().getMap().get(Organism.HORSE))); //Заполняем его животными нужного вида
                    }
                    field[i][j].sets.put(Organism.HORSE, typeSet);

                    //Создаем кенгуру
                    num = ThreadLocalRandom.current().nextInt(0, GamePreferences.getInstance().getMap().get(Organism.KENGOO).getMaxCount());
                    typeSet = new HashSet<>(); //Создаем сет с необходимым кол-вом животных

                    for (int k = 0; k < num; k++) {
                        typeSet.add(new Kengoo(GamePreferences.getInstance().getMap().get(Organism.KENGOO))); //Заполняем его животными нужного вида
                    }
                    field[i][j].sets.put(Organism.KENGOO, typeSet);

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
    } //Спойлер. Заселяем массив животными и растениями.

    public void print() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    } //Выводим на экран порядковые номера ячеек.

    public void printInfo(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j] + "\t");
                System.out.print(field[i][j].sets);
                System.out.println();
            }
            System.out.println();
        }
    } //Выводим на экран состояние ячеек в текущий момент времени.

    public void makeStep(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j].calculate();
            }
        }
    }
}
