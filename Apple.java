import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Food for our Seahorse 
 * 
 * @author (Veznu) 
 * @version (04/28/2024)
 */
public class Apple extends Actor
{
    public void act()
    {
        setLocation(getX(), getY()+1);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
