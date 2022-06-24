package entities.herbivores;

import entities.prefs.Fields;
import field.Cell;

public class Duck extends Herbivore{
    public Duck(Fields fields) {
        super(fields);
    }

    @Override
    public boolean move(Cell cell) {
        return super.move(cell);
    }

    @Override
    public void multiply() {

    }



    public void eat(Caterpillar caterpillar) {

    }

}
