package entities.carnivores;

import entities.Herbivore;
import entities.prefs.Fields;
import field.Cell;

import java.util.Set;


public class Fox extends Carnivore{
    public Fox(Fields fields) {
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
