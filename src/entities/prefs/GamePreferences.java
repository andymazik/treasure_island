package entities.prefs;

import entities.Organism;

import java.util.HashMap;
import java.util.Map;

public class GamePreferences {
    private Map<Organism, Fields> preferences = new HashMap<>();
    private static final GamePreferences instance = new GamePreferences();

    private GamePreferences(){
        initialize();
    }

    public void initialize(){
        preferences.put( Organism.PLANT, new Fields("Растение", "*", 1, 0, 0, 20, 0, 0));
        preferences.put( Organism.BEAR, new Fields("Медведь", " \uD83D\uDC3B", 460, 2, 500, 5, 2,80));
        preferences.put( Organism.EAGLE, new Fields("Орел", " \uD83E\uDD85",5.5, 3, 6, 2, 3, 1));
        preferences.put( Organism.FOX, new Fields("Лиса", " \uD83E\uDD8A", 7, 2, 8, 3, 2, 2));
        preferences.put( Organism.SNAKE, new Fields("Змея", " \uD83D\uDC0D", 13.5, 1, 15, 3, 1, 3));
        preferences.put( Organism.WOLF, new Fields("Волк", " \uD83D\uDC3A", 46, 3, 50, 3, 3, 8));
        preferences.put( Organism.CATERPILLAR, new Fields("Гусеница", " \uD83D\uDC1B", 0.01, 0, 0.01, 15, 0, 0));
        preferences.put( Organism.COW, new Fields("Корова", " \uD83D\uDC10", 650, 3, 700, 3, 3, 100));
        preferences.put( Organism.DEER, new Fields("Олень", " \uD83E\uDD8C", 275, 4, 300, 3, 4, 50));
        preferences.put( Organism.DUCK, new Fields("Утка", " \uD83E\uDD86", 0.92, 4, 1, 6, 4, 0.15));
        preferences.put( Organism.HAMSTER, new Fields("Хомяк", " \uD83D\uDC01", 1.75, 2, 2, 7, 2,0.45));
        preferences.put( Organism.HORSE, new Fields("Лошадь", " \uD83D\uDC0E", 370, 4, 400, 3, 4, 60));
        preferences.put( Organism.KENGOO, new Fields("Кенгуру", " \uD83D\uDC07", 275, 4, 300, 5, 4, 50));
        preferences.put( Organism.SHEEP, new Fields("Овца", " \uD83D\uDC11", 50, 3, 70, 14,3,20));
    }

    public static GamePreferences getInstance() {
        return instance;
    }

    public Map<Organism, Fields> getMap(){
        return instance.preferences;
    }

}
