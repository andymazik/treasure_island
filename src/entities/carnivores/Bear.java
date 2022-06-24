package entities.carnivores;

import entities.Animal;
import entities.prefs.Fields;

import java.util.Set;

public class Bear extends Carnivore{

//    public Bear() {
//        super("Волк",
//                "\uD83D\uDC3B",
//                250,
//                2,
//                 new Limit(500, 5, 2, 80));
//    }


    public Bear(Fields fields) {
        super(fields);
    }

    @Override
    public void eat(Set<Animal> herbivores) {

    }

    @Override
    public void multiply() {

    }

}
