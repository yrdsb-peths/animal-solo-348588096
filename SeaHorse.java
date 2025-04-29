import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SeaHorse extends Actor
{
    public SeaHorse() {
        setImage("images/seahorse.png");
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        
        eat();
    }
    
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
        }
    }
}
