package app;

import java.util.ArrayList;
import java.util.List;
import app.items.*;
import app.monsters.*;


public class Player {
    // instance variables
    private String name; // encaspulate the fool
    private int health;
    private int maxHealth;
    private int power;
    private int maxPower;
    
    public List<Level> levels = new ArrayList<Level>();
    public List<Item> items = new ArrayList<Item>();
    public List<Monster> minions = new ArrayList<Monster>();

    // constructor(s)
    public Player(String name){
        this.name = name;
        maxHealth = 100;
        health = maxHealth;
        // TODO: test to see what power level is a fair start
        maxPower = 10;
        power = maxPower;
    }

    // accessors / mutators ? 
    public String name(){
        return name;
    }
    
    public int health(){
        return health;
    }

    public int power(){
        return power;
    }

    public int maxHealth(){
        return maxHealth;
    }

    public int maxPower(){
        return maxPower;
    }

    // utilities
    public void fullHeal(){
        System.out.println("FULL HEAL! Go forth, hero");
        health = maxHealth;
    }

    public void fullPower(){
        System.out.println("FULL POWER! Get to wreckin'"); 
        power = maxPower;
    }

    public void heal(){
        // TODO: How much do I heal?
    }

    public void attack(Monster m){
        // TODO: how do I attack?
    }

    public void upgrade(){
        // TODO: upgrade health or power by a certain amount? 
    }

    public List<Item> getActiveItems(){
        List<Item> activeItems = new ArrayList<Item>();
        for(Item i : items){
            if(i.active()) activeItems.add(i);
        }
        return activeItems;
    }

}