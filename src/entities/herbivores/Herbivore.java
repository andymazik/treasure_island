package entities.herbivores;

import entities.Alive;
import entities.Organism;
import entities.prefs.Fields;
import entities.prefs.GamePreferences;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Herbivore extends Alive {
    public Herbivore(Fields fields) {
        super(fields);
    }

    //Временная заглушка для реализации логики поедания травы с вероятностью в 50%(не реализован голод/сытость)
    public void eat(Set<Alive> grass){
        int randomNum;
        Iterator<Alive> iterator = grass.iterator();
        while (iterator.hasNext()) {
            Alive alive = iterator.next();
            //Создаем случайное число
            randomNum = ThreadLocalRandom.current().nextInt(2);
            //Если данное случайное число равно 1, то поедаем траву(т.е. удаляем текущий объект из коллекции)
            if (randomNum == 1) {
                iterator.remove();
            }
        }
    }
}
