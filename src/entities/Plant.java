package entities;

import entities.prefs.Fields;
import field.Cell;


public class Plant extends Herbivore {
    public Plant(Fields fields) {
        super(fields);
    }

    @Override
    public boolean move(Cell cell) {
        return false;
    }

    @Override
    public void multiply() {

    }
}
