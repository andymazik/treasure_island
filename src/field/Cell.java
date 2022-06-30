package field;

import entities.Alive;
import entities.Organism;
import entities.carnivores.Carnivore;
import entities.herbivores.Herbivore;

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

    public Map<Organism, Set<Alive>> sets = new HashMap<>();

    public void calculate() {
        //Логика еды
//        for (Map.Entry<Organism, Set<Alive>> pair : sets.entrySet()) {
//            Set<Alive> aliveSet = pair.getValue();
//            for (Alive alive : aliveSet) {
//                if (alive instanceof Carnivore) { //Слабое место. Нужно переделать чтобы для каждого объекта не вызывать instanceof
//                    Organism[] herbivores = Organism.getHerbivores();
//                    for (int i = 0; i < herbivores.length; i++) {
//                        ((Carnivore) alive).eat(sets.get(herbivores[i]));
//                    }
//
//                } else if (alive instanceof Herbivore) {
//                    ((entities.herbivores.Herbivore) alive).eat(sets.get(Organism.PLANT));
//                }
//            }
//        }

        //Логика передвижения
        for (Map.Entry<Organism, Set<Alive>> pair : sets.entrySet()) {
            Set<Alive> aliveSet = pair.getValue();
            Iterator<Alive> iterator = aliveSet.iterator();
            while (iterator.hasNext()) {
                Alive alive = iterator.next();
                boolean isMove = alive.move(this);
                if (isMove) iterator.remove();
            }
        }
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
