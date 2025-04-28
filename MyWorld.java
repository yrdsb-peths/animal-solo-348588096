import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        SeaHorse seahorse = new SeaHorse();
        addObject(seahorse,300,200);
        
        Label scoreLabel = new Label(0,20);
        addObject(scoreLabel,20,10);
        
        createApple();
        
    }
    
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple,x,0);
    }
}
