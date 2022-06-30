package entities.carnivores;

import entities.Herbivore;
import entities.prefs.Fields;

import java.util.Set;

public class Eagle extends Carnivore{
    public Eagle(Fields fields) {
        super(fields);
    }

    @Override
    public void eat(Set<Herbivore> herbivores) {

    }

    @Override
    public void multiply() {

    }
}
