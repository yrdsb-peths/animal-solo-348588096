import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Food for our Seahorse 
 * 
 * @author (Veznu) 
 * @version (04/28/2024)
 */
public class Apple extends Actor
{
    public Apple() {
        setImage("images/apple1.png");    
    }
    
    int speed = 1; 
    
    public void act()
    {
        setLocation(getX(), getY() + speed);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight())
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }    
}
