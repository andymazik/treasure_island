package entities.herbivores;

import entities.Alive;
import entities.prefs.Fields;

import java.util.Set;


public abstract class Herbivore extends Alive {
    public Herbivore(Fields fields) {
        super(fields);
    }

    public void eat(Set<Alive> grass){

    }
}
