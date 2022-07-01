package entities;

import entities.prefs.Fields;
import field.Cell;


public class Plant extends Alive {
    public Plant(Fields fields) {
        super(fields);
    }

    @Override
    public boolean move(Cell cell) {
        return false;
    }

}
