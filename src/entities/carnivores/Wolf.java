package entities.carnivores;

import entities.Herbivore;
import entities.prefs.Fields;
import field.Cell;

import java.util.Set;


public class Wolf extends Carnivore{
    public Wolf(Fields fields) {
        super(fields);
    }

    @Override
    public void eat(Set<Herbivore> herbivores) {

    }

    @Override
    public boolean move(Cell cell) {
        return super.move(cell);
    }

    @Override
    public void multiply() {

    }
}
