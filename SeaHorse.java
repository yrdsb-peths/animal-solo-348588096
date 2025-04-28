import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SeaHorse extends Actor
{
    /**
     * Act - do whatever the SeaHorse wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(1);
        }
        
        removeTouching(Apple.class);
    }
}
