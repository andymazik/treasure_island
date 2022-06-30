package field;

import entities.Herbivore;
import entities.Organism;
import entities.carnivores.Carnivore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Cell {
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Map<Organism, Set<Herbivore>> sets = new HashMap<>();

//    List<Herbivore> herbivores = new ArrayList<>();
//    List<Carnivore> carnivores = new ArrayList<>();
//    List<Plant> plants = new ArrayList<>();

    public void calculate() {
        for (Map.Entry<Organism, Set<Herbivore>> pair : sets.entrySet()) {
            Set<Herbivore> animalSet = pair.getValue();
            for (Herbivore animal : animalSet) {
                if (animal instanceof Carnivore) { //Слабое место. Нужно переделать чтобы для каждого объекта не вызывать instanceof
                    Organism[] herbivores = Organism.getHerbivores();
                    for (int i = 0; i < herbivores.length; i++) {
                        ((Carnivore) animal).eat(sets.get(herbivores[i]));
                    }

                } else if (animal instanceof entities.herbivores.Herbivore) {
                    ((entities.herbivores.Herbivore) animal).eat(sets.get(Organism.PLANT));
                }
            }
        }

        for (Map.Entry<Organism, Set<Herbivore>> pair : sets.entrySet()) {
            Set<Herbivore> animalSet = pair.getValue();
            Iterator<Herbivore> iterator = animalSet.iterator();
            while (iterator.hasNext()) {
                Herbivore animal = iterator.next();
                boolean isMove = animal.move(this);
                if (isMove) iterator.remove();
            }
        }



//        for (Map.Entry<Organism, Set<Animal>> pair : sets.entrySet()) {
//            Set<Animal> animalSet = pair.getValue();
//            for (Animal animal : animalSet) {
//                boolean isMoved = animal.move(this);
//                //if (isMoved) animalSet.remove(animal);
//            }
//        }
//        for (int i = 0; i < carnivores.size(); i++) {
//            Carnivore carnivore = carnivores.get(i);
//            carnivore.eat(herbivores);
//            carnivore.multiply();
//            carnivore.move();
//        }
//
//        for (int i = 0; i < herbivores.size(); i++) {
//            Herbivore herbivore = herbivores.get(i);
//            herbivore.eat(plants.get(i));
//            herbivore.multiply();
//            herbivore.move();
//
//        }
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    @Override
    public String toString() {
        return "\t|" + row + "/" + col + "|\t";
    }
}
