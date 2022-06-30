package entities.herbivores;

import entities.prefs.Fields;

import java.util.Set;


public abstract class Herbivore extends entities.Herbivore {
    public Herbivore(Fields fields) {
        super(fields);
    }

    public abstract void eat(Set<entities.Herbivore> grass);
}
