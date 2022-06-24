package field;

import entities.Animal;
import entities.Organism;
import entities.carnivores.Carnivore;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cell {
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public Map<Organism, Set<Animal>> sets = new HashMap<>();

//    List<Herbivore> herbivores = new ArrayList<>();
//    List<Carnivore> carnivores = new ArrayList<>();
//    List<Plant> plants = new ArrayList<>();

    public void calculate() {
        for (Map.Entry<Organism, Set<Animal>> pair : sets.entrySet()) {
            Set<Animal> animalSet = pair.getValue();
            for (Animal animal : animalSet) {
                if (animal instanceof Carnivore) {
                    ((Carnivore) animal).eat(sets.get(Organism.SHEEP));
                }
            }
        }
        for (Map.Entry<Organism, Set<Animal>> pair : sets.entrySet()) {
            Set<Animal> animalSet = pair.getValue();
            for (Animal animal : animalSet) {
                boolean isMoved = animal.move(this);
                //if (isMoved) animalSet.remove(animal);
            }
        }
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
