package entities.carnivores;

import entities.Herbivore;
import entities.Organism;
import entities.prefs.Fields;
import entities.prefs.GamePreferences;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Carnivore extends Herbivore {
    public Carnivore(Fields fields) {
        super(fields);
    }

    public void eat(Set<Herbivore> herbivores){
        int randomNum;
        Iterator<Herbivore> iterator = herbivores.iterator();
        while (iterator.hasNext()) {
            Herbivore herbivore = iterator.next();
            //Создаем случайное число
            randomNum = ThreadLocalRandom.current().nextInt(10);
            //Если данное случайное число меньше вероятностного предела из настроек животного деленного на 10, то поедаем жертву(т.е. удаляем текущий объект из коллекции)
            if (randomNum < GamePreferences.getInstance().getProbabilities()[Organism.valueOf(this.getClass().getSimpleName().toUpperCase()).ordinal()][Organism.valueOf(herbivore.getClass().getSimpleName().toUpperCase()).ordinal()]/10) {
                iterator.remove();
            }
        }
    }

}
