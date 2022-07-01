package entities.factory;

import entities.Alive;
import entities.Organism;
import entities.Plant;
import entities.carnivores.*;
import entities.herbivores.*;
import entities.prefs.GamePreferences;

public class AliveFactory {
    static AliveFactory instance;

    private AliveFactory() {
    }

    public static AliveFactory getInstance(){
        if (instance == null) {
            instance = new AliveFactory();
        }
        return instance;
    }

    public Alive getAlive(Organism organism) {
        Alive alive =
        switch (organism){
            case PLANT -> new Plant(GamePreferences.getInstance().getMap().get(Organism.PLANT));
            case BEAR -> new Bear(GamePreferences.getInstance().getMap().get(Organism.BEAR));
            case EAGLE-> new Eagle(GamePreferences.getInstance().getMap().get(Organism.EAGLE));
            case FOX -> new Fox(GamePreferences.getInstance().getMap().get(Organism.FOX));
            case SNAKE -> new Snake(GamePreferences.getInstance().getMap().get(Organism.SNAKE));
            case WOLF -> new Wolf(GamePreferences.getInstance().getMap().get(Organism.WOLF));
            case CATERPILLAR -> new Caterpillar(GamePreferences.getInstance().getMap().get(Organism.CATERPILLAR));
            case COW -> new Cow(GamePreferences.getInstance().getMap().get(Organism.COW));
            case DEER -> new Deer(GamePreferences.getInstance().getMap().get(Organism.DEER));
            case DUCK -> new Duck(GamePreferences.getInstance().getMap().get(Organism.DUCK));
            case MOUSE -> new Mouse(GamePreferences.getInstance().getMap().get(Organism.MOUSE));
            case HORSE -> new Horse(GamePreferences.getInstance().getMap().get(Organism.HORSE));
            case RABBIT -> new Rabbit(GamePreferences.getInstance().getMap().get(Organism.RABBIT));
            case SHEEP -> new Sheep(GamePreferences.getInstance().getMap().get(Organism.SHEEP));
        };

        return alive;
    }
}
