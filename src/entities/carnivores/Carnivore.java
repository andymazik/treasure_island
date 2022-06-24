package entities.carnivores;

import entities.Animal;
import entities.prefs.Fields;

import java.util.Set;


public abstract class Carnivore extends Animal {
    public Carnivore(Fields fields) {
        super(fields);
    }

    public abstract void eat(Set<Animal> herbivores);

}
