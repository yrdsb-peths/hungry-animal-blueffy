import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen.
 * 
 * @author (Ashkan) 
 * @version (May 2023)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space"))
        {
            InstructionScreen instructionWorld = new InstructionScreen();
            Greenfoot.setWorld(instructionWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,214,330);
        Label continueLabel = new Label("Press <Space> to Continue", 20);
        addObject(continueLabel,409,272);
        continueLabel.setLocation(397,252);
        continueLabel.setLocation(386,251);
        continueLabel.setLocation(375,247);
        continueLabel.setLocation(375,248);
        continueLabel.setLineColor(Color.BLACK);
        continueLabel.setFillColor(Color.GREEN);
    }
}
