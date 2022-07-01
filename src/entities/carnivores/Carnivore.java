package entities.carnivores;

import entities.Alive;
import entities.Organism;
import entities.prefs.Fields;
import entities.prefs.GamePreferences;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Carnivore extends Alive {
    public Carnivore(Fields fields) {
        super(fields);
    }

    public void eat(Set<Alive> herbivores){
        int randomNum;
        Iterator<Alive> iterator = herbivores.iterator();
        while (iterator.hasNext()) {
            Alive alive = iterator.next();
            //Создаем случайное число
            randomNum = ThreadLocalRandom.current().nextInt(10);
            //Если данное случайное число меньше вероятностного предела из настроек животного деленного на 10, то поедаем жертву(т.е. удаляем текущий объект из коллекции)
            int currentProbability = GamePreferences.getInstance().getProbabilities()[Organism.valueOf(this.getClass().getSimpleName().toUpperCase()).ordinal()][Organism.valueOf(alive.getClass().getSimpleName().toUpperCase()).ordinal()];
            if (randomNum < currentProbability) {
                iterator.remove();
                //System.out.println("REMOVED");
            }
        }
    }

}
