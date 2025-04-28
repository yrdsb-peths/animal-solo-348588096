import greenfoot.*;

public class MyWorld extends World {
    
    public int score = 0;
    Label scoreLabel;
    
    public MyWorld() {
        super(600, 400, 1);
        
        SeaHorse seahorse = new SeaHorse();
        addObject(seahorse,300,200);
        
        scoreLabel = new Label(0,50);
        addObject(scoreLabel,30,30);
        
        createApple();
        
    }
    
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
    }
    
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple,x,0);
    }
}
