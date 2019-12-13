package app;

// JAVA IMPORTS
import java.util.ArrayList;
import java.util.List;
// LOCAL IMPORTS
import app.monsters.Monster;
import app.items.Item;

public class Level {
    // INSTANCE VARIABLES
    private ArrayList<Monster> monsters = new ArrayList<Monster>();
    private int difficulty = 0; // default value

    // CONSTRUCTOR

    // UTILITIES
    public List<Item> itemSearch(){
        ArrayList<Item> found = new ArrayList<Item>();
        // TODO: based on the diffuculty of the level, random chance to find loot
        return found;

    }

    /**
     * The computer's turn to attack / heal
     */
    public void monsterTurn(){

    }

}