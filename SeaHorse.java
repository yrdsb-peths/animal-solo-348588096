import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SeaHorse extends Actor
{
    GreenfootSound seahorseSound = new GreenfootSound("seahorse.mp3");
    GreenfootImage[] idle = new GreenfootImage[4];
    public SeaHorse() {
        for(int i=0 ; i<idle.length ; i++)
        {
            idle[i] = new GreenfootImage("images/idle" + i +".png"); 
        }
        setImage(idle[0]);
    }
    
    int imageIndex = 0; 
    public void animateSeahorse()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
        
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
        animateSeahorse();
    }
    
    public void eat(){
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            seahorseSound.play();
        }
    }
}
