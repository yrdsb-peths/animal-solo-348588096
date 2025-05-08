import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartingScreen extends World
{
    Label titleLabel = new Label("Hungry Seahorse", 50); 
    /**
     * Constructor for objects of class StartingScreen.
     * 
     */
    public StartingScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, getHeight()/2); 
        prepare();
        setBackground("images/background.jpg");
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);

        }

    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        SeaHorse seaHorse = new SeaHorse();
        addObject(seaHorse,513,196);
        Label label = new Label("Press <space> to start", 40);
        addObject(label,getWidth()/2, getHeight()/2+60);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 30);
        addObject(label2,getWidth()/2, getHeight()/2+40);
        seaHorse.setLocation(291,135);
    }
}
