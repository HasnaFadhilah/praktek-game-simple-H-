import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backgrnd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backgrnd extends World
{

    /**
     * Constructor for objects of class backgrnd.
     * 
     */
    public backgrnd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        addObject(new kangguru (),20,200);
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        roti roti = new roti();
        addObject(new roti (),312,101);
        removeObject(roti);
        addObject(new roti (),100,215);
        removeObject(roti);

        roti roti3 = new roti();
        addObject(new roti (),406,260);
        removeObject(roti3);
        addObject(new roti (),220,300);
        removeObject(roti);
        addObject(new roti (),500,80);
        removeObject(roti);

        addObject(new score (),70,80);

        bola bola = new bola();
        addObject(bola,429,46);
        bola.setRotation(90);
    }
}
