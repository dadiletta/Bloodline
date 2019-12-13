package app.items;

public interface Item {

    // I DECLARE ALL ITEMS MUST IMPLEMENT THE FOLLOWING:
    
    public boolean active();

    public String name();

    public String description();

    public int powerRequired();

    public int durability();

    public int durability(int declination);

    public void useItem();

}