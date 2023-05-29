import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionScreen extends World
{
    Label instructionLabel = new Label("The Elephant", 60);
    Label instructionLabel2 = new Label("Use \u2190 and \u2192 to Move", 30);
    Label instructionLabel3 = new Label("Press <Enter> to Start", 40);
    /**
     * Constructor for objects of class InstructionScreen.
     * 
     */
    public InstructionScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject(instructionLabel, getWidth()/2, 75);
        addObject(instructionLabel2, getWidth()/2, 250);
        addObject(instructionLabel3, getWidth()/2, 300);
        prepare();
        
        instructionLabel.setLineColor(Color.BLACK);
        instructionLabel2.setLineColor(Color.BLACK);
        instructionLabel2.setFillColor(Color.WHITE);
        instructionLabel3.setLineColor(Color.BLACK);
        instructionLabel3.setFillColor(Color.WHITE);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("Enter"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,300,175);
    }
}

