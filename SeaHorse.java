import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class SeaHorse extends Actor
{
    GreenfootSound seahorseSound = new GreenfootSound("seahorse.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[4];
    GreenfootImage[] idleLeft = new GreenfootImage[4];
    
    SimpleTimer animationTimer = new SimpleTimer();
    String facing = "right";
    
    public SeaHorse() {
        for(int i=0 ; i<idleRight.length ; i++)
        {
            idleRight[i] = new GreenfootImage("images/idle" + i +".png");
            idleRight[i].scale(100,50);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/idle" + i +".png");
            idleLeft[i].mirrorHorizontally(); 
            idleLeft[i].scale(100,50);
        }
        
        setImage(idleRight[0]);
        animationTimer.mark();
    }
    
    int imageIndex = 0; 
  
    
    public void animateSeahorse()
    {
        if (animationTimer.millisElapsed()< 1)
        {
            return ;
        }
        
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else 
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
            
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-5);
            facing = "left";
        }
        else if(Greenfoot.isKeyDown("right")){
            move(5);
            facing = "right";
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
