package entities.carnivores;

import entities.Animal;
import entities.prefs.Fields;
import field.Cell;

import java.util.Set;


public class Wolf extends Carnivore{
    public Wolf(Fields fields) {
        super(fields);
    }

    @Override
    public void eat(Set<Animal> herbivores) {

    }

    @Override
    public boolean move(Cell cell) {
        return super.move(cell);
    }

    @Override
    public void multiply() {

    }
}
