package field;

import entities.Alive;
import entities.Organism;
import entities.Plant;
import entities.carnivores.Carnivore;
import entities.factory.AliveFactory;
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
        eat();

        //Логика передвижения
        move();

        //Логика размножения
        multiply();


    }

    private void eat() {
        for (Map.Entry<Organism, Set<Alive>> pair : sets.entrySet()) {
            Set<Alive> aliveSet = pair.getValue();
            for (Alive alive : aliveSet) {
                if (alive instanceof Carnivore) {
                    Organism[] herbivores = Organism.getHerbivores();
                    for (int i = 0; i < herbivores.length; i++) {
                        ((Carnivore) alive).eat(sets.get(herbivores[i]));
                    }

                }
//                else if (alive instanceof Herbivore) {
//                    Set<Alive> plants = sets.get(Organism.PLANT);
//                    //if (plants != null) {
//                        ((Herbivore) alive).eat(plants);
//                    //}
//                }
            }
        }
    }

    private void move() {
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

    private void multiply() {
        Iterator<Map.Entry<Organism, Set<Alive>>> iterator = sets.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Organism, Set<Alive>> pair = iterator.next();
            Organism name = pair.getKey();
            Set<Alive> alives = pair.getValue();
            if (alives != null) {
                int numberOfChildren = alives.size()/2;
                for (int i = 0; i < numberOfChildren; i++) {
                    Alive alive = AliveFactory.getInstance().getAlive(name);
                    alives.add(alive);
                }
            }
        }

//        for (Map.Entry<Organism, Set<Alive>> pair : sets.entrySet()) {
//            Set<Alive> aliveSet = pair.getValue();
//            /*
//            Логика проста до безобразия: если каждой твари по паре, то у каждой пары рождается
//            по одному детенышу. То есть считаем общее поголовье в одной ячейке и увеличиваем его
//            в полтора раза в каждом такте.
//            */
//            if (aliveSet.size()>1){
//                for (int i = 0; i < aliveSet.size()/2; i++) {
//                    aliveSet.add(AliveFactory.getInstance().getAlive(pair.getKey()));
//                }
//            }
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
