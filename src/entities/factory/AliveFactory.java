package entities.factory;

import entities.Alive;
import entities.Organism;
import entities.Plant;
import entities.carnivores.Bear;
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
            case EAGLE-> new Bear(GamePreferences.getInstance().getMap().get(Organism.EAGLE));
            case FOX -> new Bear(GamePreferences.getInstance().getMap().get(Organism.FOX));
            case SNAKE -> new Bear(GamePreferences.getInstance().getMap().get(Organism.SNAKE));
            case WOLF -> new Bear(GamePreferences.getInstance().getMap().get(Organism.WOLF));
            case CATERPILLAR -> new Bear(GamePreferences.getInstance().getMap().get(Organism.CATERPILLAR));
            case COW -> new Bear(GamePreferences.getInstance().getMap().get(Organism.COW));
            case DEER -> new Bear(GamePreferences.getInstance().getMap().get(Organism.DEER));
            case DUCK -> new Bear(GamePreferences.getInstance().getMap().get(Organism.DUCK));
            case MOUSE -> new Bear(GamePreferences.getInstance().getMap().get(Organism.MOUSE));
            case HORSE -> new Bear(GamePreferences.getInstance().getMap().get(Organism.HORSE));
            case RABBIT -> new Bear(GamePreferences.getInstance().getMap().get(Organism.RABBIT));
            case SHEEP -> new Bear(GamePreferences.getInstance().getMap().get(Organism.SHEEP));
        };

        return alive;
    }
}
