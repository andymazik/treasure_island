package entities.herbivores;

import entities.prefs.Fields;
import field.Cell;

import java.util.Set;

public class Kengoo extends Herbivore{
    public Kengoo(Fields fields) {
        super(fields);
    }

    @Override
    public void eat(Set<entities.Herbivore> grass) {

    }

    @Override
    public boolean move(Cell cell) {
        return super.move(cell);
    }

    @Override
    public void multiply() {

    }

//    @Override
//    public void eat(Plant plant) {
//
//    }
}
