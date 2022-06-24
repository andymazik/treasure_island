package entities;

import entities.prefs.Fields;
import field.Cell;
import field.GameField;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Animal {
    //private final static long idCounter = 0;
    //private final long id = idCounter + 1;

//    private String name;
//    private String icon;
//    private double weight;
//    private int velocity;
//    private Limit limit;

    private final String name;
    private final String icon;
    private final double startWeight;
    private final int velocity;
    private final double maxWeight;
    private final int maxCount;
    private final int maxSpeed;
    private final double maxFood;

    public Animal(Fields fields) {
        this.name = fields.getName();
        this.icon = fields.getIcon();
        this.startWeight = fields.getStartWeight();
        this.velocity = fields.getVelocity();
        this.maxWeight = fields.getMaxWeight();
        this.maxCount = fields.getMaxCount();
        this.maxSpeed = fields.getMaxSpeed();
        this.maxFood = fields.getMaxFood();
    }

    //    public Animal(String name, String icon, double weight, int velocity, Limit limit) {
//        this.name = name;
//        this.icon = icon;
//        this.weight = weight;
//        this.velocity = velocity;
//        this.limit = limit;
//    }

    public boolean move(Cell cell){
        int direction = ThreadLocalRandom.current().nextInt(0,4);
        int newRow = cell.getRow() + ThreadLocalRandom.current().nextInt(0, velocity);
        int newCol = cell.getCol() + ThreadLocalRandom.current().nextInt(0, velocity);

        if (newRow > 29) {
            newRow %= 29;
        }
        if (newCol > 29) {
            newCol %= 29;
        }


        boolean isMove = false;
        if (direction != 0){
            GameField.field[newRow][newCol].sets.get(Organism.valueOf(this.getClass().getSimpleName().toUpperCase())).add(this);
            isMove = true;
        }
        return isMove;
    }
    public abstract void multiply();

    @Override
    public String toString() {
        //return name + icon;
        return icon;
    }
}
