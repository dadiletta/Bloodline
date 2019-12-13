package app.monsters;

import java.util.List;

import app.items.Item;

public abstract class Monster {
    protected String name = "Monster";
    protected int health = 100;
    protected int strength = 100;
    protected int armor = 100;
    protected int dexterity = 100;


    public abstract void attack();

    public abstract void heal();

    public abstract List<Item> loot();

    public abstract boolean comply();

}


